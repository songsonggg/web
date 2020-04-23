package com.example.web.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.example.web.pojo.MmallCart;
/**
*  @author SongsongWang
*/

public interface MmallCartBaseMapper {

    int insertMmallCart(MmallCart object);

    int updateMmallCart(MmallCart object);

    int update(MmallCart.UpdateBuilder object);

    List<MmallCart> queryMmallCart(MmallCart object);

    MmallCart queryMmallCartLimit1(MmallCart object);

}