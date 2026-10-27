<%
Integer count = (Integer)application.getAttribute("count");

if(count == null)
    count = 0;

count++;

application.setAttribute("count", count);
%>

<html>
<body>
    <h2>Total Visits: <%= count %></h2>
</body>
</html>

#./bin/catalina.sh run
http://localhost:8080/RBT24CS155_exp_9.jsp
