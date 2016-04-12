<#include "mainTemplate.ftl">
<@mainTemplate title="Home | MyShop"
styles=["css/bootstrap.min.css","css/font-awesome.min.css","css/prettyPhoto.css","css/price-range.css","css/animate.css","main.css","css/responsive.css"]
scripts=["js/jquery.js","js/bootstrap.min.js","js/jquery.scrollUp.min.js","js/price-range.js","js/jquery.prettyPhoto.js","js/main.js","js/html5shiv.js"]/>
<#macro m_body>

<section id="cart_items">
    <div class="container">
        <div class="breadcrumbs">
            <ol class="breadcrumb">
                <li><a href="#">Home</a></li>
                <li class="active">Shopping Cart</li>
            </ol>
        </div>
        <div class="table-responsive cart_info">
            <table class="table table-condensed">
                <thead>
                <tr class="cart_menu">
                    <td class="image">Item</td>
                    <td class="description"></td>
                    <td class="price">Price</td>
                    <td class="quantity">Quantity</td>
                    <td class="total">Total</td>
                    <td></td>
                </tr>
                </thead>
                <tbody>
                 <#if ((Session.cart.goods)![])?size != 0 >
                    <#list Session.cart.goods?keys as goodId>
                <tr>
                    <td class="cart_product">
                        <a href=""><img src="/resources/images/home/${good[goodId?number-1].imageUrl}" alt="" width="110" height="110"></a>
                    </td>
                    <td class="cart_description">
                        <h4><a href="">${good[goodId?number-1].name}</a></h4>
                        <p>${goodId}</p>
                    </td>
                    <td class="cart_price">
                        <p>${good[goodId?number-1].price?number}</p>
                    </td>
                    <td class="cart_quantity">
                        <div class="cart_quantity_button">
                            <a class="cart_quantity_up changeCount" data-id="${goodId}" data-count="${Session.cart.getCount(goodId)+1}" href="#"> + </a>
                            <input id="count" class="cart_quantity_input" type="text" name="quantity" value="${Session.cart.getCount(goodId)}" autocomplete="off" size="2">
                            <a class="cart_quantity_down changeCount" data-id="${goodId}" data-count="${Session.cart.getCount(goodId)-1}" href="#"> - </a>
                        ${Session.cart.getCount(goodId)}
                        </div>
                    </td>
                    <td class="cart_total">
                        <p class="cart_total_price">${Session.cart.getCount(goodId)*good[goodId?number-1].price?number}</p>
                    </td>
                    <td class="cart_delete">
                        <a class="cart_quantity_delete" href="/cart/delete/${goodId}"><i class="fa fa-times"></i></a>
                    </td>
                </tr>
                </tr>
                </#list>

                </tbody>
            </table>
                    <#else>
                        <h1 align="center">Ваша корзина пуста!</h1>
                    </#if>
        </div>
    </div>
    <#if ((Session.cart.goods)![])?size != 0 >
    <h1 align="center"> <a href="/order" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Buy All</a></h1>

    </#if>

</section> <!--/#cart_items-->

<section id="do_action">
    <div class="container">
        <div class="heading">
            <h3>What would you like to do next?</h3>
            <p>Choose if you have a discount code or reward points you want to use or would like to estimate your delivery cost.</p>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <div class="chose_area">
                    <ul class="user_option">
                        <li>
                            <input type="checkbox">
                            <label>Use Coupon Code</label>
                        </li>
                        <li>
                            <input type="checkbox">
                            <label>Use Gift Voucher</label>
                        </li>
                        <li>
                            <input type="checkbox">
                            <label>Estimate Shipping & Taxes</label>
                        </li>
                    </ul>
                    <ul class="user_info">
                        <li class="single_field">
                            <label>Country:</label>
                            <select>
                                <option>United States</option>
                                <option>Bangladesh</option>
                                <option>UK</option>
                                <option>India</option>
                                <option>Pakistan</option>
                                <option>Ucrane</option>
                                <option>Canada</option>
                                <option>Dubai</option>
                            </select>

                        </li>
                        <li class="single_field">
                            <label>Region / State:</label>
                            <select>
                                <option>Select</option>
                                <option>Dhaka</option>
                                <option>London</option>
                                <option>Dillih</option>
                                <option>Lahore</option>
                                <option>Alaska</option>
                                <option>Canada</option>
                                <option>Dubai</option>
                            </select>

                        </li>
                        <li class="single_field zip-field">
                            <label>Zip Code:</label>
                            <input type="text">
                        </li>
                    </ul>
                    <a class="btn btn-default update" href="">Get Quotes</a>
                    <a class="btn btn-default check_out" href="">Continue</a>
                </div>
            </div>
            <div class="col-sm-6">
                <div class="total_area">
                    <ul>
                        <li>Cart Sub Total <span>$59</span></li>
                        <li>Eco Tax <span>$2</span></li>
                        <li>Shipping Cost <span>Free</span></li>
                        <li>Total <span>$61</span></li>
                    </ul>
                    <a class="btn btn-default update" href="">Update</a>
                    <a class="btn btn-default check_out" href="">Check Out</a>
                </div>
            </div>
        </div>
    </div>
</section><!--/#do_action-->

<script src="/resources/js/jquery.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>
<script src="/resources/js/jquery.scrollUp.min.js"></script>
<script src="/resources/js/jquery.prettyPhoto.js"></script>
<script src="/resources/js/main.js"></script>
</#macro>