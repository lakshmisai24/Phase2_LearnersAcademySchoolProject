package com.LearnersPrjct;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class TeacherEntity {

	private int tid;
	private String Teacherid;
	private String Teachername;
	private String subjectid;
	private int class_id;
    private List<Class> classesAttended;
    private Collection<Subject> subjects; 
    private Set<Student> stud;
	
    public TeacherEntity() {
		}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTeacherid() {
		return Teacherid;
	}

	public void setTeacherid(String teacherid) {
		Teacherid = teacherid;
	}

	public String getTeachername() {
		return Teachername;
	}

	public void setTeachername(String teachername) {
		Teachername = teachername;
	}

	public String getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(String subjectid) {
		this.subjectid = subjectid;
	}

	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public List<Class> getClassesAttended() {
		return classesAttended;
	}

	public void setClassesAttended(List<Class> classesAttended) {
		this.classesAttended = classesAttended;
	}

	public Collection<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Collection<Subject> subjects) {
		this.subjects = subjects;
	}

	public Set<Student> getStud() {
		return stud;
	}

	public void setStud(Set<Student> stud) {
		this.stud = stud;
	}

}
