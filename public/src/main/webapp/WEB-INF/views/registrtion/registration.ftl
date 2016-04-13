<#assign form=JspTaglibs["http://www.springframework.org/tags/form"]>
<#include "../template/mainTemplate.ftl">
<@mainTemplate title="Home | MyShop"
styles=["css/bootstrap.min.css","css/font-awesome.min.css","css/prettyPhoto.css","css/price-range.css","css/animate.css","main.css","css/responsive.css"]
scripts=["js/jquery.js","js/bootstrap.min.js","js/jquery.scrollUp.min.js","js/price-range.js","js/jquery.prettyPhoto.js","js/main.js","js/html5shiv.js"]/>
<#macro m_body>

<section><!--form-->
    <div class="container">
        <div class="row" style="width: 600px; margin-left: 300px">
                <div class="signup-form"><!--sign up form-->
                    <h2>New User Signup!</h2>
                    <@form.form commandName="regForm" action="/reg" acceptCharset="UTF-8" method="post">
                        <div class="register-top-grid">
                            <h2>PERSONAL INFORMATION</h2>
                        <#--<@form.errors path="*" cssStyle="color: red;" />-->
                            <div>
                                <span>First Name<label>*</label></span>
                                <@form.input path="firstName" cssClass="form-control" />
                                <@form.errors path="firstName" cssStyle="color: red;" />
                            </div>
                            <div>
                                <span>Last Name<label>*</label></span>
                                <@form.input path="lastName" cssClass="form-control" />
                                <@form.errors path="lastName" cssStyle="color: red;" />
                            </div>
                            <div>
                                <span>Email Address<label>*</label></span>
                                <@form.input path="email" cssClass="form-control" />
                                <@form.errors path="email" cssStyle="color: red;" />
                            </div>
                            <div>
                                <span>Phone<label>*</label></span>
                                <@form.input path="phone" cssClass="form-control" />
                                <@form.errors path="phone" cssStyle="color: red;" />
                            </div>
                            <div class="clearfix"> </div>
                            <i class="news-letter">
                                <label class="">
                                    <@form.checkbox path="signIn" cssClass="form-control" />
                                    <i> </i>Sign Up for Newsletter
                                    <@form.errors path="signIn" cssStyle="color: red;" />
                                </label>
                            </i>
                        </div>
                        <div class="register-bottom-grid">
                            <h2>LOGIN INFORMATION</h2>
                            <div>
                                <span>Password<label>*</label></span>
                                <@form.password path="password" cssClass="form-control" />
                                <@form.errors path="password" cssStyle="color: red;" />
                            </div>
                            <div>
                                <span>Confirm Password<label>*</label></span>
                                <@form.password path="confirmPassword" cssClass="form-control" />
                                <@form.errors path="confirmPassword" cssStyle="color: red;" />
                            </div>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="clearfix"> </div>
                        <div class="register-but">
                            <input type="submit" value="submit" class="btn btn-primary pull-right">
                            <div class="clearfix"> </div>
                        </div>
                    </@form.form>
                </div><!--/sign up form-->
            </div>
    </div>
</section><!--/form-->
</#macro>

