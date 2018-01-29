angular
	.module('taskapp')
	.controller(
	'updateTaskCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'$routeParams',
		'taskService',
		function ($scope, $location, $http, $routeParams,
			taskService) {
			$scope.message = "This is Edit Task controller";
			taskService
				.getTasks(function (response) {
					$scope.tasks = response.data;
					for (var i = 0; i < response.data.length; i++) {
						if (response.data[i].taskId == $routeParams.taskId) {
							console
								.log(response.data[i].name);
							$scope.editTaskData = response.data[i];
							$scope.editTaskData.startDate = new Date(
								$scope.editTaskData.startDate);
							$scope.editTaskData.endDate = new Date(
								$scope.editTaskData.endDate);
						}
					}
				});
			$scope.editTask = function () {
				$scope.updateTask = {
					'taskId': $scope.editTaskData.taskId,
					'name': $scope.editTaskData.name,
					'startDate': $scope.editTaskData.startDate,
					'endDate': $scope.editTaskData.endDate
				};
				console.log($scope.updateTask);
				taskService.updateTask($routeParams.taskId,
					$scope.updateTask, function (response) {
						if (response.data.status) {
							$location.path('/tasks');
						} else {
							$location.path('/login');
						}
					});
			};
		}])
