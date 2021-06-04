package com.LearnersPrjct;

public class Student {
	
	private int studentid;
	private String studentname;
	private int sclass;
	private int class_id;
	private String parentcontact;
	private String parentname;
	private String address;
	
	
	public Student() 
	{
		
	}
	


	public Student(int studentid, String studentname, int sclass, int class_id, String parentcontact, String parentname,
			String address) 
	{
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.sclass = sclass;
		this.class_id = class_id;
		this.parentcontact = parentcontact;
		this.parentname = parentname;
		this.address = address;
	}



	public int getStudentid() {
		return studentid;
	}


	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}


	public String getStudentname() {
		return studentname;
	}


	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}


	public int getSclass() {
		return sclass;
	}


	public void setSclass(int sclass) {
		this.sclass = sclass;
	}


	public int getClassid() {
		return class_id;
	}


	public void setClassid(int class_id) {
		this.class_id = class_id;
	}


	public String getParentcontact() {
		return parentcontact;
	}


	public void setParentcontact(String parentcontact) {
		this.parentcontact = parentcontact;
	}


	public String getParentname() {
		return parentname;
	}


	public void setParentname(String parentname) {
		this.parentname = parentname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

		}
