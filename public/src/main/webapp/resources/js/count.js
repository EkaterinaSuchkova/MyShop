/**
 * Created by ���� on 06.04.2016.
 */

$(document).ready(function () {

    $(document).on('click', '.changeCount', function () {
        var $this = $(this);
        var count = $this.data('count');
        $.ajax({
            type: "POST",
            url: "/cart/changeCount",
            data: {
                id: $this.data('id'),
                count: count
            }
        }).done(function (data) {
            console.log(data);
            if (data = 'ok') {
                alert(count);
                $('#count').val(count);
            }
        }).fail(function () {
                alert('�� ��������');
            });
        });
    });


