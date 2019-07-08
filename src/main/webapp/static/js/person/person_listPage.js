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
}).use(['common', 'code', 'laydate', 'jquery', 'form', 'table', 'layer', 'element'], function () {
    var common = layui.common;
    var $ = layui.$;
    var form = layui.form;
    var table = layui.table;
    var layer = layui.layer;
    var element = layui.element;
    var laydate = layui.laydate;

    //执行一个laydate实例
    laydate.render({
        elem: '#test1' //指定元素
    });
    laydate.render({
        elem: '#test2' //指定元素
    });

    /** 表格中的操作列的按钮点击函数 */
    table.on('tool(table)', function (obj) {
        var data = obj.data;
        var event = obj.event;
        /** 显示修改弹出层页面 */
        if (event == 'viewPage') {
            layer.open({
                type: 2,
                area: ['900px', '550px'],
                title: '报名信息',
                content: contextPath + '/person/viewPage.html?id=' + data.id,
                end: function () {
                    // tableReload(table,data);
                }
            });
        } else if (event == 'shenhe') {
            layer.open({
                type: 2,
                area: ['900px', '550px'],
                title: '审核',
                content: contextPath + '/person/shenhePage.html?id=' + data.id,
                end: function () {
                    // tableReload(table,data);
                    $('button[lay-filter = "query"]').click();
                }
            });
        }else if (event == 'eidt') {
            layer.open({
                type: 2,
                area: ['900px', '550px'],
                title: '编辑汽车信息',
                content: contextPath + '/person/editPage.html?id=' + data.id,
                end: function () {
                    // tableReload(table,data);
                   // $('button[lay-filter = "query"]').click();
                    $('.layui-laypage-btn').click();
                }
            });
        } else if (event == 'delete') {
            layer.confirm('您确定要删除该学生基础信息吗？', function (index) {
                layer.load(2);
                let config = {
                    headers: {
                        'Content-Type': 'application/x-www-form-urlencoded; charset=utf-8',
                    }
                }
                const params = new URLSearchParams();
                params.append("id", data.id);
                instance.post(contextPath + '/browser/student/delete', params, config)
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
        } else if (event == 'emptyRegCode') {
            layer.confirm('您确定要删除该学生预约号吗？', function (index) {
                layer.load(2);
                var config = {
                    headers: {
                        'Content-Type': 'application/x-www-form-urlencoded; charset=utf-8',
                    }
                }
                var params = new URLSearchParams();
                params.append("id", data.id);
                instance.post(contextPath + '/person/emptyRegCode', params, config)
                    .then(function (response) {
                        if (response.data.code == 0) {
                            layer.closeAll('loading');
                            layer.msg("删除预约号成功", {
                                icon: 6
                            });
                            $('.layui-laypage-btn').click();
                        } else {
                            var message = response.data.message;
                            var alertMessage = '操作失败,请联系管理员';
                            if (message.length > 0) {
                                alertMessage = '';
                                for (var i = 0; i < message.length; i++) {
                                    alertMessage = alertMessage.concat(message[i] + " ");
                                }
                            }
                           layer.msg(alertMessage, {
                                icon: 5,
                                shift: 6
                            });

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
        } else if (event == 'regeneratorRegCode') {
            layer.confirm('您确定要重新生成该学生预约号吗？', function (index) {
                layer.load(2);
                var config = {
                    headers: {
                        'Content-Type': 'application/x-www-form-urlencoded; charset=utf-8',
                    }
                }
                var params = new URLSearchParams();
                params.append("id", data.id);
                instance.post(contextPath + '/person/reGeneratorRegCode', params, config)
                    .then(function (response) {
                        if (response.data.code == 0) {
                            layer.closeAll('loading');
                            layer.msg("重新生成预约号成功", {
                                icon: 6
                            });
                            $('.layui-laypage-btn').click();
                        } else {
                            var message = response.data.message;
                            var alertMessage = '操作失败,请联系管理员';
                            if (message.length > 0) {
                                alertMessage = '';
                                for (var i = 0; i < message.length; i++) {
                                    alertMessage = alertMessage.concat(message[i] + " ");
                                }
                            }
                            layer.msg(alertMessage, {
                                icon: 5,
                                shift: 6
                            });
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
            title: '新增汽车',
            content: contextPath + '/person/addPage.html',
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
    $("#exportStudent").on("click", function () {
        var url = contextPath + "/person/exportAllStudent";
        $.fileDownload(url, {
            data: {
                name: $("#name").val(),
                idcard: $("#idcard").val(),
                phone: $("#phone").val(),
                birthdayStart: $("#test1").val(),
                birthdayEnd: $("#test2").val(),
                regCodeStart: $("#regCodeStart").val(),
                regCodeEnd: $("#regCodeEnd").val(),
                regCode: $("#regCode").val(),
                census: $("#census").val(),
                createTimeAsc: $("#createTimeAsc").val(),
                chushenStatus: $("#chushenStatus").val()
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
                        window.top.location.href = contextPath + "/loginPage.html";
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


    /** 渲染表格
     * UserNO varchar(10) COLLATE
     UserName varchar(50) COLLA
     Sex varchar(10) COLLATE Ch
     HomeAddress varchar(200) C
     DeptName varchar(200) COLL
     Job varchar(200) COLLATE C
     WorkTime datetime NULL,
     BirthDate datetime NULL,
     IDCard varchar(50) COLLATE
     MaritalStatus varchar(10)
     HighestDegree varchar(50)
     PoliticalStatus varchar(50
     PicPath varchar(256) COLLA
     School varchar(50) COLLATE
     Speciality varchar(50) COL
     ForeignLanguage varchar(20
     Skill varchar(50) COLLATE
     TelNumber varchar(40) COLL
     MobNumber varchar(40) COLL
     ZipCode varchar(30) COLLAT
     NativePlace varchar(200) C
     CPH varchar(20) COLLATE Ch
     CarType varchar(50) COLLAT
     CarColor varchar(50) COLLA
     CarPic varchar(256) COLLAT
     CarPlace varchar(100) COLL
     PersonPhoto image(16) DEFA
     CarPhoto image(16) DEFAULT
      */
    table.render({
        elem: '#table',
        height: 'full-300',
        url: contextPath + '/person/selectAll',
        where: {
            name: ''
        },
        page: {
            layout: ['prev', 'page', 'next', 'skip', 'count', 'limit', 'refresh'],
            limit: 10
        },
        cols: [[{
            field: 'UserName',
            title: '姓名'
        }, {
            field: 'IDCard',
            title: '身份证号'
        }, {
            field: 'MobNumber',
            title: '手机号'
        }, {
            field: 'NativePlace',
            title: '户籍'
        }, {
            field: 'HomeAddress',
            title: '家庭住址'
        }
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
            , {
                title: '操作',
                toolbar: '#bar',
                width:300
            }
        ]],
        done: function (data) {
            //console.log(data);
        }, response: {
            statusName: 'code' //规定数据状态的字段名称，默认：code
            //,statusCode: 200 //规定成功的状态码，默认：0
            //,msgName: 'hint' //规定状态信息的字段名称，默认：msg
            , countName: 'totalElements' //规定数据总数的字段名称，默认：count
            , dataName: 'content' //规定数据列表的字段名称，默认：data
        }
    });


});


