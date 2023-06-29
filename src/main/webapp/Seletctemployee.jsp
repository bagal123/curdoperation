<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Select" method="post">
      id: <input type="text" name="id" />
     
      <input type = "submit" value="submit" />
      
      </form>
       <table>
     <tr>
         <th>id</th>
         <th>firstname</th>
          <th>lastname</th>
           <th>address</th>
           <th>mobile</th>
           <th>email</th>
     </tr>
     
       <tr>
       <td>${id}</td>
        <td>${firstname}</td>
         <td>${lastname}</td>
          <td>${address}</td>
           <td>${mobile}</td>
            <td>${email}</td>
       </tr>
     </table>
</body>
</html>