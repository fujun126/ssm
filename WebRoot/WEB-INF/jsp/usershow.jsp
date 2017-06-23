<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>


 <script type="text/javascript">
 
  function del(){
	  
	  document.forms[0].submit();
	  
  }
  
  function cc(){
	  
	 var a= document.getElementById("c1").checked;
	 var b=document.getElementsByName("ids");
	 
	if(a){
		for(var i=0;i<b.length;i++){
			
			b[i].checked='checked';
			
		}
		
		
	}else{
		
	for(var i=0;i<b.length;i++){
			
			b[i].checked=false;
			
		}
	}
	  
	  
  }
 
   function  add(){
	   
	   
	   document.location.href="showadd.action";
   }
  
 </script>
</head>
<body>
    
    
    
         
         
          <input  type="button" value="批量删除" onclick="del()">
          
         <input  type="button" value="添加信息" onclick="add()">
          
          
          <form  action="deleteUser.action"  method="post">
      <table>
        <tr>
        <td><input id="c1"  type="checkbox" onclick="cc()" >全选</td>
           <td>id</td>
           <td>name</td>
           <td>pwd</td>
           <td>日期</td>
            <td>操作</td>
        </tr>
      
        <c:forEach items="${userList}" var="u">
           <tr>
           <td><input type="checkbox" name="ids"  value="${u.id}" ></td>
              <td>${u.id}</td>
              <td>${u.name}</td>
              <td>${u.pwd}</td>
              <td><fmt:formatDate value='${u.birthday}' pattern='yyyy-MM-dd'/></td>
            <td><a href="getUserById.action?id=${u.id}">修改</a></td>
           </tr>
        
        </c:forEach>
      
      
      </table>
          </form>
       
    
    
</body>
</html>