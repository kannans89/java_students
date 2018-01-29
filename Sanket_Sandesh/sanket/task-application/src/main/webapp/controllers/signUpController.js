angular
	.module('taskapp')
	.controller(
	'signupCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'taskService',
		function ($scope, $location, $http, taskService) {
			$scope.message = "This is Sign-Up controller";
			$scope.signup = function () {
				if ($scope.password1 === $scope.password2) {
					$scope.user = {
						'username': $scope.username,
						'email': $scope.email,
						'password': $scope.password1
					};
					console.log($scope.user);
					taskService
						.signup(
						$scope.user,
						function (response) {
							if (response.data.status) {
								$location
									.path('/login');
							} else {
								$scope.error = 'Username Alredy Exist';
								$location
									.path('/signup');
							}
						});
				} else {
					$scope.error = "Password doesnt match.";
				}
			};
		}])
