var app = angular.module('mainApp', ['ngRoute']);


app.config(function($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'login-form.html',

        }).when('/home', {
            resolve: {
                "check": function($location, $rootScope) {
                    if (!$rootScope.valid) {
                        $location.path('/');
                    }
                }
            },
            templateUrl: 'index.html'
        }).otherwise({ redirectTo: '/' })
});

app.controller('LoginCtrl', function($scope, $location, $rootScope) {
    $scope.submit = function() {
        if ($scope.name.length != 0 && $scope.pwd.length != 0) {
            $rootScope.valid = true;
            $location.path('/home');
        } else {
            $rootScope.valid = false;
            if ($scope.name.length == 0)
                $scope.nameAlert = '*';
            else $scope.nameAlert = '';

            if ($scope.pwd.length == 0)
                $scope.passwordAlert = '*';
            else {
                $scope.passwordAlert = '';

            }
        }
    }

});
