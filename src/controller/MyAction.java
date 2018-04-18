package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.util.*;
public class MyAction extends ActionSupport {
  String username;//Í¨¹ýform¸³Öµ
  
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  Date date;

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
  
}
