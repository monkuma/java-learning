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

<script type="text/javascript">


</script>


<body>
	<jsp:include page="./member_header.jsp" />
	<jsp:include page="./${lecture}/aboutLecture.jsp" />



</body>
</html>