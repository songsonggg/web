package com.example.web.dao;

import com.example.web.mapper.base.MmallShippingBaseMapper;
import com.example.web.pojo.MmallCart;
import com.example.web.pojo.MmallShipping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MmallShippingDao {
    @Autowired
    MmallShippingBaseMapper mmallShippingBaseMapper;

    public Integer updateRecieverPhone(String phoneNumber){
        MmallShipping updateShipping = MmallShipping.Build().receiverPhone(phoneNumber).build();
        MmallShipping.ConditionBuilder condition = MmallShipping.ConditionBuild().idList(4).build();
        MmallShipping.UpdateBuilder updateBuilder = MmallShipping.UpdateBuild().set(updateShipping).where(condition).build();
        return mmallShippingBaseMapper.update(updateBuilder);
    }
}
