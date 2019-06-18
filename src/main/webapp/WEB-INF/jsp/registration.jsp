<%--
  Created by IntelliJ IDEA.
  User: Anton_Platunov
  Date: 6/18/2019
  Time: 1:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<fmt:setLocale value="${sessionScope.get('language')}"/>

<fmt:setBundle basename="text"/>


<html>

<head>


    <!-- CSS  -->

    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">


</head>


<body>

<jsp:include page="part/header.jsp"/>


<div class="valign-wrapper" style="width:100%;height:100%;position: absolute;">

    <div class="valign" style="width:100%;">

        <div class="container">

            <div class="row">

                <div class="col s12 m6 offset-m3">

                    <div class="card">

                        <div class="card-content">

                            <span class="card-title black-text">SignUp</span>

                            <form method="POST" action="${pageContext.request.contextPath}/registration" name="action">

                                <div class="row">

                                    <div class="input-field col s12">

                                        <input id="email" type="email" name="email"
                                               <%--class="validate"--%>
                                        >

                                        <label for="email">SignUp</label>

                                    </div>

                                </div>

                                <div class="row">

                                    <div class="input-field col s12 ">

                                        <input id="password" name="password" type="password"
                                               <%--class="validate" required--%>
                                        >

                                        <label for="password">password</label>

                                    </div>

                                </div>


                                <div class="card-action">

                                    <input type="submit" class="btn light blue" value="registration.singUp">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</div>


</body>

</html>