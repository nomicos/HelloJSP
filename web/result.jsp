<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Result</title>
</head>
<body>
  <h2 style="color: green">Calculated successfully!</h2>

  <%
    int result = (int) request.getAttribute("result");
    out.print("<p>The answer is <b>" + result + "</b>.</p>");

    // TODO: Put the actual date and time here.
    out.print("<hr/> Generated at [...]");
  %>
</body>
</html>
