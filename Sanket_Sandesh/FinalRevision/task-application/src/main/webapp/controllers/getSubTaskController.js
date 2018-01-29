angular
	.module('taskapp')
	.controller(
	'getSubTaskCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'$routeParams',
		'taskService',
		function ($scope, $location, $http, $routeParams,
			taskService) {
			$scope.message = "This is Get Sub-Task controller";
			$scope.taskId = $routeParams.taskId;
			$scope.updateSubtaskStatus = function (taskId,
				subtask) {
				subtask.startDate = new Date(subtask.startDate);
				subtask.endDate = new Date(subtask.endDate);
				if (subtask.status == false)
					subtask.status = 0;
				else
					subtask.status = 1;
				$scope.updateSubTask = {
					'subtaskId': subtask.subtaskId,
					'name': subtask.name,
					'startDate': subtask.startDate,
					'endDate': subtask.endDate,
					'status': subtask.status
				};
				console.log($scope.updateSubTask);
				taskService.updateSubTask(taskId,
					$scope.updateSubTask.subtaskId,
					$scope.updateSubTask,
					function (response) {
						if (response.data.status) {
							$location.path('/tasks');
						} else {
							$location.path('/login');
						}
					});
			};

			taskService.getSubTasks($routeParams.taskId,
				function (response) {
					$scope.taskId = $routeParams.taskId;
					console.log(response.data);
					$scope.subtasks = response.data;
				});
		}])
