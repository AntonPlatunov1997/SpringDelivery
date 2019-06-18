<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>

    <title>User page</title>

</head>

<body>

${user}
<form method="post" action="/createUser">

    <input type="text" name="email" placeholder="type name" required/>


    <input type="password" name="password" placeholder="type password" required/>

    <button type="submit">update</button>

</form>

</body>

</html>