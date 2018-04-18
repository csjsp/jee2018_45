package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.util.*;
public class MyAction extends ActionSupport {
  Date date;

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
  
}
