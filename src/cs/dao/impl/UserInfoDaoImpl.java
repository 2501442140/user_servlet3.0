package cs.dao.impl;

import cs.basedao.BaseDao;
import cs.dao.UserInfoDao;
import cs.entity.UserInfo;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserInfoDaoImpl extends BaseDao implements UserInfoDao {
    @Override
    public List<UserInfo> UserfindUserInfoInfoAll() throws Exception {
        List<UserInfo> list=new ArrayList<>();
        String sql="select * from UserInfo";
        ResultSet rs=exeuQuery(sql,null);
        while(rs.next()){
            UserInfo ui=new UserInfo();
            ui.setUserID(rs.getInt(1));
            ui.setUserName(rs.getString(2));
            ui.setUserPass(rs.getString(3));
            ui.setSex(rs.getString(4));
            ui.setAge(rs.getInt(5));
            ui.setEmail(rs.getString(6));
            list.add(ui);
        }
        getClose();
        return list;
    }
    @Override
    public UserInfo findByidUserInfo(int id) throws Exception {
        UserInfo us=null;
        String sql="select * from userInfo where UserId=?";
        Object[] obj={id};
        ResultSet rs=exeuQuery(sql,obj);
        while (rs.next()){
            us=new UserInfo();
            us.setUserID(rs.getInt(1));
            us.setUserName(rs.getString(2));
            us.setUserPass(rs.getString(3));
            us.setSex(rs.getString(4));
            us.setAge(rs.getInt(5));
        }
        getClose();
        return us;
    }

    @Override
    public UserInfo login(String username, String password) throws Exception {
        UserInfo us=null;
        String sql="select * from userInfo where username=? and Userpass=?";
        Object obj []={username,password};
        ResultSet rs=exeuQuery(sql,obj);
        while(rs.next()){
            us=new UserInfo();
            us.setUserID(rs.getInt(1));
            us.setUserName(rs.getString(2));
            us.setUserPass(rs.getString(3));
            us.setSex(rs.getString(4));
        }
        getClose();
        return us;
    }

    @Override
    public int updateByUserInfo(UserInfo userInfo) throws Exception {
        int x=-1;
        String sql="update UserInfo set userName=?,userpass=?,sex=?,age=? where userId=?";
        Object[] obj={userInfo.getUserName(),userInfo.getUserPass(),userInfo.getSex(),userInfo.getAge(),userInfo.getUserID()};
         x=exeuUpdate(sql,obj);
        return x;
    }

    @Override
    public int delByUserInfo(int id) throws Exception {
        int x=-1;
        String sql="delete from UserInfo where userid=?";
        Object [] obj={id};
        x=exeuUpdate(sql,obj);
        return x;
    }

    @Override
    public int addByUserInfo(UserInfo userInfo) throws Exception {
        int x=-1;
        String sql="insert into UserInfo(UserName,UserPass,sex,age)value(?,?,?,?)";
        Object [] obj={userInfo.getUserName(),userInfo.getUserPass(),userInfo.getSex(),userInfo.getAge()};
        x=exeuUpdate(sql,obj);
        return x;
    }
    @Override
    public int findByCountUser() throws Exception {
        int index=-1;
        String sql="select Count(*) from userInfo";
        ResultSet rs=exeuQuery(sql,null);
        while(rs.next()){
            index=rs.getInt(1);
        }
        getClose();
        return index;
    }

    @Override
    public List<UserInfo> findByPageUserInfo(int pageNo, int pageSize) throws Exception {
        List<UserInfo> list=new ArrayList<UserInfo>();
        String sql="select * from userInfo limit ?,?";
        Object obj[]={(pageNo-1)*pageSize,pageSize};
        ResultSet rs=exeuQuery(sql,obj);
        while(rs.next()){
            UserInfo us=new UserInfo();
            us.setUserID(rs.getInt(1));
            us.setUserName(rs.getString(2));
            us.setUserPass(rs.getString(3));
            us.setSex(rs.getString(4));
            us.setAge(rs.getInt(5));
            list.add(us);
        }
        getClose();
        return list;
    }

}
