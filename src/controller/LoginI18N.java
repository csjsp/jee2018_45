package controller;

import static java.lang.System.out;


import java.util.*;

import com.opensymphony.xwork2.ActionSupport;

public class LoginI18N extends ActionSupport {
  private String username,pass;
  private double java;
  private String type;
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getPass() {
    return pass;
  }
  public void setPass(String pass) {
    this.pass = pass;
  }
  public double getJava() {
    return java;
  }
  public void setJava(double java) {
    this.java = java;
  }
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  @Override public void validate(){
    if(username.isEmpty()){
      addFieldError("username",getText("username.empty"));      
    }    
    if(pass.isEmpty()){      
      addFieldError("pass",getText("pass.empty"));
    }
  }  
  @Override public String execute(){
    if(username.equals("admin")){
     //String[] args=new String[]{username,""+java};
     List args=new ArrayList();
     args.add(username);args.add(java);
     System.out.println(getText("stu.info",args)); 
     return type;//forward,redirect
    }else {
      addActionError(getText("login.fail"));
      return "fail"; 
    }
  }
    
}
