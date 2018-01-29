angular
		.module('main')
		.controller(
				'regCtrl',
				[
						'$scope',
						'regService',
						'$location',
						function($scope, regService, $location) {

							$scope.register = function() {
								
								var userDetails = {
									"name" : $scope.reg.name,
									"userName" : $scope.reg.username,
									"dept" : $scope.reg.dept,
									"mail" : $scope.reg.mail,
									"phoneNo" : $scope.reg.phone
								};
								var userRegDetails = {
									"username" : $scope.reg.username,
									"password" : $scope.reg.password
								}
								regService.postUser(userDetails);
								regService.postLoginDetail(userRegDetails);
								$location.path("/login");

							};
/* regidtration form input validattion*/
							$scope.userError = "";
							$scope.passError = "";
							$scope.passAgainError = "";
							$scope.nameError = "";
							$scope.deptError = "";
							$scope.mailError = "";
							$scope.mobileError = "";
							$scope.newPassError = "";
							$scope.newPassConfirmError = "";
							$scope.oldPassError = "";

							$scope.validate = function() {
								var regex1 = new RegExp("[^a-z|^A-Z]");
								var regex2 = new RegExp("[^a-z|^A-Z]");
								var regex3 = new RegExp("[^0-9]");

								if (regex1.test($scope.reg.username)) {
									$scope.userError = "*invalid Username pls enter only alphabets*";

								} else {
									$scope.userError = "";
								}
								if (regex2.test($scope.reg.password)) {
									$scope.passError = "*invalid Password name pls enter only Alphabets*";

								} else {
									$scope.passError = "";
								}
								if (regex2.test($scope.reg.confirmPassword)) {
									$scope.passAgainError = "*invalid Password pls enter only Alphabets*";

								} else {
									$scope.passAgainError = "";
								}
								if (regex2.test($scope.reg.name)) {
									$scope.nameError = "*invalid  Name !!! pls enter only Alphabets*";

								} else {
									$scope.nameError = "";
								}
								if (regex2.test($scope.reg.dept)) {
									$scope.deptError = "*invalid Department name!! pls enter only Alphabets*";

								} else {
									$scope.deptError = "";
								}
								
							}
						} ]);
