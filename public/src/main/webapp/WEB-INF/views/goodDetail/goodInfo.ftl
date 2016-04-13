<#include "../template/mainTemplate.ftl">
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
                                        <#list categoryManMenu as menu>
                                            <li><a href="/catalog/${menu.id}">${menu.name}</a> </li>
                                        <#--<li><a href="/catalog/4">Shirts</a></li>-->
                                        <#--<li><a href="#">Jeans</a></li>-->
                                        <#--<li><a href="#">Jacket</a></li>-->
                                        <#--<li><a href="#">Footwear</a></li>-->
                                        <#--<li><a href="/catalog/2">All men products</a></li>-->
                                        </#list>
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
                                        <#list categoryWomanMenu as menu>
                                            <li><a href="/catalog/${menu.id}">${menu.name}</a> </li>
                                        <#--<li><a href="/catalog/3">Shirts</a></li>-->
                                        <#--<li><a href="#">Jeans</a></li>-->
                                        <#--<li><a href="/catalog/7">Dress</a></li>-->
                                        <#--<li><a href="#">Footwear</a></li>-->
                                        <#--<li><a href="/catalog/1">All womans products</a></li>-->
                                        </#list>
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
                    </div><!--/category-products-->


                    <div class="brands_products"><!--brands_products-->
                        <h2>Filters</h2>
                        <form method="get" action="/filter">
                            <div class="brands-name">
                                <p align="center"><b>Color</b><Br>
                                    <input type="radio" name="color" value="Blue">Blue<Br>
                                    <input type="radio" name="color" value="Red">Red<Br>
                                    <input type="radio" name="color" value="Black">Black<Br>
                                </p>
                                <p align="center"><b>Size</b><Br>
                                    <input type="radio" name="size" value="42">42<Br>
                                    <input type="radio" name="size" value="44">44<Br>
                                    <input type="radio" name="size" value="46">46<Br>
                                </p>
                            <#--<ul class="nav nav-pills nav-stacked">-->
                            <#--<li><a href="#"> <span class="pull-right">(50)</span>Acne</a></li>-->
                            <#--<li><a href="#"> <span class="pull-right">(56)</span>Gr?ne Erde</a></li>-->
                            <#--<li><a href="#"> <span class="pull-right">(27)</span>Albiro</a></li>-->
                            <#--<li><a href="#"> <span class="pull-right">(32)</span>Ronhill</a></li>-->
                            <#--<li><a href="#"> <span class="pull-right">(5)</span>Oddmolly</a></li>-->
                            <#--<li><a href="#"> <span class="pull-right">(9)</span>Boudestijn</a></li>-->
                            <#--<li><a href="#"> <span class="pull-right">(4)</span>R?sch creative culture</a></li>-->
                            <#--</ul>-->

                                <!--/brands_products-->

                                <div class="price-range"><!--price-range-->
                                    <h2>Price Range</h2>
                                    <div class="well text-center">
                                        <p align="center"><b>Min price</b><Br>
                                            <input type="number" class="form-control" name="min" value="0"><br />
                                        </p>
                                        <p align="center"><b>Max price</b><Br>
                                            <input type="number" class="form-control" name="max" value="100000"><br />
                                        </p>
                                    </div>
                                </div><!--/price-range-->
                            </div>
                    </div>
                    <input type="submit" name="submit" class="btn btn-primary pull-right" value="Submit">
                    </form>
                    <br>
                </div>
            </div>
            <br>
            <br>

            <div class="col-sm-9 padding-right">
                <div class="product-details"><!--product-details-->
                    <div class="col-sm-5">
                        <div class="view-product">
                            <img src="/resources/images/home/${goodInfo.imageUrl}" alt="" />
                            <h3>ZOOM</h3>
                        </div>
                        <div id="similar-product" class="carousel slide" data-ride="carousel">

                            <!-- Wrapper for slides -->
                            <div class="carousel-inner">
                                <div class="item active">
                                    <a href=""><img src="/resources/images/product-details/similar1.jpg" alt=""></a>
                                    <a href=""><img src="/resources/images/product-details/similar2.jpg" alt=""></a>
                                    <a href=""><img src="/resources/images/product-details/similar3.jpg" alt=""></a>
                                </div>
                                <div class="item">
                                    <a href=""><img src="/resources/images/product-details/similar1.jpg" alt=""></a>
                                    <a href=""><img src="/resources/images/product-details/similar2.jpg" alt=""></a>
                                    <a href=""><img src="/resources/images/product-details/similar3.jpg" alt=""></a>
                                </div>
                                <div class="item">
                                    <a href=""><img src="/resources/images/product-details/similar1.jpg" alt=""></a>
                                    <a href=""><img src="/resources/images/product-details/similar2.jpg" alt=""></a>
                                    <a href=""><img src="/resources/images/product-details/similar3.jpg" alt=""></a>
                                </div>

                            </div>

                            <!-- Controls -->
                            <a class="left item-control" href="#similar-product" data-slide="prev">
                                <i class="fa fa-angle-left"></i>
                            </a>
                            <a class="right item-control" href="#similar-product" data-slide="next">
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </div>

                    </div>
                    <div class="col-sm-7">
                        <div class="product-information"><!--/product-information-->
                            <img src="images/product-details/new.jpg" class="newarrival" alt="" />
                            <h2>${goodInfo.name}</h2>
                            <p>ID: ${goodInfo.id}</p>
                            <img src="images/product-details/rating.png" alt="" />
								<span>
									<span>${goodInfo.price?number}</span>
									<a href="/cart/add/${goodInfo.id}"> <button type="button" class="btn btn-fefault cart">
                                        <i class="fa fa-shopping-cart"></i>
                                        Add to cart
                                    </button></a>
								</span>
                            <p><b>Availability:</b> In Stock</p>
                            <p><b>Condition:</b> ${goodInfo.status}</p>
                            <p><b>Description:</b>${goodInfo.description}</p>
                            <a href=""><img src="images/product-details/share.png" class="share img-responsive"  alt="" /></a>
                        </div><!--/product-information-->
                    </div>
                </div><!--/product-details-->


        </div>
        <!--/price-range-->
    </div>


</section>

</#macro>