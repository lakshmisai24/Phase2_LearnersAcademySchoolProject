package com.LearnersPrjct;

public class Login {
	
	private int loginid;
	private String login_name;
	private String login_pwd;
	
	public Login()
	{
		
	}
	public Login(int loginid, String login_name, String login_pwd) 
	{
		super();
		this.loginid = loginid;
		this.login_name = login_name;
		this.login_pwd = login_pwd;
	}
	public int getLoginid() {
		return loginid;
	}
	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}
	public String getLogin_name() {
		return login_name;
	}
	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}
	public String getLogin_pwd() {
		return login_pwd;
	}
	public void setLogin_pwd(String login_pwd) {
		this.login_pwd = login_pwd;
	}
	
	

}
