package com.ssm.action;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	 
	 
}
