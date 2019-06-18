<%--
  Created by IntelliJ IDEA.
  User: Anton_Platunov
  Date: 6/18/2019
  Time: 1:07 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>





<html>

<head>

    <!-- Compiled and minified JavaScript -->

    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>



</head>

<body>

<nav class="light-blue lighten-1" role="navigation">

    <div class="nav-wrapper container"><a id="logo-container"   href="#" class="brand-logo">Delivery</a>


        <ul class="right hide-on-small-only">

            <li><a href="${pageContext.request.contextPath}/main">home</a></li>

            <li><a href="${pageContext.request.contextPath}/language/en">Eng</a></li>

            <li><a href="${pageContext.request.contextPath}/language/ua">Ua</a></li>

        </ul>


    </div>

</nav>





</body>

</html>