package com.yeepay.common.redis;

import com.yeepay.common.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.data.redis.core.ZSetOperations.TypedTuple;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Service
public class RedisServiceImpl implements RedisService {
	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	@Override
	public boolean set(final String key, final String value) {
		boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
				connection.set(serializer.serialize(key), serializer.serialize(value));
				return true;
			}
		});
		return result;
	}

	public String get(final String key) {
		String result = redisTemplate.execute(new RedisCallback<String>() {
			@Override
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
				byte[] value = connection.get(serializer.serialize(key));
				return serializer.deserialize(value);
			}
		});
		return result;
	}

	@Override
	public boolean expire(final String key, long expire) {
		return redisTemplate.expire(key, expire, TimeUnit.SECONDS);
	}

	@Override
	public <T> boolean setList(String key, List<T> list) {
		String value = JsonUtils.toJson(list);
		return set(key, value);
	}

	@Override
	public <T> List<T> getList(String key, Class<T> clz) {
		String json = get(key);
		if (json != null) {
			List<T> list = JsonUtils.toList(json, clz);
			return list;
		}
		return null;
	}

	@Override
	public long lpush(final String key, Object obj) {
		final String value = JsonUtils.toJson(obj);
		long result = redisTemplate.execute(new RedisCallback<Long>() {
			@Override
			public Long doInRedis(RedisConnection connection) throws DataAccessException {
				RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
				long count = connection.lPush(serializer.serialize(key), serializer.serialize(value));
				return count;
			}
		});
		return result;
	}

	@Override
	public long rpush(final String key, Object obj) {
		final String value = JsonUtils.toJson(obj);
		long result = redisTemplate.execute(new RedisCallback<Long>() {
			@Override
			public Long doInRedis(RedisConnection connection) throws DataAccessException {
				RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
				long count = connection.rPush(serializer.serialize(key), serializer.serialize(value));
				return count;
			}
		});
		return result;
	}

	@Override
	public String lpop(final String key) {
		String result = redisTemplate.execute(new RedisCallback<String>() {
			@Override
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
				byte[] res = connection.lPop(serializer.serialize(key));
				return serializer.deserialize(res);
			}
		});
		return result;
	}

	@Override
	public boolean set(String key, String value, long seconds) {
		boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
				connection.set(serializer.serialize(key), serializer.serialize(value));
				connection.expire(serializer.serialize(key), seconds);
				return true;
			}
		});
		return result;
	}

	@Override
	public boolean lockExp(String key, String value, long seconds) {
		if (redisTemplate.getConnectionFactory().getConnection().setNX(key.getBytes(), value.getBytes())) {
			redisTemplate.expire(key, seconds, TimeUnit.SECONDS);
			return true;
		}
		return false;
	}

	@Override
	public void convertAndSend(String channel, String message) {
		this.redisTemplate.convertAndSend(channel, message);
	}

	@Override
	public boolean addZSetSort(String key, String value, long score) {
		return this.redisTemplate.opsForZSet().add(key, value, score);
	}

	@Override
	public Set<TypedTuple<String>> getZSetSortWithScore(String key, long start, long end) {
		ZSetOperations<String, String> vo = this.redisTemplate.opsForZSet();
		Set<TypedTuple<String>> tuples = vo.rangeByScoreWithScores(key, start, end);
		return tuples;
	}

	@Override
	public long removeZSetSortWithScore(String key, long start, long end) {
		ZSetOperations<String, String> vo = this.redisTemplate.opsForZSet();
		return vo.removeRangeByScore(key, start, end);
	}

	@Override
	public long addZSetSortWithScore(String key, Set<TypedTuple<String>> tuples) {
		ZSetOperations<String, String> vo = this.redisTemplate.opsForZSet();
		Long result = vo.add(key, tuples);
		return result;
	}

}
