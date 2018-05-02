<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>


<!doctype html>
<html lang="en"><head>
    <meta charset="utf-8">
    <title>Bootstrap Admin</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" type="text/css" href="lib/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">

    <script src="lib/jquery-1.11.1.min.js" type="text/javascript"></script>

        <script src="lib/jQuery-Knob/js/jquery.knob.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function() {
            $(".knob").knob();
        });
    </script>


    <link rel="stylesheet" type="text/css" href="stylesheets/theme.css">
    <link rel="stylesheet" type="text/css" href="stylesheets/premium.css">

</head>
<body class=" theme-blue">

    <!-- Demo page code -->

    <script type="text/javascript">
        $(function() {
            var match = document.cookie.match(new RegExp('color=([^;]+)'));
            if(match) var color = match[1];
            if(color) {
                $('body').removeClass(function (index, css) {
                    return (css.match (/\btheme-\S+/g) || []).join(' ')
                })
                $('body').addClass('theme-' + color);
            }

            $('[data-popover="true"]').popover({html: true});
            
        });
    </script>
    <style type="text/css">
        #line-chart {
            height:300px;
            width:800px;
            margin: 0px auto;
            margin-top: 1em;
        }
        .navbar-default .navbar-brand, .navbar-default .navbar-brand:hover { 
            color: #fff;
        }
    </style>

    <script type="text/javascript">
        $(function() {
            var uls = $('.sidebar-nav > ul > *').clone();
            uls.addClass('visible-xs');
            $('#main-menu').append(uls.clone());
        });
    </script>

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href="../assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
  

  <!--[if lt IE 7 ]> <body class="ie ie6"> <![endif]-->
  <!--[if IE 7 ]> <body class="ie ie7 "> <![endif]-->
  <!--[if IE 8 ]> <body class="ie ie8 "> <![endif]-->
  <!--[if IE 9 ]> <body class="ie ie9 "> <![endif]-->
  <!--[if (gt IE 9)|!(IE)]><!--> 
   
  <!--<![endif]-->

    <div class="navbar navbar-default" role="navigation">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="" href="index.html"><span class="navbar-brand"><span class="fa fa-paper-plane"></span> Aircraft</span></a></div>
		  
		  
		  
		  <div class="navbar-collapse collapse" style="height: 1px;">
          <ul id="main-menu" class="nav navbar-nav navbar-right" style="width:20%">
            <div style="float:left;margin-top:2%;">
			    &nbsp;&nbsp;&nbsp;&nbsp;<a href="#"  >帮助</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#" >退出</a>
				<br>
			 <div><a href="#"  >XX单位XXX用户，欢迎登录！</a></div>
			 </div>
			 
          </ul>

        </div>


      </div>
    </div>
    

    <div class="sidebar-nav">
    <ul>
    <li><a href="#" data-target=".dashboard-menu" class="nav-header" data-toggle="collapse"><i class="fa fa-fw fa-dashboard"></i> 档案管理<i class="fa fa-collapse"></i></a></li>
    <li><ul class="dashboard-menu nav nav-list collapse in">
            <li><a href="index.html"><span class="fa fa-caret-right"></span> 查看档案信息</a></li>
			<li><a href="index.html"><span class="fa fa-caret-right"></span> 添加单文件档案</a></li>
            <li ><a href="users.html"><span class="fa fa-caret-right"></span> 添加多文件档案</a></li>
            <li ><a href="user.html"><span class="fa fa-caret-right"></span> 更改档案记录</a></li>
            <li ><a href="media.html"><span class="fa fa-caret-right"></span> 删除档案主记录</a></li>
            <li ><a href="calendar.html"><span class="fa fa-caret-right"></span> 删除档案明细</a></li>
    </ul></li>


        <li><a href="#" data-target=".legal-menu2" class="nav-header collapsed" data-toggle="collapse"><i class="fa fa-fw fa-legal"></i> 用户信息管理<i class="fa fa-collapse"></i></a></li>
        <li><ul class="legal-menu2 nav nav-list collapse">
            <li ><a href="privacy-policy.html"><span class="fa fa-caret-right"></span> 查看用户信息</a></li>
            <li ><a href="terms-and-conditions.html"><span class="fa fa-caret-right"></span> 添加用户</a></li>
			<li ><a href="privacy-policy.html"><span class="fa fa-caret-right"></span> 更改用户信息</a></li>
            <li ><a href="terms-and-conditions.html"><span class="fa fa-caret-right"></span> 更改用户状态</a></li>
			<li ><a href="privacy-policy.html"><span class="fa fa-caret-right"></span> 修改密码</a></li>
            <li ><a href="terms-and-conditions.html"><span class="fa fa-caret-right"></span> 重置密码</a></li>
			<li ><a href="privacy-policy.html"><span class="fa fa-caret-right"></span> 删除用户</a></li>         
		</ul></li>

		
		<li><a href="#" data-target=".legal-menu3" class="nav-header collapsed" data-toggle="collapse"><i class="fa fa-fw fa-legal"></i> 单位信息<i class="fa fa-collapse"></i></a></li>
        <li><ul class="legal-menu3 nav nav-list collapse">
            <li ><a href="privacy-policy.html"><span class="fa fa-caret-right"></span> 添加单位信息</a></li>
            <li ><a href="terms-and-conditions.html"><span class="fa fa-caret-right"></span> 更改单位信息</a></li>
			<li ><a href="privacy-policy.html"><span class="fa fa-caret-right"></span> 查看单位信息</a></li>
		</ul></li>
		
		<li><a href="#" data-target=".legal-menu4" class="nav-header collapsed" data-toggle="collapse"><i class="fa fa-fw fa-legal"></i> 档案密级管理<i class="fa fa-collapse"></i></a></li>
        <li><ul class="legal-menu4 nav nav-list collapse">
            <li ><a href="privacy-policy.html"><span class="fa fa-caret-right"></span> 添加档案密级</a></li>
            <li ><a href="terms-and-conditions.html"><span class="fa fa-caret-right"></span> 查看档案密级</a></li>
			 <li ><a href="terms-and-conditions.html"><span class="fa fa-caret-right"></span> 更改档案密级</a></li>
		</ul></li>
      
		
		
		<li><a href="#" data-target=".legal-menu5" class="nav-header collapsed" data-toggle="collapse"><i class="fa fa-fw fa-legal"></i> 档案分类管理<i class="fa fa-collapse"></i></a></li>
        <li><ul class="legal-menu5 nav nav-list collapse">
            <li ><a href="privacy-policy.html"><span class="fa fa-caret-right"></span> 查看档案分类信息</a></li>
            <li ><a href="terms-and-conditions.html"><span class="fa fa-caret-right"></span> 添加档案分类信息</a></li>
			 <li ><a href="terms-and-conditions.html"><span class="fa fa-caret-right"></span> 更改档案分类信息</a></li>
		</ul></li>

		
		<li><a href="#" data-target=".legal-menu6" class="nav-header collapsed" data-toggle="collapse"><i class="fa fa-fw fa-legal"></i> 离线处理<i class="fa fa-collapse"></i></a></li>
        <li><ul class="legal-menu6 nav nav-list collapse">
            <li ><a href="privacy-policy.html"><span class="fa fa-caret-right"></span> 导出基本信息</a></li>
            <li ><a href="terms-and-conditions.html"><span class="fa fa-caret-right"></span> 查看用户特征码</a></li>
			<li ><a href="privacy-policy.html"><span class="fa fa-caret-right"></span> 变更用户特征码</a></li>
            <li ><a href="terms-and-conditions.html"><span class="fa fa-caret-right"></span> 离线档案导入</a></li>
		</ul></li>
		
		<li><a href="#" data-target=".legal-menu7" class="nav-header collapsed" data-toggle="collapse"><i class="fa fa-fw fa-legal"></i> 查询与统计<i class="fa fa-collapse"></i></a></li>
        <li><ul class="legal-menu7 nav nav-list collapse">
            <li ><a href="privacy-policy.html"><span class="fa fa-caret-right"></span> 查询</a></li>
            <li ><a href="terms-and-conditions.html"><span class="fa fa-caret-right"></span> 统计</a></li>
		</ul></li>
		
		
		
		<li><a href="#" data-target=".legal-menu8" class="nav-header collapsed" data-toggle="collapse"><i class="fa fa-fw fa-legal"></i> 数据备份<i class="fa fa-collapse"></i></a></li>
        <li><ul class="legal-menu8 nav nav-list collapse">
            <li ><a href="privacy-policy.html"><span class="fa fa-caret-right"></span> 日常备份</a></li>
            <li ><a href="terms-and-conditions.html"><span class="fa fa-caret-right"></span> 清除式备份</a></li>
			<li ><a href="terms-and-conditions.html"><span class="fa fa-caret-right"></span> 数据恢复</a></li>
		</ul></li>
		
		
    </div>

    <div class="content">
        
		<div class="header">
           

            <h1 class="page-title">主题</h1>
                    <ul class="breadcrumb">
            <li><a href="index.html">Home</a> </li>
            <li class="active">Dashboard</li>
        </ul>

        </div>
		
        <div class="main-content">
            


        </div>
    </div>


    <script src="lib/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript">
        $("[rel=tooltip]").tooltip();
        $(function() {
            $('.demo-cancel-click').click(function(){return false;});
        });
    </script>
    
  
</body></html>
