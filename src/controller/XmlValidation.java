package controller;

import com.opensymphony.xwork2.ActionSupport;

public class XmlValidation extends ActionSupport {
  int test_int;
  double test_double;

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
  
}
