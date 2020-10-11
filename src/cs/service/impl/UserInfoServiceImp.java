package cs.service.impl;

import cs.dao.impl.UserInfoDaoImpl;
import cs.entity.UserInfo;
import cs.service.UserInfoService;

import java.util.List;

public class UserInfoServiceImp implements UserInfoService {
    private UserInfoDaoImpl uil=new UserInfoDaoImpl();
    @Override
    public List<UserInfo> UserfindUserInfoInfoAll() throws Exception {
        return uil.UserfindUserInfoInfoAll();
    }

    @Override
    public UserInfo findByidUserInfo(int id) throws Exception {
        return uil.findByidUserInfo(id);


    }

    @Override
    public UserInfo login(String username, String password) throws Exception {
        return uil.login(username,password);
    }

    @Override
    public boolean updateByUserInfo(UserInfo userInfo) throws Exception {
        int i=uil.updateByUserInfo(userInfo);
        if(i>0){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public int delByUserInfo(int id) throws Exception {
        return uil.delByUserInfo(id);
    }

    @Override
    public int addByUserInfo(UserInfo userInfo) throws Exception {
        return uil.addByUserInfo(userInfo);
    }

    @Override
    public int findByCountUser() throws Exception {
        return uil.findByCountUser();
    }

    @Override
    public List<UserInfo> findByPageUserInfo(int pageNo, int pageSize) throws Exception {
        return uil.findByPageUserInfo(pageNo,pageSize);
    }
}
