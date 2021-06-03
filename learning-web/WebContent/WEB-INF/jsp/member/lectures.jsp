<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    		<%
request.setAttribute("pageName","Java入門講座");
%>
<!DOCTYPE html>
<html>
<head>


<jsp:include page="../commonMeta.jsp" />
<title>Java入門講座</title>
</head>
<body>

	<jsp:include page="./member_header.jsp" />
	<jsp:include page="./${lecture}/${pageNo}" />


<jsp:include page="./Editor.jsp" />
<!--<jsp:include page="./lecture01/SideBar.jsp" /> -->
</body>
</html>