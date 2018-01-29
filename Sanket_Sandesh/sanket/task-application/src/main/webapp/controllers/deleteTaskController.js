angular
	.module('taskapp')
	.controller(
	'deleteTaskCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'$routeParams',
		'taskService',
		function ($scope, $location, $http, $routeParams,
			taskService) {
			$scope.message = "This is delete Task controller";
			// $scope.deleteTask = function(){
			taskService.deleteTask($routeParams.taskId,
				function (response) {
					console.log('inside delete');
					if (response.data.status) {
						$location.path('/tasks');
					} else {
						$location.path('/login');
					}
				});
			// };
		}])
