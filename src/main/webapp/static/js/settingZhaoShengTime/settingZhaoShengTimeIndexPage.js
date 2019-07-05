var contextPath = $("#contextPath").val();
layui.use(['code', 'jquery', "laydate", 'form', 'table', 'layer', 'element'], function () {

    var $ = layui.$;
    var form = layui.form;

    var layer = layui.layer;
    var laydate = layui.laydate;

    //执行一个laydate实例
    laydate.render({
        elem: '#zhaoShengStartTimeValue',
        type: 'datetime'
    });
    laydate.render({
        elem: '#zhaoShengEndTimeValue',
        type: 'datetime'
    });


    form.on('submit(update)', function (data) {
        "use strict";
        var config = {
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded; charset=utf-8',
            }
        }
        const params = new URLSearchParams();
        for (var key in data.field) {
            params.append(key, data.field[key]);
        }
        instance.post(contextPath + '/saveSettingZhaoShengTime', params, config)
            .then(function (res) {
                layer.closeAll('loading');
                if (res.data.code == 0) {
                    parent.layer.closeAll('iframe');
                    parent.layer.msg("设置成功", {
                        icon: 6
                    });
                    // $('button[lay-filter = "query"]', window.parent.document).click();
                    location.reload();
                } else if (res.data.code == 2) {
                    layer.confirm('您已超时请重新登录？', function (index) {
                        // (window.top === window.self) || (window.top.location.href =
                        // window.self.location.href);
                        window.top.location.href = contextPath + "/loginPage.html";
                    });
                } else if (res.data.code == 3) {
                    layer.msg("没有权限", {
                        icon: 6
                    });
                } else {//if (res.data.code == 1) {
                    var message = res.data.message;
                    var alertMessage = '操作失败';
                    if (message.length > 0) {
                        alertMessage = '';
                        for (var i = 0; i < message.length; i++) {
                            alertMessage = alertMessage.concat(message[i] + " ");
                        }
                    }
                    parent.layer.msg(alertMessage, {
                        icon: 5,
                        shift: 6
                    });
                }
            })
            .catch(function (error) {
                layer.closeAll('loading');

            });
        return false;
    });


});

