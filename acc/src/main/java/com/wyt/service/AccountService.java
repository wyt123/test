package com.wyt.service;

import java.util.List;
import java.util.Map;

import com.wyt.pojo.Account;
import com.wyt.pojo.AccountCus;

public interface AccountService {
	
	int insertSelective(Account account);
	List<Account> selectAll();
	List<AccountCus> selectAll1();
	Map<Character, String> getStatus();
	int deleteById(String id);
	Account selectById(String id);
	int updateById(Account account);
	int changeSta(Integer id);
}
