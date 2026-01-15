<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Form</title>
    <style>
        body {
            font-family: Arial;
            background-color: #f4f4f4;
        }
        .form-container {
            background: white;
            padding: 20px;
            margin: 50px auto;
            width: 300px;
            box-shadow: 0 0 10px rgba(0,0,0,0.2);
        }
        input[type="text"], input[type="email"] {
            width: 100%;
            padding: 8px;
            margin: 10px 0;
        }
        input[type="submit"] {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 10px;
            width: 100%;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <form action="submitForm" method="post">
            <label for="name">Name:</label>
            <input type="text" name="name" required />

            <label for="email">Email:</label>
            <input type="email" name="email" required />

            <input type="submit" value="Submit" />
        </form>
    </div>
</body>
</html>

