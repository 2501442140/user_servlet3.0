package cs.servlet;

import cs.entity.UserInfo;
import cs.page.PageSupport;
import cs.service.impl.UserInfoServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "USerInfoServlet",urlPatterns = {"/UserInfoServlet"})
public class USerInfoServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String comm=request.getParameter("comm");
        UserInfoServiceImp usi=new UserInfoServiceImp ();
        if (comm.equals("list")){
            String pageno=request.getParameter("id");
            if(pageno==null||pageno==" "){
                pageno="1";
            }
            int pno=Integer.parseInt(pageno);
            PageSupport ps = new PageSupport();
            ps.setCurrentPageNo(pno);
            ps.setPageSize(3);
            try {
                ps.setTotalCount(usi.findByCountUser());
                List<UserInfo> list=usi.findByPageUserInfo(ps.getCurrentPageNo(),ps.getPageSize());
                if(list.size()>0&&list!=null) {
                    request.getSession().setAttribute("lists", list);
                    request.getSession().setAttribute("ps", ps);
                    response.sendRedirect("list.jsp");
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(comm.equals("提交")){
            try{
                int l=0;
                request.setCharacterEncoding("UTF-8");
                response.setCharacterEncoding("utf-8");

                String name=request.getParameter("username");
                String password=request.getParameter("password");
                UserInfoServiceImp ui=new UserInfoServiceImp();
                UserInfo login = ui.login(name, password);
                if(login!=null){
                    request.getRequestDispatcher("UserInfoServlet?comm=list").forward(request,response);
                } else{
                    response.sendRedirect("login.jsp");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doPost(request,response);
    }
}
