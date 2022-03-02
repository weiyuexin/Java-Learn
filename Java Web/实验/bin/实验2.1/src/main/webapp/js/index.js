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