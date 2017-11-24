<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Organizador - Torneos</title>
<link href="resources/css/fragments.css" rel="stylesheet">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/libs/DataTables/datatables.min.css"
	rel="stylesheet">
<link href="resources/css/commonStyle.css" rel="stylesheet">
<link href="resources/css/tournamentMultimedia.css" rel="stylesheet">
</head>
<body>
	<div class="container-fluid">

		<jsp:include page="fragment/tournamentManagerHeader.jsp" />
		<jsp:include page="fragment/tournamentSetUpMenu.jsp" />
		<div class="row">
			<div class="col-md-12">
				<h4>Multimedia</h4>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3">
				<img alt="logo" class="img-responsive center-block"
					src="resources/images/logo_placeholder.png">
			</div>
			<div class="col-md-9">
				<img alt="banner" class="img-responsive center-block"
					src="resources/images/banner_placeholder.jpg">
			</div>
		</div>
		<div class="row">
			<div class="col-md-12 multimedia-section">
				<div class="row">
					<div class="col-md-1 center-block">Fotos:</div>
					<div class="col-md-3 col-md-offset-1">
						<img alt="logo" class="img-responsive center-block"
							src="resources/images/logo_placeholder.png">
					</div>
					<div class="col-md-3">
						<img alt="logo" class="img-responsive center-block"
							src="resources/images/logo_placeholder.png">
					</div>
					<div class="col-md-3">
						<img alt="logo" class="img-responsive center-block"
							src="resources/images/logo_placeholder.png">
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12 multimedia-section">
				<div class="row">
					<div class="col-md-1 center-block">Videos:</div>
					<div class="col-md-3 col-md-offset-1">
						<img alt="logo" class="img-responsive center-block"
							src="resources/images/logo_placeholder.png">
					</div>
					<div class="col-md-3">
						<img alt="logo" class="img-responsive center-block"
							src="resources/images/logo_placeholder.png">
					</div>
					<div class="col-md-3">
						<img alt="logo" class="img-responsive center-block"
							src="resources/images/logo_placeholder.png">
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12 multimedia-section">
				<div class="row">
					<div class="col-md-1 center-block">Auspiciadores:</div>
					<div class="col-md-3 col-md-offset-1">
						<img alt="logo" class="img-responsive center-block"
							src="resources/images/logo_placeholder.png">
					</div>
					<div class="col-md-3">
						<img alt="logo" class="img-responsive center-block"
							src="resources/images/logo_placeholder.png">
					</div>
					<div class="col-md-3">
						<img alt="logo" class="img-responsive center-block"
							src="resources/images/logo_placeholder.png">
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<jsp:include page="fragment/footer.jsp" />
		</div>
	</div>
	<script src="resources/js/jquery-3.1.1.js" type="text/javascript"></script>
	<script src="resources/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="resources/libs/DataTables/datatables.min.js"
		type="text/javascript"></script>
	<script src="resources/js/util.js" type="text/javascript"></script>
	<script src="resources/js/tournamentMultimedia.js"
		type="text/javascript"></script>
	<script src="resources/js/tournamentSetUpMenu.js"
		type="text/javascript"></script>
</body>
</html>