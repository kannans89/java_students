var app = angular.module('mainApp', []);

app.controller('BindingCtrl', function($scope) {
     

        $scope.$watch('size', function(newValue, oldValue) {
        	$scope.size = newValue;
        	console.log($scope.size)
            $scope.textSize = $scope.size + 'px';
        });

    }

);
