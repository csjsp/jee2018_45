package controller;

import com.opensymphony.xwork2.ActionSupport;

public class Compute extends ActionSupport {
	int num1;
	int num2;
	int sum;

	public int getSum() {
		return sum;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	@Override public String execute(){
			sum = this.num1+this.num2;
			return "success";
		}
}
