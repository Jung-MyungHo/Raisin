<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <link rel="stylesheet" href="/raisin/css/login.css">
  <title>Login</title>
</head>

<div class="login">
  <h1>Raisin Login</h1>
  <s:form action="Login" method="post">
    <s:textfield name="loginBean.email" placeholder="email"/>
    <s:password name="loginBean.password" placeholder="Password"/>
    <s:submit class="btn btn-primary btn-block btn-large" value="ログイン"></s:submit>
  </s:form>
</div>

</html>