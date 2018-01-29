var app = angular.module('main', ['ngRoute']);

app.config(['$routeProvider', function($routeProvider) {
    $routeProvider.
    when('/', {
        controller: 'MainCtrl',
        templateUrl: 'module/view/main.html'
    }).
    when('/edit/:rollNo', {
        controller: 'EditCtrl',
        templateUrl: 'module/view/edit.html'

    }).
    when('/add', {
        controller: 'AddCtrl',
        templateUrl: 'module/view/add.html'

    }).
    when('/delete/:rollNo', {
        controller: 'DeleteCtrl',
        templateUrl: 'module/view/main.html'

    }).otherwise({ redirectTo: '/' });
}]);

app.factory('studentFactory', ['$http', function($http) {
    var studentObj = {};
    var serverUrl = 'http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students';
    studentObj.get = function(f1, f2) {
        $http.get(serverUrl)
            .then(
                function(response) {
                    f1(response);
                },
                function(response) {
                    f2(response);
                }

            );
    };

    studentObj.getStudentById = function(id, f1, f2) {
        $http.get(serverUrl + "/" + id)
            .then(
                function(response) {
                    f1(response);
                },
                function(response) {
                    f2(response);
                }

            );
    }

    studentObj.addStudent = function(empObj, f1, f2) {

        $http({
                method: 'POST',
                url: serverUrl,
                data: empObj


            })
            .then(function(response) {
                f1(response);
                console.log('Added');
            }, function(response) { f2(response); });

    };

    studentObj.editStudent = function(id, empObj, f1, f2) {
        $http({
            method: 'PUT',
            url: serverUrl + '/' + id,
            data: empObj
        }).then(function(response) { f1(response); }, function(response) { f2(response); });
    };

    studentObj.deleteStudent = function(id, f1, f2) {
        $http.delete(serverUrl + "/" + id).success(function(response) {
            f1(response);
        }).error(function(response) {
            f2(response);
        });
    }
    return studentObj;
}]);
