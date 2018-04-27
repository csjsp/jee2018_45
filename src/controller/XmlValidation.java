package controller;

import com.opensymphony.xwork2.ActionSupport;

public class XmlValidation extends ActionSupport {
  int test_int;
  double test_double;
  String test_stringlength;
  String pass,repass;
  public int getTest_int() {
    return test_int;
  }

  public void setTest_int(int test_int) {
    this.test_int = test_int;
  }

  public double getTest_double() {
    return test_double;
  }

  public void setTest_double(double test_double) {
    this.test_double = test_double;
  }

  public String getTest_stringlength() {
    return test_stringlength;
  }

  public void setTest_stringlength(String test_stringlength) {
    this.test_stringlength = test_stringlength;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public String getRepass() {
    return repass;
  }

  public void setRepass(String repass) {
    this.repass = repass;
  }
  
}
