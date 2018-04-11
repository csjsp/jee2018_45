package controller;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.StuDAO;
import dao.StuDAOImp;
import domain.Stu;

public class StuAction extends ActionSupport {
	List<String[]> stus;
  private List<Stu> stusByObj;

	public List<String[]> getStus() {
		return stus;
	}

	public List<Stu> getStusByObj() {
    return stusByObj;
  }

  public String execute() throws Exception {
		StuDAO dao = new StuDAOImp();
		stus = dao.getAllStus();
		getAllStusByObj();
		return SUCCESS;
	}
	public void getAllStusByObj()throws Exception {
	  StuDAO dao=new StuDAOImp();
	  stusByObj=dao.getAllStusByObj();	  
	}
}
