var app = angular.module('mainApp', []);




app.controller('AppCtrl', function($scope) {
    $scope.wish = function() {
        $scope.wishText = "Mayur says hello to " + $scope.guestName;
    }
});
