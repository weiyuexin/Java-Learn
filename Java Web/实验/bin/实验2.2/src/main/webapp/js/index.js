/**
 *检验用户名和留言内容
 */
function Check() {
    // 获取输入的用户名和留言内容
    var username = document.getElementById('username');
    var message = document.getElementById('message');
    // 判断用户名的合法性
    if (username.value.length <= 0) {
        alert("用户名不能为空!");
        return false;
    } else if (message.value.length <= 0) {
        alert("请填写留言内容");
        return false;
    }
    return true;
}