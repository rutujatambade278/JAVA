<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create User</title>
</head>
<body>
    <h1>Create a New User</h1>
    <form action="${pageContext.request.contextPath}/api/users/new" method="POST">
        <label for="userName">Username:</label>
        <input type="text" id="userName" name="userName" required><br><br>

        <label for="userFirstName">First Name:</label>
        <input type="text" id="userFirstName" name="userFirstName" required><br><br>

        <label for="userLastName">Last Name:</label>
        <input type="text" id="userLastName" name="userLastName" required><br><br>

        <label for="userPassword">Password:</label>
        <input type="password" id="userPassword" name="userPassword" required><br><br>

        <label for="role">Role:</label>
        <select id="role" name="role[0].roleName">
            <option value="User">User</option>
            <option value="Admin">Admin</option>
        </select><br><br>

        <button type="submit">Create User</b<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create User</title>
</head>
<body>
    <h1>Create a New User</h1>
    <form action="${pageContext.request.contextPath}/api/users/new" method="POST">
        <label for="userName">Username:</label>
        <input type="text" id="userName" name="userName" required><br><br>

        <label for="userFirstName">First Name:</label>
        <input type="text" id="userFirstName" name="userFirstName" required><br><br>

        <label for="userLastName">Last Name:</label>
        <input type="text" id="userLastName" name="userLastName" required><br><br>

        <label for="userPassword">Password:</label>
        <input type="password" id="userPassword" name="userPassword" required><br><br>

        <label for="role">Role:</label>
        <select id="role" name="role[0].roleName">
            <option value="User">User</option>
            <option value="Admin">Admin</option>
            <option value="Teacher">Teacher</option>
        </select><br><br>

        <button type="submit">Create User</button>
    </form>
</body>
</html>
        utton>
    </form>
</body>
</html>
