package kr.co.ezenac.utilizeinterface.userinfo.dao.mysql;

import kr.co.ezenac.utilizeinterface.userinfo.UserInfoDTO;
import kr.co.ezenac.utilizeinterface.userinfo.dao.UserInfoDAO;

public class UserInfoMySQLDAO implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into MySQL DB userID=  " + userInfoDTO.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into MySQL DB userID=  " + userInfoDTO.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
			System.out.println("delete into MySQL DB userID=  " + userInfoDTO.getUserId());
		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into MySQL DB userID=  " + userInfoDTO.getUserId());
		
	}

}
