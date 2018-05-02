<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>消息也</title>

</head>
<body>

<!-- 判断当前用户是否已经认证,已认证就可以看到标签中的内容 -->
    <shiro:authenticated>
        看到内容就说明你已经认证成功了!
    </shiro:authenticated>
    
    <br>
    
    <!-- 判断当前用户是否拥有指定的权限 -->
    <shiro:hasPermission name="query">
        <input value="查询权限">
    </shiro:hasPermission>
   
    <br>
     <!-- 判断当前用户是否拥有指定的权限 -->
    <shiro:hasPermission name="add">
        <input value="添加权限">
    </shiro:hasPermission>
   
    <br>
    
    <!-- 判断当前用户是否拥有指定的角色 -->
    <shiro:hasRole name="admin">
        <input value="这是判断admin角色的按钮">
    </shiro:hasRole>
</body>
</html>