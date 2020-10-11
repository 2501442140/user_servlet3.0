package cs.service;

import cs.entity.UserInfo;

import java.util.List;

public interface UserInfoService {
    public List<UserInfo> UserfindUserInfoInfoAll() throws Exception;

    public UserInfo findByidUserInfo(int id) throws Exception;

    public UserInfo login(String username, String password) throws Exception;

    public boolean updateByUserInfo(UserInfo userInfo) throws Exception;

    public int delByUserInfo(int id) throws Exception;
    public int addByUserInfo(UserInfo userInfo) throws Exception;

    public int findByCountUser() throws Exception;

    public List<UserInfo> findByPageUserInfo(int pageNo, int pageSize) throws Exception;
}
