var em = new Vue({
    el: '#login-div',
    data: {
        res: null,
        username: null,
        password: null
    },
    methods: {
        login: function () {
            axios.get("/user/login", {
                params: {
                    username: this.username,
                    password: this.password
                }
            }).then(function (response) {
                if (response.data.status === 200) {
                    sessionStorage.token = response.data.data.token;
                    window.location.href="../"
                } else {
                    layer.alert('用户名或密码错误', {icon: 2});
                }
                console.log(response);
            });
        }
    }
});