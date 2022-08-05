<%-- 
    Document   : council
    Created on : Aug 5, 2022, 10:25:13 AM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1 class="text-center text-danger">DANH SÁCH HỘI ĐỒNG</h1>

<c:forEach items="${council}" var="c">
    <div>
         <h3>${c.id}</h3>
    </div>    
</c:forEach>