function del(id) {
    var aa=confirm("确定要删除吗");
    if(aa){
        location.href="UserServlet?id="+id+"&comm=del";
    }
}