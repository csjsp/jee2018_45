package controller;

import com.opensymphony.xwork2.ActionSupport;

import domain.Stu;

public class CheckLoginByObj extends ActionSupport {
	Stu stu;

	public Stu getStu() {
		return stu;
	}

	public void setStu(Stu stu) {
		this.stu = stu;
	}
	@Override public void validate(){
		if(this.stu.getUsername().isEmpty()){
			addFieldError("stu.username","没有输入用户名");			
		}
		if(stu.getPass().isEmpty()){
			addFieldError("stu.pass","没有输入密码");
		}		
	}
	@Override public String execute(){
		if("admin".equals(stu.getUsername())){
			return SUCCESS;
		}else return "fail";
		
	}
}
