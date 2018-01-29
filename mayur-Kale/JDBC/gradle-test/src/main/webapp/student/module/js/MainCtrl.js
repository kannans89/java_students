var app = angular.module('main');
app.controller('MainCtrl', ['$scope', '$location', 'studentFactory', function($scope, $location, studentFactory) {

    studentFactory.get(function(response) {

        $scope.students = response.data;
        
       
    }, function(response) {});
    



    $scope.addStudent = function() {
        $location.path('/add');
    }


}]);
