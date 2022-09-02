package kr.co.ezenac.userinfo.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import kr.co.ezenac.utilizeinterface.userinfo.UserInfoDTO;
import kr.co.ezenac.utilizeinterface.userinfo.dao.UserInfoDAO;
import kr.co.ezenac.utilizeinterface.userinfo.dao.mssql.UserInfoMSSQLDAO;
import kr.co.ezenac.utilizeinterface.userinfo.dao.mysql.UserInfoMySQLDAO;
import kr.co.ezenac.utilizeinterface.userinfo.dao.oracle.UserInfoOracleDAO;

public class UserInfoClient {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.proferties");
		
		Properties prop = new Properties();
		prop.load(fis);
		String dbTYPE = prop.getProperty("DBTYPE");
		
		UserInfoDTO userInfo = new UserInfoDTO();
		userInfo.setUserId("ezen");
		userInfo.setPasswd("0111");
		userInfo.setUserName("이젠");
		
		UserInfoDAO userInfoDAO = null;
		if (dbTYPE.equals("ORACLE")) {
			userInfoDAO = new UserInfoOracleDAO();
		}
		else if(dbTYPE.equals("MYSQL")) {
			userInfoDAO = new UserInfoMySQLDAO();
		}
		else if (dbTYPE.equals("MSSQL")) {
			userInfoDAO = new UserInfoMSSQLDAO();
			return;
		}
		
		userInfoDAO.insertUserInfo(userInfo);
		userInfoDAO.updateUserInfo(userInfo);
		userInfoDAO.selectUserInfo(userInfo);
		userInfoDAO.deleteUserInfo(userInfo);
	}
}
