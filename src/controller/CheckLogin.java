package controller;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.*;

public class CheckLogin extends ActionSupport {
   String pass;
   String username;
   public void setPass(String _pass){
	   this.pass=_pass;
	   System.out.println(this.pass);
   }
   public String getPass(){return this.pass;}
	
	public void setUsername(String username) {
		this.username = username;
		System.out.println(this.username);
	}
	public String getUsername() {
		return username;
	}
	@Override public void validate(){
		if(username.isEmpty()){
			addFieldError("username","没有输入用户名");			
		}
		if(pass.isEmpty()){
			addFieldError("pass","没有输入密码。");
		}
	}
	
	
	
	@Override public String execute(){
		 if("admin".equals(username)){
		   Map session=ActionContext.getContext().getSession();
		   session.put("username", username);
		   return "suc";//自定义指向的页面
		 }else
			 return "fail";
	}
	 public String checkInDb()throws Exception{
		 StuDAO dao=new StuDAOImp();
		 boolean isHave=dao.check(username);
		 if(isHave){
		   Map session=ActionContext.getContext().getSession();
		   session.put("username", username);
		   return "suc";//自定义指向的页面
		 }else
			 return "fail";
	}
}
