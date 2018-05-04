package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.apache.struts2.ServletActionContext;
public class FilesUpload extends ActionSupport {
	File[] uploads;
	String[] uploadsContentType;
	String[] uploadsFileName;
	
   public File[] getUploads() {
		return uploads;
	}

	public void setUploads(File[] uploads) {
		this.uploads = uploads;
	}

	public String[] getUploadsContentType() {
		return uploadsContentType;
	}

	public void setUploadsContentType(String[] uploadsContentType) {
		this.uploadsContentType = uploadsContentType;
	}

	public String[] getUploadsFileName() {
		return uploadsFileName;
	}

	public void setUploadsFileName(String[] uploadsFileName) {
		this.uploadsFileName = uploadsFileName;
	}
   
}
