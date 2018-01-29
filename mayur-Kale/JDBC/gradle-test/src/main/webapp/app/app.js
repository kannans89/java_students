var app = angular.module('main', []);
app.controller('mainCtrl', function($scope, $http) {

	$scope.name = "mayur";

	$scope.submit = function() {
		$http({
			method : 'GET',
			url : "http://localhost:8080/gradle-test/api/wish/" + $scope.name
		}).then(function(response) {
			$scope.result = response.data.msg;
		}, function() {
			console.log("error");
		});

	}
});