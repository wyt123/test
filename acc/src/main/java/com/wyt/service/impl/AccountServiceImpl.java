package com.wyt.service.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wyt.dao.AccountCusMapper;
import com.wyt.dao.AccountMapper;
import com.wyt.pojo.Account;
import com.wyt.pojo.AccountCus;
import com.wyt.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	@Qualifier("accountMapper")
	private AccountMapper accountMapper;

	@Autowired
	@Qualifier("accountCusMapper")
	private AccountCusMapper accountCusMapper;
	
	@Override
	public int insertSelective(Account account) {
		//System.out.println("service");
		return accountMapper.insertSelective(account);
	}

	@Override
	public List<AccountCus> selectAll1() {
		List<AccountCus> list = accountCusMapper.selectAll();
		return list;
	}
	
	public Map<Character, String> getStatus() {
		Map<Character, String> statusOptions = new LinkedHashMap<Character, String>();
		statusOptions.put('1', "¿ªÆô");
		statusOptions.put('0', "·â±Õ");
		return statusOptions;
	}

	@Override
	public int deleteById(String id) {
		int result = 0;
		if(id!=null||id.length()>0){
			 int pk = Integer.parseInt(id);
			 result = accountMapper.deleteByPrimaryKey(pk);
		}
		return result;
	}

	@Override
	public Account selectById(String id) {
		Account acc = null;
		if(id!=null||id.length()>0){
			 int pk = Integer.parseInt(id);
			 acc = accountMapper.selectByPrimaryKey(pk);
		}
		return acc;
	}

	@Override
	public int updateById(Account account) {
		int result = 0;
		result = accountMapper.updateByPrimaryKeySelective(account);
		return result;
	}

	@Override
	public int changeSta(Integer id) {
		int result = 0;
		result = accountMapper.updateSta(id);
		return result;
	}

	@Override
	public List<Account> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
