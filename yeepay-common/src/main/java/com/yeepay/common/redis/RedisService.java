package com.yeepay.common.redis;

import org.springframework.data.redis.core.ZSetOperations.TypedTuple;

import java.util.List;
import java.util.Set;

public interface RedisService {
	public boolean set(String key, String value);

	public boolean set(String key, String value, long seconds);

	public String get(String key);

	public boolean expire(String key, long expire);

	public <T> boolean setList(String key, List<T> list);

	public <T> List<T> getList(String key, Class<T> clz);

	public long lpush(String key, Object obj);

	public long rpush(String key, Object obj);

	public String lpop(String key);

	public boolean lockExp(String key, String value, long seconds);

	public void convertAndSend(String channel, String message);

	public boolean addZSetSort(String key, String value, long score);

	public long addZSetSortWithScore(String key, Set<TypedTuple<String>> set);

	public Set<TypedTuple<String>> getZSetSortWithScore(String key, long start, long end);

	public long removeZSetSortWithScore(String key, long start, long end);


}
