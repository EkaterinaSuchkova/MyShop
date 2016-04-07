<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Главная страница каталога</title>
    <script src="http://code.jquery.com/jquery-1.11.0.js"></script>
    <link href="/resources/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script src="/resources/js/bootstrap.js" defer ></script>
</head>
<body>
<#include "header.ftl">
    ${message!"Сообщения нет!"}
<br>
Catalog page 1 : <a href="/catalog/1" class="red_link">link</a><br>
Catalog page 2 : <a href="/catalog/2?page=3&limit=4" class="red_link">link</a><br><br>
</body>
</html>