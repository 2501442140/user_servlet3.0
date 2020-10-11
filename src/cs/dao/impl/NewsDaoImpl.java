package cs.dao.impl;

import cs.basedao.BaseDao;
import cs.dao.NewsDao;
import cs.entity.News;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NewsDaoImpl extends BaseDao implements NewsDao {

    @Override
    public List<News> newsfindGradeInfoAll() throws Exception {
        List<News> list=new ArrayList<>();
        String sql="select * from news";
        ResultSet rs=exeuQuery(sql,null);
        while(rs.next()){
            News ns=new News();
            ns.setNewID(rs.getInt(1));
            ns.setNewTitle(rs.getString(2));
            ns.setNewsContent(rs.getString(3));
            ns.setSendDate(rs.getDate(4));
            ns.setNewID(rs.getInt(5));
            ns.setTopID(rs.getInt(6));
            list.add(ns);
        }
        getClose();
        return list;
    }

    @Override
    public int newsfindNewsCount() throws Exception {
        int index=-1;
        String sql="select count(NewsID) from News";
        Object[] obj=null;
        ResultSet rs=exeuQuery(sql,obj);
        rs.next();
        int x=rs.getInt(1);
        return x;
    }

    @Override
    public int updateNews(News news) {
        int x=-1;
        String sql="update News set newTitle=?,newsContent=? where newsid=?";
        Object[]obj={news.getNewTitle(),news.getNewsContent(),news.getNewID()};
        x=exeuUpdate(sql,obj);
        getClose();
        return x;
    }

    @Override
    public int updateseleteNews(News news) {
        int x=-1;
        String sql="delete from News where newsid=? and newsContent=?";
        Object[]obj={news.getNewID(),news.getNewsContent()};
        x=exeuUpdate(sql,obj);
        return x;
    }



}
