package com.LearnersPrjct;


public class Teacher {
	private int tid;
	private String Teacherid;
	private String Teachername;
	private String subjectid;
	private int class_id;

	public Teacher() {
		
	}

	public Teacher(int tid, String Teacherid, String Teachername, String subjectid,int class_id) {
		super();
		this.tid = tid;
		this.Teacherid = Teacherid;
		this.Teachername = Teachername;
		this.subjectid = subjectid;
		this.class_id=class_id;
	}

	
	public int getClassid() {
		return class_id;
	}

	public void setClassid(int class_id) {
		this.class_id = class_id;
	}

	public int getId() {
		return tid;
	}

	public void setId(int id) {
		this.tid = id;
	}

	public String getTid() {
		return Teacherid;
	}

	public void setTid(String Teacherid) {
		this.Teacherid = Teacherid;
	}

	public String getTname() {
		return Teachername;
	}

	public void setTname(String Teachername) {
		this.Teachername = Teachername;
	}

	public String getSubid() {
		return subjectid;
	}

	public void setSubid(String subjectid) {
		this.subjectid = subjectid;
	}
	
	

}
