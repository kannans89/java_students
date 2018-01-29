angular
	.module('taskapp')
	.controller(
	'addTaskCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'taskService',
		function ($scope, $location, $http, taskService) {
			$scope.message = "This is Addition Task controller";
			$scope.addTask = function () {
				$scope.newTask = {
					'taskId': $scope.taskId,
					'name': $scope.name,
					'startDate': $scope.startDate,
					'endDate': $scope.endDate
				};
				console.log($scope.newTask);
				taskService.newTask($scope.newTask, function (
					response) {
					if (response.data.status) {
						$location
							.path('/tasks');
					}
					else {
						$scope.error = 'Task Alredy Exist';
						$location.path('/tasks');
					}

				});
			};
		}])
