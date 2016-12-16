package com.wyt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.wyt.pojo.AccType;
import com.wyt.pojo.Account;
import com.wyt.pojo.AccountCus;
import com.wyt.service.AccTypeService;
import com.wyt.service.AccountService;

@Controller
//@RequestMapping("/account")  相当于与controller的跟路径，要与下面方法的map相加
public class AccountController {

	@Autowired
	private AccountService accountService;
	@Autowired
	private AccTypeService accTypeService;
	
    @RequestMapping(value="new",method={RequestMethod.POST})
    public ModelAndView insert(Account account){
    //	System.out.println(account.getAcctype().getAcctype_id());
    	accountService.insertSelective(account);
        ModelAndView mav=new ModelAndView();
        mav.setViewName("new");
        mav.addObject("account",account);
        return mav;
    }
    
    //@RequestMapping(value="listAll") 返回一个ModelAndView
    public ModelAndView listAll(){
    	List<AccountCus> list = accountService.selectAll1();
    	Map<Character,String> status = accountService.getStatus();
    	//System.out.println(list.get(1).getAcctype().getAcctype_id());
    	if(list.size()<=0){
    		System.out.println("没取到");
    	}
    	ModelAndView mav=new ModelAndView();
        mav.setViewName("listAll");
        mav.addObject("list",list);
        mav.addObject("status",status);
        return mav;
    }

    @RequestMapping("listAll") //返回一个String
    public String listAll1(Model model){
    	List<AccountCus> list = accountService.selectAll1();
    	Map<Character,String> status = accountService.getStatus();
    	if(list.size()<=0){
    		System.out.println("没取到");
    	}
    	model.addAttribute("list", list);
    	model.addAttribute("status", status);
    	return "listAll";
    }
    
    //currentPage当前页 perPageRow一页多少条记录 
   // @RequestMapping("listAll")
    public String listAll2(){
    	return "listAll";
    }
    
    @RequestMapping(value="insert")
    public ModelAndView insert(){
    	List<AccType> typeList = accTypeService.getAll();
    	System.out.println(typeList.size());
    	ModelAndView mav=new ModelAndView();
        mav.setViewName("insert");
        mav.addObject("typeList", typeList);
        System.out.println("123");
        return mav;
    }
    
    @RequestMapping(value="delete")
    public ModelAndView delete(String id){
    	accountService.deleteById(id);
    	//从定向
    	RedirectView mav=new RedirectView("listAll");
    	return new ModelAndView(mav);
    }
    
    @RequestMapping(value="accdetail")
    public ModelAndView accdetail(String id){
    	System.out.println(id);
    	Account account = accountService.selectById(id);
    	System.out.println(account.getName());
    	ModelAndView mav = new ModelAndView();
    	mav.setViewName("accdetail");
    	mav.addObject("account",account);
    	return mav;
    }
    
    @RequestMapping(value="update")
    public ModelAndView update(Account account,Integer acc_id){
    	System.out.println(acc_id+"get it");
    	//account.setId(Integer.valueOf(id));
    	AccType acctype = new AccType();
    	acctype.setAcctype_id(acc_id);
    //	account.setAcctype(acctype);
    	accountService.updateById(account);
    	ModelAndView mav = new ModelAndView();
    	mav.setViewName("updatesuccess");
    	mav.addObject("account",account);
    	return mav;
    }
    
    @RequestMapping(value="upsta")
    public ModelAndView updatestatus(Integer id){
    	accountService.changeSta(id);
    	RedirectView rdv = new RedirectView("listAll");
    	return new ModelAndView(rdv);
    }
}
