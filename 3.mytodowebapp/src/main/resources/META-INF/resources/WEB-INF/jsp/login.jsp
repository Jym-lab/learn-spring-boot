<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        Welcome to the login page!
        <pre style="color:red">${errorMessage}</pre>
        <form method="POST">
            Name: <input type="text" name="name">
            Password: <input type="password" name="password">
            <input type="submit">
        </form>
    </body>
</html>