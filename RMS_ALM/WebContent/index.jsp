<!DOCTYPE html>
<html lang="en">
  <head>
    <title>rms</title>
    <link href="app/css/bootstrap.min.css" rel="stylesheet">
    <link href="app/css/bootstrap-combined.min.css" rel="stylesheet">
  </head>
 
  <body ng-app="project">

  <div class="container-fluid ">
    <ul class="nav nav-pills" id="navlist">
  		<li class="active"><a href="#">Home</a></li>
  		<li><a href="#project/Requirement">Add Requirement</a></li>
  		<li><a href="#project/Requirement/show">Show Requirements</a></li>
  		<li><a href="#project/Requirement/update">Update Requirement</a></li>
  		<li><a href="#project/Requirement/delete">Delete Requirement</a></li>
	</ul>
  </div>
  <div ng-view></div>

    <script type="text/javascript" src="app/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="app/lib/angular/angular.js"></script>
    <script type="text/javascript" src="app/lib/angular/angular-route.min.js"></script>
    <script type="text/javascript" src="app/lib/angular/angular-resource.js"></script>
    <script type="text/javascript" src="app/js/app.js"></script>
    <script type="text/javascript" src="app/js/factory.js"></script>
    <script type="text/javascript" src="app/js/services.js"></script>
    <script type="text/javascript" src="app/js/controllers.js"></script>
    <script type="text/javascript" src="app/js/bootstrap-modal.js"></script>
    <script type="text/javascript" src="app/js/bootstrap-alert.js"></script>
   <script type="text/javascript">
    $(function() {
  		$('#navlist li a').click(function() {
  			$('#navlist li').removeClass();
  			$(this).parent().addClass('active');
  		});
  	});
    </script>
  </body>
</html>