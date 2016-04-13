/**
 * Created by Катя on 12.04.2016.
 */

$(document).ready(function () {

    //$(document).on('blur','#count', function () {
    //    var $this = $(this);
    //    var count = $this.getValue();
    //    var id = $this.data('id');
    //    $.ajax({
    //        type: "POST",
    //        url: "/cart/changeCount2",
    //        data: {
    //            id: id,
    //            count: count
    //        }
    //    }).done(function (data) {
    //        console.log(data);
    //        if (data = 'ok') {
    //            alert(count);
    //            $('#count').val(count);
    //        }
    //    }).fail(function () {
    //        alert('не работает');
    //    });
    //});
    $("#count").blur(function () {
        var $this = $(this);
        var count = $this.val();
        var id = $this.data('id');
        $.ajax({
            type: "POST",
            url: "/cart/changeCount2",
            data: {
                id: id,
                count: count
            }
        }).done(function (data) {
            console.log(data);
            if (data = 'ok') {
                alert(count);
                $('#count').val(count);
                var parent=$this.parents("tr");
                var price=parent.find(".cart_price").find("p").html();
                parent.find("p.cart_total_price").html(count*price);

            }
        }).fail(function () {
            alert('не работает');
        });
    });
});
