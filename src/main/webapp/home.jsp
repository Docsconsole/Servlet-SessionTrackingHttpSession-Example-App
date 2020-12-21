<!DOCTYPE html>
<html>
<head></head>
<body>
	<div style="padding-left: 50px; padding-top: 50px;">
		<h2>SessionTrackingHttpSessionApp-Example</h2>
		<form action="homeServlet" style="margin-bottom: 10px;">
			<span style="color: #2c2828;">Name:</span><input type="text" name="userName" /><br />
			<input type="submit" value="Send User Name" style="margin-top: 11px; background-color: #8083ef;">
		</form>
		<span style="color: red;">${requestScope.message}</span>
	</div>
</body>
</html>