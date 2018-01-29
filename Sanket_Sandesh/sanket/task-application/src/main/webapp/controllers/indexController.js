angular
	.module('taskapp')
	.controller('indexCtrl',
	['$scope', '$location', function ($scope, $location) {
		$scope.message = "This is Index controller";
		$location.path('/');
	}])