angular
	.module('taskapp')
	.controller(
	'logoutCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'$cookieStore',
		'taskService',
		function ($scope, $location, $http, $cookieStore,
			taskService) {
			$scope.message = "This is Logout controller";
			taskService
				.logout(function (response) {
					if (response.data.status) {
						if ($cookieStore.get('currentUser') != null) {
							$cookieStore
								.remove('currentUser');
						}
						$location.path('/login');
					}
				});
		}])
