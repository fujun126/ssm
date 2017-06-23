<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

   <c:forEach items="${allErrors}" var="e">
     ${e.defaultMessage }
   </c:forEach>

  <center>
  <form action="addUser.action" method="post">
      <p>
     id: <input  type="text" name="id" >
      </p>
      <p>
      姓名<input  type="text" name="name" >
      </p>
      <p>
     密码 <input  type="text" name="pwd" >
      </p>
      <p>
     生日 <input  type="text" name="birthday" >
      </p>
        <p>
      <input  type="submit" value="提交" >
      </p>
  
  
  </form>

  </center>

</body>
</html>