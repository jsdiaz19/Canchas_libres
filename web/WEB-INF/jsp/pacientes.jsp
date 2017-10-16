<!DOCTYPE html>
<html lang="en">
<head>
  <title>Portal Terapeuta</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
/*    .row.content {height: 550px}
    
     Set gray background color and 100% height 
    .sidenav {
      background-color: #f1f1f1;
      height: 100%;
      width: 15%;
    }
        
     On small screens, set height to 'auto' for the grid 
    @media screen and (max-width: 1000px) {767
      .row.content {height: auto;} 
    }*/

            .navbar-fixed-left {
      width: 140px;
      position: fixed;
      border-radius: 0;
      height: 100%;
    }
        .navbar-fixed-left .navbar-nav > li {
      float: none;  /* Cancel default li float: left */
      width: 139px;
    }
    
        .navbar-fixed-left + .container {
      padding-left: 160px;
    }

        h1.page-header {
        margin-top: -5px;
    }

    .sidebar {
        padding-left: 0;
    }

    .main-container { 
        background: #FFF;
        padding-top: 15px;
        margin-top: -20px;
    }

    .footer {
        width: 100%;
    }  
    
  </style>

<body>

<nav class="navbar navbar-default navbar-static-top">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">
				Brand
			</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">			
			<form class="navbar-form navbar-left" method="GET" role="search">
				<div class="form-group">
					<input type="text" name="q" class="form-control" placeholder="Search">
				</div>
				<button type="submit" class="btn btn-default"><i class="glyphicon glyphicon-search"></i></button>
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="http://www.pingpong-labs.com" target="_blank">Visit Site</a></li>
				<li class="dropdown ">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
						Account
						<span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li class="dropdown-header">SETTINGS</li>
							<li class=""><a href="#">Other Link</a></li>
							<li class=""><a href="#">Other Link</a></li>
							<li class=""><a href="#">Other Link</a></li>
							<li class="divider"></li>
							<li><a href="#">Logout</a></li>
						</ul>
					</li>
				</ul>
			</div><!-- /.navbar-collapse -->
		</div><!-- /.container-fluid -->
	</nav>
	<div class="container-fluid main-container">
		<div class="col-md-2 sidebar">
			<ul class="nav nav-pills nav-stacked">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="#">Link</a></li>
				<li><a href="#">Link</a></li>
				<li><a href="#">Link</a></li>
				<li><a href="#">Link</a></li>
			</ul>
		</div>
		<div class="col-md-10 content">
            <div class="panel panel-default">
                <div class="panel-heading">
                    Dashboard
                </div>
                <div class="panel-body">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
    			    tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
				quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
				consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
				cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
				proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                </div>
            </div>
		</div>
		<footer class="pull-left footer">
			<p class="col-md-12">
				<hr class="divider">
				Copyright &COPY; 2015 <a href="http://www.pingpong-labs.com">Gravitano</a>
			</p>
		</footer>
	</div>
    
    
<!--    <div class="navbar navbar-inverse navbar-fixed-left">
    <a class="navbar-brand" href="portal.htm" onclick="location.href='${pageContext.request.contextPath}/portal.htm'">ATRLO INCS</a>
    <ul class="nav navbar-nav">
     <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <span class="caret"></span></a>
       <ul class="dropdown-menu" role="menu">
        <li><a href="#">Sub Menu1</a></li>
        <li><a href="#">Sub Menu2</a></li>
        <li><a href="#">Sub Menu3</a></li>
        <li class="divider"></li>
        <li><a href="#">Sub Menu4</a></li>
        <li><a href="#">Sub Menu5</a></li>
       </ul>
     </li>
     <li><a href="pacientes.htm" onclick="location.href='${pageContext.request.contextPath}/pacientes.htm'">Pacientes</a></li>
     <li class="${classActiveSettings}"><a href="#actividad">Actividad</a></li>
     <li><a href="login.htm" onclick="location.href='${pageContext.request.contextPath}/login.htm'">Cerrar Sesión</a></li>
    </ul>
    </div>
    <div class="container">
     <div class="row">
       <h2>Pacientes Asociados</h2>

       <p>Ninguno</p>
     </div>
    </div>    
    -->



</body>
</html>