<%--
  Created by IntelliJ IDEA.
  User: red
  Date: 2018/7/10
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
修改界面
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>

    <title>编辑接口</title>

    <script type="text/javascript">
        function updateInterface() {
            var form = document.forms[0];
            form.action = "<%=path%>/updateInterface";
            form.method = "post";
            form.submit();
        }
    </script>

</head>
<body>
<h1>编辑用户</h1>
<form action="" name="interfaceForm">
        <input type="hidden" name="interfaceId" value="${interfaceDO.interfaceId }" />
        接口名称：<input type="text" name="interfaceName" value="${interfaceDO.interfaceName }" />
        请求方式：<input type="text" name="requestMethod" value="${interfaceDO.requestMethod }" />
        请求路径：<input type="text" name="requestPath" value="${interfaceDO.requestPath }" />
        最近更新者：<input type="text" name="latestUpdater" value="${interfaceDO.latestUpdater }" />
        创建时间：<input type="text" name="createTime" value="${interfaceDO.createTime }" />
        请求参数：<input type="text" name="requestParameter" value="${interfaceDO.requestParameter }" />
        响应参数：<input type="text" name="responseParameter" value="${interfaceDO.responseParameter }" />
        <input type="button" value="编辑" onclick="updateInterface()" />
</form>
</body>

</html>
