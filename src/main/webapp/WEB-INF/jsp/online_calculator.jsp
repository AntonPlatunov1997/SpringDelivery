<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="${sessionScope.get('language')}"/>
<fmt:setBundle basename="text"/>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0"/>
    <title>OnlineCalculator</title>

    <!-- CSS  -->
    <!-- CSS  -->

    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">




</head>
<body>

<jsp:include page="part/header.jsp" />


<form method="POST" class="input" action="/calculatCost" name="action">
    <div class="input-field col s12">
        From city:<select  class="browser-default" name="destinationFrom">
        <c:forEach items="${list}" var="city">
            <option value= "${city.cityName}">${city.cityName}</option>
        </c:forEach>
    </select>
    </div>

    <div class="input-field col s12">
        Destination city:<select class="browser-default" name="destinationTo">
<c:forEach items="${list}" var="city">
        <option value= "${city.cityName}">${city.cityName}</option>

</c:forEach>
    </select>
    </div>

    <div class="input-field col s12">
        Weight <select class="browser-default" name="weight">

        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
        <option value="6">6</option>
        <option value="7">7</option>
        <option value="8">8</option>
        <option value="9">9</option>
        <option value="10">10</option>
    </select>
    </div>

    <div class="input-field col s12">
        Type: <select class="browser-default" name="type">
        <option value="STANDART">STANDART</option>
        <option value="DANGEROUS">DANGEROUS</option>
    </select>
    </div>

    <button class="btn light-blue lighten-1 waves-effect waves-light" type="submit" name="action">Calc<i class="light-blue lighten-1 material-icons right"></i>
    </button>
</form>


<c:if test="${not empty  requestScope.cost }">
    <h4><c:out value=" Cost ${cost}  ₴"/></h4></h6>
</c:if>
<


</body>
</html>
