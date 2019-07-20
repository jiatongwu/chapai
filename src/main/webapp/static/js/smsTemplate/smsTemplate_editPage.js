

function uuidv4() {
    return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function (c) {
        var r = Math.random() * 16 | 0, v = c == 'x' ? r : (r & 0x3 | 0x8);
        return v.toString(16);
    });
}

function removeMe(data) {
    var uuid = $(data).attr("uuid");
    var deleteKey = $(data).attr("deleteKey");
    console.log(data);
    $(data).parent().parent().remove();
    console.log(Array.from(uploadFileMap));
    if (uuid != null && uuid != undefined && uuid != "") {
        uploadFileMap.set(uuid, null);
    }
    console.log(Array.from(uploadFileMap));
    if (deleteKey != null && deleteKey != undefined && deleteKey != '') {
        deleteFileSet.add(deleteKey);
    }


}

var contextPath = $("#contextPath").val();
layui.config({
    base: contextPath + '/static/'
}).extend({
    common: 'js/common'
}).use(['common', 'code', 'jquery', 'form', 'table', 'layer', 'laydate', 'element'], function () {
    var common = layui.common;
    var $ = layui.$;
    var form = layui.form;
    var table = layui.table;
    var layer = layui.layer;
    var element = layui.element;
    var laydate = layui.laydate;





    /** 点击搜索按钮时 查询 重新渲染表格 */
    form.on('submit(update)', function (data) {
        layer.load(2);
        var config = {
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded; charset=utf-8',
            }
        }
        //const params = new URLSearchParams();
        var params = new FormData();
        for (var key in data.field) {
            params.append(key, data.field[key]);
        }
        instance.post(contextPath + '/smsTemplate/edit', params, config)
            .then(function (response) {
                layer.closeAll('loading');
                if (response.data.code == 0) {
                    //parent.layer.closeAll('iframe');
                    parent.layer.msg("修改成功", {
                        icon: 6
                    });
                    location.reload();
                    //$('button[lay-filter = "query"]', window.parent.document).click();
                } else if (response.data.code == 13) {
                    location.href = contextPath + '/browser/baseCheck/fastInputPage';
                } else {
                    var message = response.data.message;
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

