package com.LearnersPrjct;

public class Class {

	private int cid;
	private int class_id;
	private String class_name;
	private String sub_id;
	private String t_id;
	
	public Class() {
		}

	public Class(int cid, int class_id, String class_name, String sub_id, String t_id) {
		super();
		this.cid = cid;
		this.class_id = class_id;
		this.class_name = class_name;
		this.sub_id = sub_id;
		this.t_id = t_id;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public String getSub_id() {
		return sub_id;
	}

	public void setSub_id(String sub_id) {
		this.sub_id = sub_id;
	}

	public String getT_id() {
		return t_id;
	}

	public void setT_id(String t_id) {
		this.t_id = t_id;
	}
	
	
	
}


