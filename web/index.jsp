<%-- 
    Document   : index
    Created on : 10 may. 2025, 12:41:00
    Author     : Josue Llontop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="recursos/css/bootstrap.min.css"/>
    </head>
    <body class="vh-100 d-flex bg-body-secondary align-items-center justify-content-center">
        <div class="card p-5" style="width: 100%; max-width: 400px">
            <div class="user d-flex justify-content-center">
                <image src="recursos/img/user.png" width ="200" height="200" alt="alt"/>
            </div>
            <form action="action">
                <div class="mb-3">
                    <label for="email" class="form-label">Email: </label>
                    <input type="email" class="form-control" id="email" name="email" placeholder="name@example.com">
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Password: </label>
                    <input type="password" class="form-control" id="password" name="password" placeholder="name@example.com">
                </div>
                <div class="d-grid gap-2">
                    <input button class="btn btn-primary" type="submit" value="Enviar">
                </div>
            </form>
        </div>

        <script src="recursos/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
