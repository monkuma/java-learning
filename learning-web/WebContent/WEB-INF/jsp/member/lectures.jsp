<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<jsp:include page="../commonMeta.jsp" />
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="./member_header.jsp" />
	<jsp:include page="./${lecNo}/${pageNo}" />


<jsp:include page="./lecture01/Editor.jsp" />
<jsp:include page="./lecture01/SideBar.jsp" />
</body>
</html>