var em = new Vue({
    el: '#register-div',
    data: {
        res: null,
        username: null,
        password: null,
        confirm: null,
        nickname: null
    },
    methods: {
        register: function () {
            axios.get("/user/register", {
                params: {
                    username: this.username,
                    password: this.password,
                    nickname: this.nickname
                }
            }).then(function (response) { console.log(response) });
        }
    }
});