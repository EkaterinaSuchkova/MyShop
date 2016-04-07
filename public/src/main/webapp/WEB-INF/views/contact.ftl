<#assign form=JspTaglibs["http://www.springframework.org/tags/form"]>
<#include "mainTemplate.ftl">
<@mainTemplate title="Home | MyShop"
styles=["css/bootstrap.min.css","css/font-awesome.min.css","css/prettyPhoto.css","css/price-range.css","css/animate.css","main.css","css/responsive.css"]
scripts=["js/jquery.js","js/bootstrap.min.js","js/jquery.scrollUp.min.js","js/price-range.js","js/jquery.prettyPhoto.js","js/main.js","js/html5shiv.js"]/>
<#macro m_body>

<div class="row" style="width: 600px; margin-left: 300px">
    <div class="contact-form">
        <@form.form commandName="contactForm" action="/contact" acceptCharset="UTF-8" method="post">
            <h2 class="title text-center">Contact form</h2>
            <div class="status alert alert-success" style="display: none"></div>
            <div class="form-group col-md-6">
                <span>Surname<label>*</label></span>
                <br>
                <@form.input path="surName"  cssClass="form-control" />
                <@form.errors path="surName" cssStyle="color: red;" />
            </div>
            <div class="form-group col-md-6">
                <span>Name<label>*</label></span>
                <br>
                <@form.input path="name"  cssClass="form-control" />
                <@form.errors path="name" cssStyle="color: red;" />
            </div>
            <div class="form-group col-md-6">
                <span>E-mail<label>*</label></span>
                <br>
                <@form.input path="email"  cssClass="form-control" />
                <@form.errors path="email" cssStyle="color: red;" />
            </div>
            <div class="form-group col-md-12">
                <span>Your message<label>*</label></span>
                <br>
                <@form.textarea path="message"  cssClass="form-control" />
                <@form.errors path="message" cssStyle="color: red;" />
            </div>

            <div class="form-group col-md-12">
                <a href=""><input type="submit" name="submit" class="btn btn-primary pull-right" value="Submit"></a>
            </div>
        </@form.form>
    </div>
</div>
<!--/#contact-page-->
<script src="/resources/js/jquery.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>
<script src="/resources/js/jquery.scrollUp.min.js"></script>
<script src="/resources/js/jquery.prettyPhoto.js"></script>
<script src="/resources/js/main.js"></script>
</#macro>
