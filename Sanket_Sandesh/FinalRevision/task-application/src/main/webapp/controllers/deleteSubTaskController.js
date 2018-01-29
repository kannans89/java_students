angular
	.module('taskapp')
	.controller(
	'deleteSubTaskCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'$routeParams',
		'taskService',
		function ($scope, $location, $http, $routeParams,
			taskService) {
			$scope.message = "This is delete Sub-Task controller";
			taskService.deleteSubTask($routeParams.taskId,
				$routeParams.subtaskId, function (response) {
					if (response.data.status) {
						$location.path('/tasks');
					} else {
						$location.path('/login');
					}
				});
		}]);