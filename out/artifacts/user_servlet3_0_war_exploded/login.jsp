<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/6
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <script type="text/javascript" src="js/no1.js" >
  </script>
  <body>
  <form action="UserInfoServlet" method="post">
    <table align="center" width="500px" border="1">
      <tr height="40px">
        <td colspan="3"><strong>用户登录</strong></td>
      </tr>
      <td align="right">用户名：</td>
      <td>
        <input type="text" name="username" value="" />
      </td>
      </tr>
      <tr height="40px">
        <td align="right">密码：</td>
        <td>
          <input type="text" name="password" value="" /></td>
      <tr height="40px">
        <td align="right">提交</td>
        <td><input type="submit" name="comm" value="提交"></td>
    </tr>
    </table>
  </form>
  </body>
</html>
