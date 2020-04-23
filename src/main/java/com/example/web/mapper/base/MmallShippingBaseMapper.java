package com.example.web.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.example.web.pojo.MmallShipping;
/**
*  @author SongsongWang
*/
public interface MmallShippingBaseMapper {

    int insertMmallShipping(MmallShipping object);

    int updateMmallShipping(MmallShipping object);

    int update(MmallShipping.UpdateBuilder object);

    List<MmallShipping> queryMmallShipping(MmallShipping object);

    MmallShipping queryMmallShippingLimit1(MmallShipping object);

}