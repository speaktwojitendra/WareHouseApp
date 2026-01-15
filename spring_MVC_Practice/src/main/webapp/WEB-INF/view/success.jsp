<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome Aboard!</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background-color: #e0f7fa;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .message-box {
            background: #ffffff;
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0,0,0,0.2);
            text-align: center;
        }
        .message-box h1 {
            color: #00796b;
            margin-bottom: 10px;
        }
        .message-box p {
            font-size: 18px;
            color: #555;
        }
    </style>
</head>
<body>
    <div class="message-box">
        <h1>🎉 Registration Successful!</h1>
      <p>Welcome, <strong><%= request.getAttribute("username") %></strong>! We're thrilled to have you on board.</p>
    </div>
</body>
</html>