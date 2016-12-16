package com.wyt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wyt.dao.AccTypeMapper;
import com.wyt.pojo.AccType;
import com.wyt.service.AccTypeService;

@Service
public class AccTypeServiceImpl implements AccTypeService {

	@Autowired
	@Qualifier("accTypeMapper")
	private AccTypeMapper accTypeMapper;
	
	@Override
	public List<AccType> getAll() {
		List<AccType> list = accTypeMapper.selectAll();
		return list;
	}

}
