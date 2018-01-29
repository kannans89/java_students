angular.module('main', [])
    .controller('MainCtrl', function($scope, $http) {
        $scope.students = [];

        $scope.visbileView = false;
        $scope.myTableStyle = {
            'border': '1px solid black',
            'width': '100%'
        };
        $scope.myStyle = {
            'border': '1px solid black',
            'border-collapse': 'collapse'
        };

        $scope.populate = function() {
            $http.get('http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students')
                .then(
                    function(response) {

                        $scope.students = response.data;
                        for (var index = 0; index < $scope.students.length; index++) {
                            $scope.students[index].isMale = $scope.students[index].isMale == true ? "Male" : "Female";
                        }
                        $scope.visbileView = true;
                    }
                );
        }

        $scope.add = function() {
            if ($scope.student.rollNo.length != 0 && $scope.student.name.length != 0 && $scope.student.age.length != 0 && $scope.student.email.length != 0 &&
                $scope.student.date.length != 0 && $scope.student.isMale.length != 0) {
                $scope.student.isMale = $scope.student.isMale == "male" ? true : false;
                $http({
                    method: 'POST',
                    url: 'http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students',
                    data: $scope.student,


                }).success(function() {
                    $scope.populate();
                    $scope.student = {};
                    console.log('Record Added!');

                }).error(function() {
                    console.log('Error!');

                });
            }
        }
    });
