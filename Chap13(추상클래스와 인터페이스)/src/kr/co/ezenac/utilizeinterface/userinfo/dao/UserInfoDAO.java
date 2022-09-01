package kr.co.ezenac.utilizeinterface.userinfo.dao;

public interface UserInfoDAO {
	
	void insertUserInfo(UserInfoDTO userInfoDTO);
	void updateUserInfo(UserInfoDTO userInfoDTO);
	void deleteUserInfo(UserInfoDTO userInfoDTO);
	void selectUserInfo(UserInfoDTO userInfoDTO);
	
}
