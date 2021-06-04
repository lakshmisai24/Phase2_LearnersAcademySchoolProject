package com.LearnersPrjct;

public class Subject {
  private int sub_id;
  private String subjectid;
  private String subjectname;
  private int class_id;
    
public Subject() 
{
}

public Subject(int sub_id, String subjectid, String subjectname, int class_id) 
{
	super();
	this.sub_id = sub_id;
	this.subjectid = subjectid;
	this.subjectname = subjectname;
	this.class_id = class_id;
}




public int getSub_id()
{
	return sub_id;
}




public void setSub_id(int sub_id) {
	this.sub_id = sub_id;
}




public String getSubjectid() {
	return subjectid;
}




public void setSubjectid(String subjectid) {
	this.subjectid = subjectid;
}




public String getSubname() {
	return subjectname;
}




public void setSubname(String subjectname) {
	this.subjectname = subjectname;
}




public int getClass_id() {
	return class_id;
}




public void setClass_id(int class_id) {
	this.class_id = class_id;
}
  
  


}
