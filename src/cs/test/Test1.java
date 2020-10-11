package cs.test;


import cs.dao.impl.UserInfoDaoImpl;
import cs.entity.UserInfo;
import cs.page.PageSupport;

import java.util.List;

public class Test1 {

    public static void main(String[] args) throws Exception {
//        NewsDaoImpl gdi=new NewsDaoImpl();
//        List<entity.News>  list=();
//        for (usern u : list) {
//            System.out.println(u.toString());
//        }

//        NewsDaoImpl nsi=new NewsDaoImpl();
//        List<News> list=nsi.newsfindGradeInfoAll();
//        for (News news : list) {
//            System.out.println(news.toString());
//        }
//
//        ToptitleDaoImpl tdii=new ToptitleDaoImpl();
//        List<Toptitle> list1=tdii.TopfindToptitleInfoAll();
//        for (Toptitle t : list1) {
//            System.out.println(t.toString());
//        }
//        UserInfoDaoImpl udi=new UserInfoDaoImpl();
//        int x=udi.UserINfofindCount();
//        System.out.println(x);

        UserInfoDaoImpl udi=new UserInfoDaoImpl();
        //UserInfo us=new UserInfo();
        PageSupport ps = new PageSupport();
        ps.setPageSize(3);
        ps.setTotalCount(udi.findByCountUser());
        ps.setCurrentPageNo(1);

        System.out.println("总页数：" + ps.getTotalPageCount());
        System.out.println("总信息数" + ps.getTotalCount());
        System.out.println("当前页数：" + ps.getCurrentPageNo());
        List<UserInfo> list = udi.findByPageUserInfo(ps.getCurrentPageNo(), ps.getPageSize());
        for (UserInfo ui : list) {
            System.out.println(ui.toString());
        }
    }
}
