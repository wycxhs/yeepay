package com.yeepay.service.merchantNoDb;

import com.yeepay.dao.merchantCopy.domain.MerchantCopy;
import com.yeepay.dao.merchantCopy.domain.MerchantCopyExample;
import com.yeepay.dao.merchantCopy.mapper.MerchantCopyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantNoDb {

    @Autowired
    MerchantCopyMapper merchantCopyMapper;

    @Autowired
    MerchantCopyExample example;

    public String merchantNo(String merchantNo){
        example.createCriteria().andMerchantNoEqualTo(merchantNo);
        List<MerchantCopy> list = merchantCopyMapper.selectByExample(example);
        return list.get(0).getMerchantNoCopy();
    }
    public String key(String merchantNo){
        example.createCriteria().andMerchantNoEqualTo(merchantNo);
        List<MerchantCopy> list = merchantCopyMapper.selectByExample(example);
        return list.get(0).getKey();
    }
    public String merchantNoCopy(String merchantNoCopy){
        example.createCriteria().andMerchantNoCopyEqualTo(merchantNoCopy);
        List<MerchantCopy> list = merchantCopyMapper.selectByExample(example);
        return list.get(0).getMerchantNo();
    }
}
