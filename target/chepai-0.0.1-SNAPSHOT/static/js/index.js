var contextPath=$("#contextPath").val();
/** 成功提示 */
function showOkMsg(msg) {
	layer.msg(msg, {
		icon : 6
	});
}

/** 父页面成功提示 */
function parentShowOkMsg(msg) {
	parent.layer.msg(msg, {
		icon : 6
	});
	parent.layer.closeAll('iframe');
}

/** 失败提示 */
function showFailMsg(msg) {
	layer.msg(msg, {
		icon : 5,
		shift : 6
	});
}

/** 网页跳转 */
function jumpToUrl(url) {
	top.location = url;
}

/** 修改密码 * */
function modifyPwd() {
	layer.open({
		type : 2,
		area : [ '500px', '450px' ],
		title : '修改密码',
		content : contextPath + '/browser/user/modifyPwdPage'
	});
}
String.prototype.replaceAll = function (search, replacement) {
	var target = this;
	return target.replace(new RegExp(search, 'g'), replacement);
};