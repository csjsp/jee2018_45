package controller;

import java.io.*;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownFile extends ActionSupport {
   String contentType,fileName,path;
   
   public String getContentType() {
	return contentType;
}
public void setContentType(String contentType) {
	this.contentType = contentType;
}
public String getFileName(){
	return fileName;
}
public void setFileName(String fileName) {
	this.fileName = fileName;
}
public String getPath() {
	return path;
}
public void setPath(String path) {
	this.path = path;
}
public InputStream getTxtStream(){
	return new ByteArrayInputStream("helloworld".getBytes());   
   }
   public InputStream getFileStream(){
	   return ServletActionContext.getServletContext()
	   .getResourceAsStream("/"+path);
   }
   public InputStream getStruts(){
	   return getClass().getResourceAsStream("/strut.xml");
   }
   String cnFileName;
   public String getCnFileName(){
	   return cnFileName;
   }
   public String execute()throws Exception{
	   this.cnFileName=new String(fileName.getBytes(),"iso-8859-1");
	   return SUCCESS;
   }
}
