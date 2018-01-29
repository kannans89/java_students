angular
	.module('taskapp')
	.filter('orderObjectBy', function() {
			return function(items, field, reverse) {
				var filtered = [];
				angular.forEach(items, function(item) {
					filtered.push(item);
				});
				filtered.sort(function(a, b) {
					return (a[field] > b[field] ? 1 : -1);
				});
				if (reverse)
					filtered.reverse();
				return filtered;
			};
		})
	.controller(
	'getTaskCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'$routeParams',
		'$cookieStore',
		'taskService',
		function ($scope, $location, $http, $routeParams,
			$cookieStore, taskService) {
			$scope.message = "This is Task controller";
			$scope.updateTaskStatus = function (task) {
				task.startDate = new Date(task.startDate);
				task.endDate = new Date(task.endDate);
				if (task.status == false)
					task.status = 0;
				else
					task.status = 1;
				$scope.updateTask = {
					'taskId': task.taskId,
					'name': task.name,
					'startDate': task.startDate,
					'endDate': task.endDate,
					'status': task.status
				};
				console.log($scope.updateTask);
				taskService.updateTask(
					$scope.updateTask.taskId,
					$scope.updateTask, function (response) {
						if (response.data.status) {
							$location.path('/tasks');
						} else {
							$location.path('/login');
						}
					});
			};

			taskService.getTasks(function (response) {
				var activeuser = $cookieStore
					.get('currentUser');
				if (activeuser != null) {
					$scope.activeuser = {
						username: activeuser.username,
						password: activeuser.password
					};
				}
				$scope.tasks = response.data;
			});
		}])
