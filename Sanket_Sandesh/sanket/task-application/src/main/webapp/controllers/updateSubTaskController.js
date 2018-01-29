angular
	.module('taskapp')
	.controller(
	'updateSubTaskCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'$routeParams',
		'taskService',
		function ($scope, $location, $http, $routeParams,
			taskService) {
			$scope.message = "This is Edit Sub-Task controller";
			taskService
				.getSubTasks(
				$routeParams.taskId,
				function (response) {
					$scope.subtasks = response.data;
					for (var i = 0; i < response.data.length; i++) {
						if (response.data[i].subtaskId == $routeParams.subtaskId) {
							console
								.log(response.data[i].name);
							$scope.editSubTaskData = response.data[i];
							$scope.editSubTaskData.startDate = new Date(
								$scope.editSubTaskData.startDate);
							$scope.editSubTaskData.endDate = new Date(
								$scope.editSubTaskData.endDate);
						}
					}
				});
			$scope.editSubTask = function () {
				$scope.updateSubTask = {
					'subtaskId': $scope.editSubTaskData.subtaskId,
					'name': $scope.editSubTaskData.name,
					'startDate': $scope.editSubTaskData.startDate,
					'endDate': $scope.editSubTaskData.endDate
				};
				console.log($scope.updateSubTask);
				taskService.updateSubTask($routeParams.taskId,
					$routeParams.subtaskId,
					$scope.updateSubTask,
					function (response) {
						if (response.data.status) {
							$location.path('/tasks');
						} else {
							$location.path('/login');
						}
					});
			};
		}])
