angular
	.module('taskapp')
	.controller('homeCtrl', ['$scope', function ($scope) {
		$scope.message = "This is Home controller";
	}])