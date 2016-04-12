<#include "mainTemplate.ftl">
<@mainTemplate title="Home | MyShop"
styles=["css/bootstrap.min.css","css/font-awesome.min.css","css/prettyPhoto.css","css/price-range.css","css/animate.css","main.css","css/responsive.css"]
scripts=["js/jquery.js","js/bootstrap.min.js","js/jquery.scrollUp.min.js","js/price-range.js","js/jquery.prettyPhoto.js","js/main.js","js/html5shiv.js"]/>
<#macro m_body>

<section id="form"><!--form-->
    <div class="container">
        <div class="row" style="width: 600px; margin-left: 300px">
                <div class="login-form"><!--login form-->
                    <h2>Login to your account</h2>
                    <#if error?has_content>
                        <div style="color: red;">Error! Please, check your email and password!</div>
                    </#if>
                    <form action="/j_spring_security_check" method="post"  name="authForm" id="authForm">
                        <div>
                            <span>Email*</span>
                            <input type="text" name="j_username" />
                        </div>
                        <div>
                            <span class="pass">Password*</span>
                            <input type="password" name="j_password" />
                        </div>
                        <div>
                            <input id="remember_me" name="_spring_security_remember_me" type="checkbox"/>
                            <label for="remember_me" class="inline">Remember me</label>
                        </div>
                        <input type="submit" class="btn btn-primary pull-right" value="Login" />
                        <a href="/reg" style="margin-left: 15px;">Create an account</a>
                    </form>
                </div><!--/login form-->
        </div>
    </div>
</section><!--/form-->
</#macro>

