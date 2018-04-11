package controller;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Logout extends ActionSupport {
	@Override
	public String execute() {
		Map session = ActionContext.getContext().getSession();
		session.remove("username");
		return SUCCESS;
	}
}
