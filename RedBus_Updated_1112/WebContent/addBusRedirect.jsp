<%@page import="com.sid.redbus.BusImplementation"%>
<jsp:useBean id="u" class="com.sid.redbus.BusInputDTO"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%  
System.out.println("|| Inside addBusRedirect.jsp ||");
String result=BusImplementation.addBusList(u);
if(result.equalsIgnoreCase("SUCCESS")){
response.sendRedirect("Success.jsp");
}else{
response.sendRedirect("Error.jsp");
}
%>