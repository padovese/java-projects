<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Mapa de Skills</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="/css/lib/bootstrap.min.css">
  <link rel="stylesheet" href="/css/app/main.css">
  <script src="/js/lib/jquery.min.js"></script>
  <script src="/js/lib/bootstrap.min.js"></script>
  <style>
    /* Set height of the grid so .sidenav can be 100% (adjust if needed) */
    .row.content {height: 1500px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height: auto;} 
    }
  </style>
</head>
<body>

<div class="container-fluid">
  <div class="row content">
    <div class="col-sm-2 sidenav">
      <h4>Mapa de Skills</h4>
      <img id="logo" src="/images/logo.jpg">
      <ul class="nav nav-pills nav-stacked">
        <li class="active"><a href="#section1">Dashboard</a></li>
        <li><a href="#section2">Mapa de Skills</a></li>
        <li><a href="#section3">Cadastro de Skill</a></li>
        <li><a href="#section3">Cadastro de Dev</a></li>
      </ul><br>
      <div class="input-group">
        <input type="text" class="form-control" placeholder="Search Blog..">
        <span class="input-group-btn">
          <button class="btn btn-default" type="button">
            <span class="glyphicon glyphicon-search"></span>
          </button>
        </span>
      </div>
    </div>

    <div class="col-sm-10">
      <h4><small>RECENT POSTS</small></h4>
      <hr>

    </div>
  </div> 
</div>

<footer class="container-fluid">

 <div class="div-logo-github"><img id="logo-github" src="/images/Octocat.png"></div>
  <div class="div-text-github">/padovese</div>

</footer>

</body>
</html>
