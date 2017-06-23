package com.ssm.action;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.ssm.dao.UserDao;
import com.ssm.pojo.User;
/**
 * @author Administrator
 */
@Controller
public class UserAction3 {
	@Autowired
	private UserDao userDao;
	 @RequestMapping("/queryUser")
	 public  ModelAndView queryUser(){
			List<User> list=userDao.queryUser();
			ModelAndView   mv=new ModelAndView();
			mv.addObject("userList", list);
			mv.setViewName("usershow");
			return mv ;
	 }
	 @RequestMapping("/getUserById")
	 public   ModelAndView   getUserById(Integer id){
		 User user=userDao.getUserById(id);
		 ModelAndView   mv=new ModelAndView();
		 mv.addObject("user",user);
		 mv.setViewName("user");
		 return  mv;
	 }
	 
	 @RequestMapping("/updateUser")
	 public  String   updateUser(User user){
		 userDao.updateUser(user);
		 return "redirect:queryUser.action";
	 }
	 
	 @RequestMapping("/deleteUser")
	 public  String  deleteUser(Integer[] ids){
		 for(Integer id:ids){
			 userDao.deleteUser(id);
		 }
		 return "redirect:queryUser.action";
		 
	 }
	 @RequestMapping("/addUser")
	 public String  addUser(HttpServletRequest req , @Validated User user ,BindingResult  br){
		 if(br.hasErrors()){
			List<ObjectError>  allErrors= br.getAllErrors();
			 req.setAttribute("allErrors", allErrors);
			 return "adduser";
		 }
		 userDao.addUser(user);
		 return "redirect:queryUser.action";
	 }
	 @RequestMapping("/showadd")
	 public String  showadd(){
		 return "adduser";
	 }
	 
}
