var app = angular.module('main', ['ngRoute']);
var authentication = angular.module('authentication', []);
app.config(function($routeProvider) {
    $routeProvider.
    when('/', {
        controller: 'LoginCtrl',
        templateUrl: 'module/view/login.html'
    }).
    when('/home', {
        templateUrl: 'module/view/welcome.html'

    }).otherwise({ redirectTo: '/' });
});


app.factory('LoginFactory', function() {
    var loginObj = {};
    loginObj.isValidate = function(name, pwd) {
        if (name.length != 0 && pwd.length != 0)
            return true;
        return false;
    }
    return loginObj;
});

app.service('LoginService', function(LoginFactory) {
    this.authenticate = function(name, pwd) {
        return LoginFactory.isValidate(name, pwd);
    }
});
