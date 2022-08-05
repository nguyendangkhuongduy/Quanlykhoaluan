<%--
    Document   : index
    Created on : Aug 3, 2022, 1:27:22 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<div class="row">
    <c:forEach items="${major}" var="m">
        <div class="col-md-3">
            <div class="card">
                <img class="card-img-top" class="img-fluid" src="https://res.cloudinary.com/dxxwcby8l/image/upload/v1647248722/r8sjly3st7estapvj19u.jpg" alt="Card image">
                <div class="card-body">
                    <h4 class="card-title">Tên khóa luận</h4>
                    <p class="card-text">Ngành: ${m}</p>
                    <p class="card-text">Ngày bắt đầu:</p>
                    <p class="card-text">Ngày kết thúc:</p>
                    <a href="#" class="btn btn-primary">Xem chi tiết</a>
                </div>
            </div>
        </div>
    </c:forEach>

</div>


