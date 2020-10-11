<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/10
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <script type="text/javascript" src="js/no2.js"></script>
  <body>
  <table align="center" width="600" border="1">
    <tr height="40" align="center">
      <td colspan="6"><strong>用户信息列表</strong>
       <a href="add.jsp" style="font-size: 12">添加</a>
      </td>
    </tr>
    <tr height="40" align="center">
      <td id="aa">编号</td>
      <td>姓名</td>
      <td>密码</td>
      <td>性别</td>
      <td>年龄</td>
      <td>操作</td>
    </tr>
    <c:forEach var="us" items="${lists}">
      <tr height="40" align="center">
        <td>${us.userID}</td>
        <td>${us.userName}</td>
        <td>${us.userPass}</td>
        <td>${us.sex}</td>
        <td>${us.age}</td>

        <td>
          <a href="UserServlet?id=${us.userID}&comm=query">查看</a>&nbsp;
          <a href="UserServlet?id=${us.userID}&comm=update">修改</a>&nbsp;
          <a href="javascript:del(${us.userID})">删除</a>&nbsp;
        </td>
      </tr>
    </c:forEach>
  </table>
  <p align="center">
    <c:if test="${ps.currentPageNo >1}">
      <a href="UserInfoServlet?id=1&comm=list">首页</a>&nbsp;&nbsp;
      <a href="UserInfoServlet?id=${ps.currentPageNo-1}&comm=list">上一页</a>&nbsp;&nbsp;
    </c:if>
    <c:if test="${ps.currentPageNo <ps.totalPageCount}">
      <a href="UserInfoServlet?id=${ps.currentPageNo+1}&comm=list">下一页</a>&nbsp;&nbsp;
      <a href="UserInfoServlet?id=${ps.totalPageCount}&comm=list">末页</a>
    </c:if>
  </p>
  </body>
</html>
