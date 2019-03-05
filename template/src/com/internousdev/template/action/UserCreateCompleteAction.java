package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.internousdev.template.dao.UserCreateCompleteDAO;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	private String userName;
	public Map<String,Object>session;

	public String execute() throws SQLException{
		UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();
		UserCreateCompleteDAO.createUser(session.get("loginUserid").toString()),
		  session.get("loginPassword").toString(),
		  session.get("userName").toString());

	}
