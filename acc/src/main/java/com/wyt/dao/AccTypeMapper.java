package com.wyt.dao;

import java.util.List;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wyt.pojo.AccType;
@Transactional(propagation=Propagation.REQUIRES_NEW,readOnly=false,isolation=Isolation.DEFAULT)
public interface AccTypeMapper {
    int deleteByPrimaryKey(Integer acctype_id);

    int insert(AccType record);

    int insertSelective(AccType record);

    AccType selectByPrimaryKey(Integer acctype_id);

    int updateByPrimaryKeySelective(AccType record);

    int updateByPrimaryKey(AccType record);
    
    List<AccType> selectAll();
}