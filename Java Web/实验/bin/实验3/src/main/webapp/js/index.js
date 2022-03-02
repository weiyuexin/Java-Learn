/**
 *检验用户名和密码
 */
function Check() {
    // 获取输入的用户名和密码
    var username = document.getElementById('username');
    var password = document.getElementById('password');
    // 判断用户名的合法性
    if (username.value.length <= 0) {
        alert("用户名不能为空!");
        return false;
    } else if (password.value.length < 6) {
        alert("密码长度必须大于等于6位");
        return false;
    }
    return true;
}
/*
*检查用户名和密码以及确认密码
*/
function Check1(){
	//获取输入
	var username = document.getElementById('username');
	var password = document.getElementById('password');
	var pwd = document.getElementById('pwd');
	//判断用户名是否为空
	if(username.value.length<=0){
		alert("用户名不能为空");
		return false;
	}else if(password.value.length<=0 || pwd.value.length<=0){
		alert("请输入密码");
		return false;
	}else if(password.value!=pwd.value){
		alert("两次输入的密码不一致");
		return false;
	}else{
		return true;
	}
}