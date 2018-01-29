angular
	.module('taskapp')
	.controller(
	'addSubTaskCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'$routeParams',
		'taskService',
		function ($scope, $location, $http, $routeParams,
			taskService) {
			$scope.message = "This is Addition Sub-Task controller";
			$scope.addSubTask = function () {
				$scope.newSubTask = {
					'name': $scope.name,
					'startDate': $scope.startDate,
					'endDate': $scope.endDate
				};
				console.log($scope.newSubTask);
				taskService.newSubTask($routeParams.taskId,
					$scope.newSubTask, function (response) {
						$location.path('/tasks');
					});
			};
		}])