<html>
<head>
    <meta name="layout" content="main">
</head>
<body>
${new Date()}
<g:render template="tem" var="student2" collection="${student1}">



</g:render>
<g:render template="tem2" var="student3" collection="${student0}">

</g:render>
</body>
</html>