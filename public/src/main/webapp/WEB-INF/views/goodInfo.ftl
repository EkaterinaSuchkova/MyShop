<#include "mainTemplate.ftl">
<@mainTemplate title="Home | MyShop"
styles=["css/bootstrap.min.css","css/font-awesome.min.css","css/prettyPhoto.css","css/price-range.css","css/animate.css","main.css","css/responsive.css"]
scripts=["js/jquery.js","js/bootstrap.min.js","js/jquery.scrollUp.min.js","js/price-range.js","js/jquery.prettyPhoto.js","js/main.js","js/html5shiv.js"]/>
<#macro m_body>
<section>
    <div class="container">
        <div class="row">
            <div class="col-sm-3">
                <div class="left-sidebar">
                    <h2>Category</h2>

                    <div class="panel-group category-products" id="accordian"><!--category-productsr-->
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h4 class="panel-title">
                                    <a data-toggle="collapse" data-parent="#accordian" href="#sportswear">
                                        <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                        Sportswear
                                    </a>
                                </h4>
                            </div>
                            <div id="sportswear" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <ul>
                                        <li><a href="#">Nike </a></li>
                                        <li><a href="#">Under Armour </a></li>
                                        <li><a href="#">Adidas </a></li>
                                        <li><a href="#">Puma</a></li>
                                        <li><a href="#">ASICS </a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h4 class="panel-title">
                                    <a data-toggle="collapse" data-parent="#accordian" href="#mens">
                                        <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                        Mens
                                    </a>
                                </h4>
                            </div>
                            <div id="mens" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <ul>
                                        <li><a href="/catalog/4">Shirts</a></li>
                                        <li><a href="#">Jeans</a></li>
                                        <li><a href="#">Jacket</a></li>
                                        <li><a href="#">Footwear</a></li>
                                        <li><a href="/catalog/2">All men products</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>

                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h4 class="panel-title">
                                    <a data-toggle="collapse" href="#womens">
                                        <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                        Womens
                                    </a>
                                </h4>
                            </div>
                            <div id="womens" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <ul>
                                        <li><a href="/catalog/3">Shirts</a></li>
                                        <li><a href="#">Jeans</a></li>
                                        <li><a href="/catalog/7">Dress</a></li>
                                        <li><a href="#">Footwear</a></li>
                                        <li><a href="/catalog/1">All womans products</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h4 class="panel-title"><a href="#">Kids</a></h4>
                            </div>
                        </div>
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h4 class="panel-title"><a href="#">Fashion</a></h4>
                            </div>
                        </div>
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h4 class="panel-title"><a href="#">Households</a></h4>
                            </div>
                        </div>
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h4 class="panel-title"><a href="#">Interiors</a></h4>
                            </div>
                        </div>
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h4 class="panel-title"><a href="#">Clothing</a></h4>
                            </div>
                        </div>
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h4 class="panel-title"><a href="#">Bags</a></h4>
                            </div>
                        </div>
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h4 class="panel-title"><a href="#">Shoes</a></h4>
                            </div>
                        </div>
                    </div>
                    <!--/category-products-->

                    <div class="brands_products"><!--brands_products-->
                        <h2>Brands</h2>

                        <div class="brands-name">
                            <ul class="nav nav-pills nav-stacked">
                                <li><a href="#"> <span class="pull-right">(50)</span>Acne</a></li>
                                <li><a href="#"> <span class="pull-right">(56)</span>Gr?ne Erde</a></li>
                                <li><a href="#"> <span class="pull-right">(27)</span>Albiro</a></li>
                                <li><a href="#"> <span class="pull-right">(32)</span>Ronhill</a></li>
                                <li><a href="#"> <span class="pull-right">(5)</span>Oddmolly</a></li>
                                <li><a href="#"> <span class="pull-right">(9)</span>Boudestijn</a></li>
                                <li><a href="#"> <span class="pull-right">(4)</span>R?sch creative culture</a></li>
                            </ul>
                        </div>
                    </div>
                    <!--/brands_products-->

                    <div class="price-range"><!--price-range-->
                        <h2>Price Range</h2>

                        <div class="well text-center">
                            <input type="text" class="span2" value="" data-slider-min="0" data-slider-max="600"
                                   data-slider-step="5" data-slider-value="[250,450]" id="sl2"><br/>
                            <b class="pull-left">$ 0</b> <b class="pull-right">$ 600</b>
                        </div>
                    </div>
                </div>
            </div>
            <br>
            <br>

            <div class="col-sm-9 padding-right">
                <div class="features_items">
                    <div style="width: 350px; height: 430px; border: 1px solid #000;">
                        <p align="center"><img src="/resources/images/home/${goodInfo.imageUrl}" alt=""/>
                        <h4 align="center">Наименование товара:${goodInfo.name}</h4>
                        <h4 align="center">Цена товара: ${goodInfo.price?number}</h4>
                        <h4 align="center">Id товара:${goodInfo.id}</h4>
                        <h4 align="center">Описание товара:${goodInfo.description}</h4></p>
                    </div>
                    <br>
                        <a href="/cart/add/${goodInfo.id}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                </div>
            </div>
        </div>
        <!--/price-range-->
    </div>


</section>

</#macro>