<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>SMVC004-05</title>
</head>
<body>
  <p>Parameter "one": ${fn:escapeXml(i)}</p>
  <p>Parameter "two": ${fn:escapeXml(j)}</p>
  <p>Parameter "three": ${fn:escapeXml(param.k)}</p>
</body>
</html>