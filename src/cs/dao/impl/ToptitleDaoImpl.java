package cs.dao.impl;

import cs.basedao.BaseDao;
import cs.dao.ToptitleDao;
import cs.entity.Toptitle;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ToptitleDaoImpl extends BaseDao implements ToptitleDao {
    @Override
    public List<Toptitle> TopfindToptitleInfoAll() throws Exception {
        List<Toptitle> list=new ArrayList<>();
        String sql="select * from Toptitle";
        ResultSet rs=exeuQuery(sql,null);
        while(rs.next()){
            Toptitle tp=new Toptitle();
            tp.setTopID(rs.getInt(1));
            tp.setTopTitle(rs.getString(2));
            tp.setSendDate(rs.getDate(3));
            tp.setUserID(rs.getInt(4));
            list.add(tp);
        }
        getClose();
        return list;
    }
}
