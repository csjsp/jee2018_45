package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.apache.struts2.ServletActionContext;
public class FileUpload extends ActionSupport {
   File upload;
   String uploadContentType;
   String uploadFileName;
public File getUpload() {
	return upload;
}
public void setUpload(File upload) {
	this.upload = upload;
}
public String getUploadContentType() {
	return uploadContentType;
}
public void setUploadContentType(String uploadContentType) {
	this.uploadContentType = uploadContentType;
}
public String getUploadFileName() {
	return uploadFileName;
}
public void setUploadFileName(String uploadFileName) {
	this.uploadFileName = uploadFileName;
}
@Override public String execute()throws IOException{
	String path=ServletActionContext
 			.getServletContext().getRealPath("/upload");
	File destFile=new File(path,uploadFileName);
	Files.copy(upload.toPath(), destFile.toPath(),
			StandardCopyOption.REPLACE_EXISTING);
	return SUCCESS;
	
}
   
}
