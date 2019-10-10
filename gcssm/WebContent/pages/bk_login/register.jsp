<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>

<!DOCTYPE html>
<html lang="en" class="no-js">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Register - Input Form by Tooplate</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/materialize.min.css">
    <link rel="stylesheet" href="css/tooplate.css">
</head>

<body id="register">
    <div class="container">
        <div class="row tm-register-row">
            <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 tm-register-col-l">
                <form action="" method="post">
                    <div class="mb-2">
                        <label class="mr-4">
                            <input class="with-gap" name="title" type="radio" value="mr" />
                            <span>男</span>
                        </label>
                        <label class="mr-4">
                            <input class="with-gap" name="title" type="radio" value="ms" />
                            <span>女</span>
                        </label>
                       
                    </div>

                    <div class="input-field">
                     <input placeholder="用户名" id="first_name" name="first_name" type="text" class="validate">
                    </div>
                    <div class="input-field">
                        <input placeholder="电话" id="last_name" name="last_name" type="text" class="validate">
                    </div>
                    <div class="input-field">
                        <input placeholder="邮箱" id="email" name="email" type="text" class="validate">
                    </div>
                   
                    <div class="input-field">
                        <input placeholder="密码" id="address" name="address" type="password" class="validate">
                    </div>
                    
                     <div class="input-field">
                        <input placeholder="确认密码" id="address" name="address" type="password" class="validate">
                    </div>
                     
                     
                      <div class="form-group mb-2 col-xl-6 col-lg-6 col-md-6 col-12 pr-0 tm-form-group-2-col tm-form-group-2-col-r">
                              
                                <div class="file-field input-field">
                                    <div class="btn btn-white">
                                        <span>更换头像</span>
                                        <input type="file" name="browse">
                                    </div>
                                    <div class="file-path-wrapper">
                                        <input class="file-path validate" name="file" type="text" placeholder="your-file.pdf">
                                    </div>
                                </div>
                            </div>
                    
                        <div class="form-group">
                           
                           <label class="mr-4"><b>关于我的描述</b></label>
                           
                           <textarea class="p-3" name="message" id="message" cols="30" rows="4"></textarea>
                        </div>
                    
                    
                    
                     <div class="input-field">
                        <input placeholder="住址" id="mobile" name="mobile" type="text" class="validate">
                    </div>
                   
                   
                   
                    <div class="text-right mt-4">
                        <button type="submit" class="waves-effect btn-large btn-large-white px-4 black-text">SUBMIT</button>
                    </div>
                </form>
            </div>
            <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 tm-register-col-r">
                <header class="mb-5">
                    <h3 class="mt-0 text-white">REGISTER Yourself</h3>
                    <p class="grey-text">Aenean tincidunt, enim nec blandit lobortis, ante enim ultrices eros, et laoreet augue libero id nunc.
                        Proin semper feugiat ultrices.</p>
                    <p class="grey-text">Aenean a efficitur magna, sed dignissim odio. Praesent pretium lectus ac nunc ultrices, ac volutpat orci
                        viverra.
                    </p>
                </header>

            </div>
        </div>
        <footer class="row tm-mt-big mb-3">
            <div class="col-xl-12">
                <p class="text-center grey-text text-lighten-2 tm-footer-text-small">
                    Copyright &copy; 2018 Company Name     
                    - Design:  Tooplate / More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
            </div>
        </footer>
    </div>

    <script src="js/jquery-3.2.1.slim.min.js"></script>
    <script src="js/materialize.min.js"></script>
    <script>
        $(document).ready(function () {
            $('select').formSelect();
        });
    </script>
</body>

</html>