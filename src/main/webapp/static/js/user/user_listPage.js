Date.prototype.Format = function (fmt) {
    var o = {
        "M+": this.getMonth() + 1,                 // 月份
        "d+": this.getDate(),                    // 日
        "h+": this.getHours(),                   // 小时
        "m+": this.getMinutes(),                 // 分
        "s+": this.getSeconds(),                 // 秒
        "q+": Math.floor((this.getMonth() + 3) / 3), // 季度
        "S": this.getMilliseconds()             // 毫秒
    };
    if (/(y+)/.test(fmt))
        fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt))
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}
var contextPath = $("#contextPath").val();

layui.config({
    base: contextPath + '/static/'
}).extend({
    common: 'js/common'
}).use(['common', 'code', 'jquery', 'form', 'table', 'layer', 'element'], function () {
    var common = layui.common;
    var $ = layui.$;
    var form = layui.form;
    var table = layui.table;
    var layer = layui.layer;
    var element = layui.element;
    /** 表格中的操作列的按钮点击函数 */
    table.on('tool(table)', function (obj) {
        var data = obj.data;
        var event = obj.event;
        /** 显示修改弹出层页面 */
        if (event == 'editPage') {
            layer.open({
                type: 2,
                area: ['600px', '600px'],
                title: '修改学生基础信息',
                content: contextPath + '/user/editPage.html?id=' + data.id,
                end: function () {
                    // tableReload(table,data);
                    $('.layui-laypage-btn').click();
                }
            });
        } else if (event == 'delete') {
            layer.confirm('您确定要删除该用户吗？', function (index) {
                layer.load(2);
                var config = {
                    headers: {
                        'Content-Type': 'application/x-www-form-urlencoded; charset=utf-8',
                    }
                }
                var params = new URLSearchParams();
                params.append("id", data.id);
                instance.post(contextPath + '/user/delete', params, config)
                    .then(function (response) {
                        if (response.data.code == 0) {
                            layer.closeAll('loading');
                            layer.msg("删除成功", {
                                icon: 6
                            });
                            $('.layui-laypage-btn').click();
                        } else {
                            var message = response.data.message;
                            if (message.length > 0) {
                                layer.msg(message.toString(), {
                                    icon: 5,
                                    shift: 6
                                });
                            } else {
                                layer.msg('操作失败', {
                                    icon: 5,
                                    shift: 6
                                });
                            }
                            layer.closeAll('loading');
                        }
                    })
                    .catch(function (error) {
                        layer.closeAll('loading');
                        // layer.msg("后台出错", {
                        // icon : 5,
                        // shift : 6
                        // });
                    });
                layer.close(index);
            });
        } else if (event == 'resetPwd') {
            layer.confirm('您确定重置该用户密码吗？', function (index) {
                layer.load(2);
                var config = {
                    headers: {
                        'Content-Type': 'application/x-www-form-urlencoded; charset=utf-8',
                    }
                }
                var params = new URLSearchParams();
                params.append("id", data.id);
                instance.post(contextPath + '/user/resetPwd', params, config)
                    .then(function (response) {
                        if (response.data.code == 0) {
                            layer.closeAll('loading');
                            var type ="auto"
                                ,text =response.data.data;

                            layer.open({
                                type: 1
                                ,offset: type //具体配置参考：http://www.layui.com/doc/modules/layer.html#offset
                                ,id: 'layerDemo'+type //防止重复弹出
                                ,content: '<div style="padding: 20px 100px;">新密码：'+ text +'</div>'
                                ,btn: '我知道了'
                                ,btnAlign: 'c' //按钮居中
                                ,shade: 0 //不显示遮罩
                                ,yes: function(){
                                    layer.closeAll();
                                }
                            });
                        } else {
                            var message = response.data.message;
                            if (message.length > 0) {
                                layer.msg(message.toString(), {
                                    icon: 5,
                                    shift: 6
                                });
                            } else {
                                layer.msg('操作失败', {
                                    icon: 5,
                                    shift: 6
                                });
                            }

                            layer.closeAll('loading');

                        }
                    })
                    .catch(function (error) {
                        layer.closeAll('loading');
                        // layer.msg("后台出错", {
                        // icon : 5,
                        // shift : 6
                        // });
                    });
                layer.close(index);
            });
        }
    });

    $("#add").on("click", function () {
        var namePara = $("input[name='name']").val();
        var e = layer.open({
            type: 2,
            area: ['500px', '600px'],
            title: '新增用户',
            content: contextPath + '/user/addPage.html',
            end: function () {
                // tableReload(table,data);
                // layer.load(2);
                // table.reload('table', {
                // where:{name:namePara},
                // page: {
                // curr: 1
                // },
                // done: function (res, curr, count) {
                // layer.closeAll('loading');
                // if (res.state == 'over') {
                // jumpToUrl( contextPath +res.url);
                // }
                // }
                // });

            }
        });
    });
    $("#importExcelPage").on("click", function () {
        var e = layer.open({
            type: 2,
            area: ['800px', '600px'],
            title: '导入学生基础信息',
            content: contextPath + '/user/importExcelPage',
            end: function () {
                $('button[lay-filter = "query"]').click();
            }
        });
    });

    /** 点击搜索按钮时 查询 重新渲染表格 */
    form.on('submit(query)', function (data) {
        layer.load(2);
        table.reload('table', {
            where: data.field,
            page: {
                curr: 1
            },
            done: function (res, curr, count) {

                layer.closeAll('loading');
                if (res.state == 'over') {
                    jumpToUrl(contextPath + res.url);
                }
                //console.log(res);
                if (res.code == 2) {
                    layer.confirm('您已超时请重新登录？', function (index) {
                        // (window.top === window.self) || (window.top.location.href =
                        // window.self.location.href);
                        window.top.location.href = contextPath + "/browser/";
                    });
                } else if (res.code == 3) {
                    layer.msg("没有权限", {
                        icon: 6
                    });
                }
            }
        });
        return false;
    });

    $('#exportStudent').on('click', function () {
        var url = contextPath + "/user/exportStudent";
        $.fileDownload(url, {
            data: {
                name: $("#name").val(),
                gender: $("#gender").val(),
                phone: $("#phone").val(),
                countyName: $("#countyName").val(),
                createTimeDesc: $("#createTimeDesc").val(),
                schoolName: $("#schoolName").val()
            },
            prepareCallback: function (url) {
                layer.load(2);
            },
            successCallback: function (url) {
                layer.closeAll('loading');
            },
            failCallback: function (html, url) {
                layer.closeAll('loading');
                layer.msg("导出失败请联系管理员");
            }
        });
    });
    //监听锁定操作
    form.on('checkbox(lockDemo)', function (obj) {
       // console.log(obj.elem.checked);
       // console.log(obj.elem);
       // console.log(this.value + ' ' + this.name + '：'+ obj.elem.checked, obj.othis);
        var config = {
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded; charset=utf-8',
            }
        }
        var params = new URLSearchParams();
        params.append("id", $(obj.elem).attr("myid"));
        var disabledStatus=obj.elem.checked?1:0;
        params.append("disabled",disabledStatus);
        instance.post(contextPath + '/user/disabled', params, config)
            .then(function (response) {
                if (response.data.code == 0) {
                    layer.closeAll('loading');
                    if(disabledStatus==1){
                        layer.msg("禁用成功", {
                            icon: 6
                        });
                    }else if(disabledStatus==0){
                        layer.msg("启用成功", {
                            icon: 6
                        });
                    }

                    $('.layui-laypage-btn').click();
                } else {
                    var message = response.data.message;
                    if (message.length > 0) {
                        layer.msg(message.toString(), {
                            icon: 5,
                            shift: 6
                        });
                    } else {
                        layer.msg('操作失败', {
                            icon: 5,
                            shift: 6
                        });
                    }

                    layer.closeAll('loading');

                }
            })
            .catch(function (error) {
                layer.closeAll('loading');
                // layer.msg("后台出错", {
                // icon : 5,
                // shift : 6
                // });
            });
        $('.layui-laypage-btn').click();
    });

    /** 渲染表格 */
    table.render({
        elem: '#table',
        height: 'full-300',
        url: contextPath + '/user/selectAll',
        where: {
            name: ''
        },
        page: {
            layout: ['prev', 'page', 'next', 'skip', 'count', 'limit', 'refresh'],
            limit: 10
        },
        cols: [[{
            field: 'username',
            title: '登录名'
        }, {
            field: 'name',
            title: '真实姓名'
        },
            {
                field: 'roleNames',
                title: '拥有的角色'
            }, {field: 'disabled', title: '是否禁用', width: 110, templet: '#userDisableTpl', unresize: true}, {
            field: 'createTime',
            title: '创建时间',
            templet: function (d) {
                var createTime = d.createTime;
                console.log(createTime);
                if (createTime == null) {
                    return "";
                }
                return new Date(createTime).Format("yyyy-MM-dd hh:mm:ss");
            }
        },
            /*{
            field: '',
            title: '是否禁用'
        }, */

            // , {
            // field: 'createTime',
            // title: '报名时间',
            // templet: function(d){
            // var createTime=d.createTime;
            // console.log(createTime);
            // if(createTime==null){
            // return "";
            // }
            // return new Date(createTime).Format("yyyy-MM-dd hh:mm:ss");
            // }
            // },
            {
                title: '操作',
                toolbar: '#bar'
            }
        ]],
        done: function (data) {
            console.log(data);
        }, response: {
            statusName: 'code' //规定数据状态的字段名称，默认：code
            //,statusCode: 200 //规定成功的状态码，默认：0
            //,msgName: 'hint' //规定状态信息的字段名称，默认：msg
            , countName: 'totalElements' //规定数据总数的字段名称，默认：count
            , dataName: 'content' //规定数据列表的字段名称，默认：data
        }
    });


});


