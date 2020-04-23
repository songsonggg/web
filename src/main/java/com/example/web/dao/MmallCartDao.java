package com.example.web.dao;

import com.example.web.mapper.MmallCartMapper;
import com.example.web.mapper.base.MmallCartBaseMapper;
import com.example.web.pojo.MmallCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MmallCartDao {
    @Autowired
    MmallCartBaseMapper mmallCartBaseMapper;

    public List<MmallCart> getAllCart(){
        MmallCart queryBuilder = MmallCart.QueryBuild().fetchAll().build();
        return mmallCartBaseMapper.queryMmallCart(queryBuilder);
    }

    public MmallCart emptyCart(){
        MmallCart empty = MmallCart.Build().id(1).build();
        return empty;
    }

    public int updateCartQuantity(int quantity){
        MmallCart quantityCart = MmallCart.Build().quantity(quantity).build();
        MmallCart.ConditionBuilder condition = MmallCart.ConditionBuild().idList(126).build();
        MmallCart.UpdateBuilder updateBuilder = MmallCart.UpdateBuild().set(quantityCart).where(condition).build();
        return mmallCartBaseMapper.update(updateBuilder);
    }
}
