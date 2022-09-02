package kr.co.ezenac.utilizeinterface.userinfo.dao.oracle;

import kr.co.ezenac.utilizeinterface.userinfo.UserInfoDTO;
import kr.co.ezenac.utilizeinterface.userinfo.dao.UserInfoDAO;

public class UserInfoOracleDAO implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into ORACLE DB userID=  " + userInfoDTO.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into ORACLE DB userID=  " + userInfoDTO.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into ORACLE DB userID=  " + userInfoDTO.getUserId());
		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into ORACLE DB userID=  " + userInfoDTO.getUserId());
		
	}

}
