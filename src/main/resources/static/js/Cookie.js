function setCookie(key, value) {
    sessionStorage[key] = value;
}

function getCookie(key) {
    return sessionStorage[key]
}