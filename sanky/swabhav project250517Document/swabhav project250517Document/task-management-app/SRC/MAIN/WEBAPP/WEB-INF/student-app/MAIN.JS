angular.module('main', ['ngRoute']).config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/', {
        templateUrl: 'partial/home.html',
        controller: 'homeCtrl'
    }).when('/add', {
        templateUrl: 'partial/addStudent.html',
        controller: 'addCtrl'
    }).when('/view', {
        templateUrl: 'partial/viewStudents.html',
        controller: 'viewCtrl'
    }).when('/viewById', {
        templateUrl: 'partial/viewById.html',
        controller: 'viewByIdCtrl'
    }).when('/update', {
        templateUrl: 'partial/update.html',
        controller: 'updateStudentdetail'
    })
        }]).controller('homeCtrl', ['$scope', function ($scope) {

    }]).controller('addCtrl', ['$scope', 'studentService', function ($scope, studentService) {
    $scope.post = function () {
        var stud = $scope.student;
        if (stud.name != '' &&
            stud.email != '' &&
            stud.rollno != '' &&
            stud.age != '' &&
            stud.date != '') {
            var student = {
                "rollNo": stud.rollno,
                "name": stud.name,
                "age": stud.age,
                "email": stud.email,
                "date": stud.date,
                "isMale": stud.isMale
            };

            studentService.post(student);

        }
        stud.name = '';
        stud.email = '';
        stud.rollno = '';
        stud.age = '';
        stud.date = '';

        $scope.value = true;
        $scope.message = "Student Added Successfully";
    }


    }]).controller('viewCtrl', ['$scope', '$route', 'studentService', '$log', function ($scope, $route, studentService, $log) {

    studentService.get(function (data) {
        $scope.mydata = data;
    }, function (data) {
        $log.log(data);
    });

    $scope.delete = function (rollno) {
        studentService.delete(rollno);

    }


    }]).controller('viewByIdCtrl', ['$scope', '$http', function ($scope, $http) {
    console.log(" inside ctrl");

    $scope.showStudent = function () {
        console.log(" inside show");
        $http.get("http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students ")
            .then(function mySucces(response) {
                $scope.mydata1 = response.data;
                console.log($scope.mydata1[0].name)
                for (var i = 0; i < $scope.mydata1.length - 1; i++) {
                    //getting required obj equal to rollno
                    if ($scope.mydata1[i].rollNo == $scope.textEntered) {
                        $scope.student = $scope.mydata1[i];
                        break;
                    }

                }

            }, function myError(response) {
                $scope.mydata1 = response.statusText;
            });

        $scope.buttonmodel = true;
    };

    }]).controller('updateStudentdetail',  ['$scope','studentService', function ($scope, studentService) {
  
    $scope.viewupdate=function(id) {
        $scope.buttonvalue = true;
        studentService.get(function (data) {
                $scope.mydata = data;
                for (var i = 0; i < $scope.mydata.length - 1; i++) {
                    if ($scope.mydata[i].rollNo == id) {
                        $scope.student = $scope.mydata[i];
                    }
                }

               },function (data) {
                console.log(data);
            });
        }
        $scope.updateStudent = function () {
            var stud = $scope.student;
             var student = {
                "rollNo": stud.rollNo,
                "name": stud.name,
                "age": stud.age,
                "email": stud.email,
                "date": stud.date,
                "isMale": stud.isMale
            };
            
        studentService.update(stud.rollNo,student);
        }



}]).factory("studentService", ['$http','$location', function ($http,$location) {
    var factory = {};
    var updatePath="http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students/"
    var path = "http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students/";

    var students = [];
    factory.get = function (fnsuccess, fnerror) {

        $http.get(path).then(function mysuccess(response) {
            console.log(response.data)
            fnsuccess(response.data);

        }, function myError(response) {

            fnerror(response.statusText);
        });

    };
    factory.post = function (obj) {

        $http.post(path, obj);
    }
    factory.delete = function (rollno) {
        $http.delete(path + rollno);
        $http.get(path).then(function success(response) {
            students = response.data;
        });
    }
    factory.update = function (id,stud) {
$http.put(updatePath+id,angular.toJson(stud),{
                 headers: {'Content-Type' : 'application/json'}
              }).then(function success(response) {
                   $location.path('/view');
                 console.log(response);
                }, function error(response) {
                  console.log(response);
                })

    }
    return factory;
}])

;