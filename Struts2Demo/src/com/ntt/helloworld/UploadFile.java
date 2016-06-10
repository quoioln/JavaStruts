package com.ntt.helloworld;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class UploadFile extends ActionSupport {

	private File myFile;
	private String myFileContentType;
	private String myFileFileName;
	private String destPath;
	
	public String execute() {
		destPath = "F:/soft/upload/";
		try {
			System.out.println("Src File name: " + myFile);
	     	System.out.println("Dst File name: " + myFileFileName);
			File destFile = new File(destPath, myFileFileName);
			FileUtils.copyFile(myFile, destFile);
		} catch (IOException e){
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}

	/**
	 * @return the myFile
	 */
	public final File getMyFile() {
		return myFile;
	}

	/**
	 * @param myFile the myFile to set
	 */
	public final void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	/**
	 * @return the myFileContentType
	 */
	public final String getMyFileContentType() {
		return myFileContentType;
	}

	/**
	 * @param myFileContentType the myFileContentType to set
	 */
	public final void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}

	/**
	 * @return the myFileFileName
	 */
	public final String getMyFileFileName() {
		return myFileFileName;
	}

	/**
	 * @param myFileFileName the myFileFileName to set
	 */
	public final void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}

	/**
	 * @return the destPath
	 */
	public final String getDestPath() {
		return destPath;
	}

	/**
	 * @param destPath the destPath to set
	 */
	public final void setDestPath(String destPath) {
		this.destPath = destPath;
	}

	
}
