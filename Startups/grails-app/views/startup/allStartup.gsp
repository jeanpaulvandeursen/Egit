<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII"/>
<meta name="layout" content="main"/>
<title>Startups</title>
</head>
<body>
  <div class="body">
  	<h2>Startups</h2>
  	<ul>
  		<g:each in="${allStartup}" var="startup">
  		<li>
  			<g:link controller="startup" action="index">${startup.name}</g:link>
  		</li>
  		</g:each>
  	</ul>
  </div>
</body>
</html>