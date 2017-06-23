<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

     
  <form action="updateUser.action"  method="post">
      <p>
        <input type="hidden" name="id"  value="${user.id}">
      </p>
      <p>
      <input  type="text"  name="name"  value="${user.name}" />
      </p>
     <p>
      <input  type="text"  name="pwd" value="${user.pwd}">
     </p>
     
       <p>
      
      <input  type="text"  name="birthday" value=" <fmt:formatDate value='${user.birthday}' pattern='yyyy-MM-dd'/>">
     </p>
     <p>
      <input  type="submit"  value="提交修改">
     </p>
  </form>


</body>
</html>