package com.ssm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.ssm.pojo.User;
@Controller
public class UserDao {
 private List<User> list=new ArrayList<>();
	
 public  UserDao(){
		User u1=new User();
		u1.setId(1);
		u1.setName("张三");
		u1.setPwd("admin");
		
		User u2=new User();
		u2.setId(2);
		u2.setName("曹操");
		u2.setPwd("admin");
		
		
		User u3=new User();
		u3.setId(3);
		u3.setName("小红");
		u3.setPwd("admin");
		
		
		User u4=new User();
		u4.setId(4);
		u4.setName("小明");
		u4.setPwd("admin");
		
		
		User u5=new User();
		u5.setId(5);
		u5.setName("王五");
		u5.setPwd("admin");
		
		
		User u6=new User();
		u6.setId(6);
		u6.setName("李四");
		u6.setPwd("admin");
		
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		list.add(u5);
		list.add(u6);
 }	
 
 public   List<User>  queryUser(){
	 return list;
 }
 
 
 public  User  getUserById(int id){
	 for (int i = 0; i < list.size(); i++) {
			User e = list.get(i);
			if(e.getId().equals(id)){
				return e;
			}
		}
		return null;
 }
	
	public  void  updateUser(User user){
		 for (int i = 0; i < list.size(); i++) {
				User e = list.get(i);
				if(e.getId().equals(user.getId())){
					list.set(i, user);
					break;
				}
			}
	}
	
	public  void  deleteUser(User user){
		 for (int i = 0; i < list.size(); i++) {
				User e = list.get(i);
				if(e.getId().equals(user.getId())){
					list.remove(i);
					break;
				}
			}
	}
	
	
}
