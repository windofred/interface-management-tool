<%--
  Created by IntelliJ IDEA.
  User: red
  Date: 2018/7/10
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%
    String path = request.getContextPath();
%>
<html>
<title>添加接口</title>
</head>
<body>
<h1>添加接口</h1>
<form action="" name="userForm" method="post">
    接口名称：<input type="text" name="interfaceName"><br>
    请求方式：<input type="text" name="requestMethod"><br>
    请求路径：<input type="text" name="requestPath"><br>
    最近更新者：<input type="text" name="latestUpdater"><br>
    创建时间：<input type="text" name="createTime"><br>
    请求参数：<input type="text" name="requestParameter"><br>
    响应参数：<input type="text" name="responseParameter"><br>
    <input type="button" value="添加" onclick="addInterface()">
</form>

<script type="text/javascript">
    function addInterface() {
        var form = document.forms[0];
        form.action = "<%=path %>/addInterface";
        form.method = "post";
        form.submit();
    }
</script>
</body>
</html>
