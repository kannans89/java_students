var app = angular.module('mainApp', []);

app.controller('ProteinCtrl', function($scope) {

    var goalValue = 0;
    var total = 0;
    var hitValue = 0;
    var clicked = true;
    $scope.history = [];
    $scope.showBlock = 'hidden';
    $scope.amount = 0;
    $scope.colorType = 'red';
    $scope.$watch('goal', function(newValue, oldValue) {
        hitValue = newValue;
        total = 0;
        goalValue = hitValue;
        $scope.history = [];
        $scope.colorType = 'red';
        $scope.total = ""
    });
    $scope.settings = function() {

        if (clicked) {
            $scope.showBlock = 'visible';
            clicked = false;
        } else {
            $scope.showBlock = 'hidden';
            clicked = true;


        }


    };

    $scope.add = function() {

        if ($scope.amount != 0 && $scope.amount.length != 0) {
            if (hitValue > total) {
                goalValue -= $scope.amount;
                total += $scope.amount;
                if (hitValue != total) {
                    $scope.colorType = 'red';
                    $scope.history.push($scope.amount);
                    $scope.total = total + " grams";
                    $scope.amount = 0;


                } else if (hitValue == total) {
                    $scope.colorType = 'green';
                    $scope.history.push($scope.amount);
                    $scope.total = total + " grams![Goal Achieved]";
                    goalValue = 0;
                    $scope.amount = 0;

                }
                if (goalValue < 0) {
                    $scope.colorType = 'red';
                    $scope.total = total + " grams![Goal Exceeded]";
                    goalValue = 0;
                    $scope.amount = 0;
                }
            }


        }
    };


});
