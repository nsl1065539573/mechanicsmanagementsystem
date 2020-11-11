var em = new Vue({
    el: '#div-main',
    methods: {
        // 判断是否登录
        confirmToken: function () {
            if (sessionStorage.token) {
                console.log(sessionStorage.token)
            } else {
                window.location.href="/login";
            }
        }
    }
});
