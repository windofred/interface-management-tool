<%--
  Created by IntelliJ IDEA.
  User: red
  Date: 2018/7/10
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>

<!DOCTYPE HTML>
<html>
<head>
    <title>用户列表</title>
    <link
            href="${path}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
            rel="stylesheet">
    <script type="text/javascript"
            src="${path}/static/bootstrap-3.3.7-dist/js/jquery-1.12.4.min.js"></script>
    <script type="text/javascript"
            src="${path}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>

<body>

<div class="container">
    <!-- 标题 -->
    <div class="row">
        <div class="col-md-12">
            <h1>接口管理</h1>
        </div>
    </div>
    <!-- 按钮 -->
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <a class="btn btn-primary" href="${path}/toAddInterface">新增</a>
        </div>
    </div>
    <!-- 表格  -->
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover">
                <tr>
                    <th>id</th>
                    <th>接口名称</th>
                    <th>请求方式</th>
                    <th>请求路径</th>
                    <th>最近更新者</th>
                    <th>创建时间</th>
                    <th>请求参数</th>
                    <th>响应参数</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${pageInfo.list }" var="interf">
                    <tr>
                        <td>${interf.interfaceId }</td>
                        <td>${interf.interfaceName }</td>
                        <td>${interf.requestMethod }</td>
                        <td>${interf.requestPath }</td>
                        <td>${interf.latestUpdater }</td>
                        <td>${interf.createTime}</td>
                        <td>${interf.requestParameter}</td>
                        <td>${interf.responseParameter}</td>
                        <!-- <td><a  class="edit">编辑</a> <a
                             class="delete">删除</a></td> -->
                        <td>
                            <a type="button"  href="${path}/getInterface?id=${interf.interfaceId}" class="btn btn-info btn-sm">
                                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                编辑</a>
                            <a type="button"  href="${path}/deleteInterface?id=${interf.interfaceId}" class="btn btn-danger btn-sm">
                                <span class="glyphicon glyphicon-trash" aria-hidden="true" ></span>
                                删除</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>

    <hr style="height:1px;border:none;border-top:1px solid #ccc;" />
    <!-- 分页导航栏 -->

    <!-- 分页信息 -->
    <div class="row">
        <!-- 分页文字信息，其中分页信息都封装在pageInfo中 -->
        <div class="col-md-6">
            当前第：${pageInfo.pageNum}页，总共：${pageInfo.pages}页，总共：${pageInfo.total}条记录
        </div>

        <!-- 分页条 -->
        <div class="col-md-6">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <li><a href="${path}/interfaceInfo?pn=1">首页</a></li>
                    <c:if test="${pageInfo.hasPreviousPage }">
                        <li>
                            <a href="${path}/interfaceInfo?pn=${pageInfo.pageNum-1}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                    </c:if>

                    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
                        <c:if test="${page_Num == pageInfo.pageNum }">
                            <li class="active"><a href="#">${ page_Num}</a></li>
                        </c:if>
                        <c:if test="${page_Num != pageInfo.pageNum }">
                            <li><a href="${path}/interfaceInfo?pn=${ page_Num}">${ page_Num}</a></li>
                        </c:if>
                    </c:forEach>
                    <c:if test="${pageInfo.hasNextPage }">
                        <li>
                            <a href="${path}/interfaceInfo?pn=${pageInfo.pageNum+1}" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </c:if>
                    <li><a href="${path}/interfaceInfo?pn=${pageInfo.pages}">末页</a></li>
                </ul>
            </nav>
        </div>
    </div>
</div>
</body>
</html>
