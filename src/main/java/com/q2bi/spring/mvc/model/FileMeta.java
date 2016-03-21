package com.q2bi.spring.mvc.model;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.joda.time.DateTime;

@JsonIgnoreProperties({"bytes"})
public class FileMeta {

	private String fileName;
	private String fileSize;
	private String fileType;
	private String fileLink;
	private String fileStatus;
	private DateTime fileDateTime;
	//private String fileChangeTime;
	private byte[] bytes;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public byte[] getBytes() {
		return bytes;
	}
	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}
	public String getFileLink() {
		return fileLink;
	}
	public void setFileLink(String fileLink) {
		this.fileLink = fileLink;
	}
	public String getFileStatus(){
		return fileStatus;
	}
	public String setFileStatus(String fileStatus){
		this.fileStatus = fileStatus;
		return fileStatus;
	}
	public String getFileDateTime() {
		return fileDateTime.toLocalDateTime().toDate().toLocaleString();
	}
	public void setFileDateTime(DateTime fileDateTime) {
		this.fileDateTime = fileDateTime;
	}

}
