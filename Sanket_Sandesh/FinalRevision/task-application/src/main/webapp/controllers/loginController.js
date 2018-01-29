angular
	.module('taskapp')
	.controller('indexCtrl',
	['$scope', '$location', function ($scope, $location) {
		$scope.message = "This is Index controller";
		$location.path('/');
	}])

	.controller('homeCtrl', ['$scope', function ($scope) {
		$scope.message = "This is Home controller";
	}])

	.controller(
	'loginCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'$cookieStore',
		'taskService',
		function ($scope, $location, $http, $cookieStore,
			taskService) {
			$scope.welcomeMessage = "This is Login controller";
			$scope.login = function () {
				$scope.user = {
					'username': $scope.username,
					'password': $scope.password
				};
				taskService
					.authenticate(
					$scope.user,
					function (response) {
						if (response.data.status) {
							$cookieStore.put(
								'currentUser',
								$scope.user);
							var activeuser = $cookieStore
								.get('currentUser');
							console.log(activeuser);
							$location
								.path('/tasks');
						} else {
							$scope.error = 'Username or Password is incorrect';
							$location
								.path('/login');
						}
					});
			};
		}])
