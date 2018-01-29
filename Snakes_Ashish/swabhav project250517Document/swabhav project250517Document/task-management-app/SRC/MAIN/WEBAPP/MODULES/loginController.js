angular
		.module('main')
		.controller(
				'loginCtrl',
				[
						'$scope',
						'loginService',
						'$location',
						'$log',
						'$rootScope',
						'$window',
						function($scope, loginService, $location, $log,
								$rootScope, $window) {

							$scope.validateUser = function() {
								var userobj = $scope.user;
								var userData = {
									"username" : userobj.username,
									"password" : userobj.password
								}
								loginService
										.get(
												userData,
												function(response) {
													console.log(response.data);
													if (response.data.success == true) {
														console
																.log(userobj.username);
														sessionStorage
																.setItem(
																		"user",
																		userobj.username);
														console
																.log(sessionStorage
																		.getItem("user"));
														alert(response.data.successMessage);
														$location
																.path("/UserHome");
													} else {
														$scope.passError = response.data.errorMessage;
														alert(response.data.errorMessage);
													}

												},
												function errorCallback(response) {
													$scope.passError = response.data.errorMessage;
													alert(response.data.errorMessage);
												});
							}

							$scope.changePassword = function() {
								console.log("inside  change password")
								var newData = {
									"username" : sessionStorage.getItem("user"),
									"password" : $scope.newPasswordConfirm

								}
								console.log($scope.newPasswordConfirm);

								loginService.update(newData).then(
										function(response) {
											console.log(response.data);
											$location.path("/UserHome");

										}, function error(response) {
											$log.log(response.statusText);
										});

							}

							$scope.register = function() {
								
								console.log($scope.reg.name);
								if ($scope.reg.username != ''
										&& $scope.reg.password != ''
										&& $scope.reg.name != ''
										&& $scope.reg.dept != ''
										&& $scope.reg.mail != ''
										&& $scope.reg.phone != '') {
									// console.log(userobj.name);
									var userDetails = {
										"name" : $scope.reg.fname + " "
												+ $scope.reg.lname,
										"userName" : $scope.reg.username,
										"dept" : $scope.reg.dept,
										"mail" : $scope.reg.mail,
										"phoneNo" : $scope.reg.phone
									};
									var userRegDetails = {
										"username" : $scope.reg.username,
										"password" : $scope.reg.password
									}
									loginService.postUser(userDetails);
									loginService
											.postLoginDetail(userRegDetails);
									$location.path("/login");
								}

							};

							$scope.logout = function() {
								console.log("inside logout");
								sessionStorage.removeItem("user");
								$location.path("/login");

							}

							/* registration form validation */
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

							$scope.validateRegistrationForm = function() {
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
								if (regex2.test($scope.reg.fname)) {
									$scope.fnameError = "*invalid  First Name !!! pls enter only Alphabets*";

								} else {
									$scope.fnameError = "";
								}
								if (regex2.test($scope.reg.lname)) {
									$scope.lnameError = "*invalid Last  Name !!! pls enter only Alphabets*";

								} else {
									$scope.lnameError = "";
								}
								if (regex2.test($scope.reg.dept)) {
									$scope.deptError = "*invalid Department name!! pls enter only Alphabets*";

								} else {
									$scope.deptError = "";
								}

								if (regex3.test($scope.reg.phone)) {
									$scope.mobileError = "*invalid Contact no.name pls enter numbers only*";

								} else {
									$scope.mobileError = "";
								}

							}
							/* password validation */
							$scope.validateNewPassWord = function() {
								var regex1 = new RegExp("[^a-z|^A-Z]");

								if ($scope.newPassword != $scope.newPasswordConfirm) {
									$scope.newPassConfirmError = "*password doesn't match";

								} else {
									$scope.newPassConfirmError = "";

								}

								if (regex1.test($scope.newPassword)) {
									$scope.newPassError = "*invalid password !!! pls enter only Alphabets*";

								} else {
									$scope.newPassError = "";
								}
								if (regex1.test($scope.newPasswordConfirm)) {
									$scope.newPassConfirmError = "*invalid password !!! pls enter only Alphabets*";

								} else {
									$scope.newPassConfirmError = "";
								}

							}
							/* change password form */
							$scope.checkPassword = function() {

								var userData = {
									"username" : localStorage.getItem("user"),

								}
								loginService
										.get(userData)
										.then(
												function(response) {
													console.log(response.data);

													if ($scope.oldPassword != response.data.emp_password) {
														$scope.oldPassError = "*wrong password*";

													} else {
														$scope.oldPassError = "";
													}

												},
												function errorCallback(response) {
													console
															.log(response.statusText);
												});
							}
							/* mail user */
							$scope.mailUser = function(mail) {
								console.log(mail);
								loginService.checkUser(mail).then(
										function(response) {
											
											$location.path("/login")

										}, function error(response) {
											$log.log(response.statusText);
										});
							}
							/* verify user for reg by mail */
							$scope.isUserPresent = function(mail) {
								$scope.loaderMail = true;
								$scope.unverifiedMail = false;
								$scope.verifiedMail = false;

								loginService
										.checkUser(mail)
										.then(
												function(response) {
												
													if (response.data.success == true) {
														$scope.loaderMail = false;
														$scope.verifiedMail = true;
														$scope.unverifiedMail = false;
													} else {
														$scope.loaderMail = false;
														$scope.verifiedMail = false;
														$scope.unverifiedMail = true;
													}
												},
												function error(response) {
													$log
															.log(response.statusText);
												});
							}
							/* verify user by mail */
							$scope.isMailPresent = function(mail) {
								$scope.loaderForgotPassMail = true;
								$scope.verifiedForgotPassMail = false;
								$scope.unverifiedForgotPassMail = false;

								loginService
										.checkUser(mail)
										.then(
												function(response) {
													console.log(response);
													if (response.data.success == true) {
														$scope.loaderForgotPassMail = false;
														$scope.verifiedForgotPassMail = true;
														$scope.unverifiedForgotPassMail = false;
													} else {
														$scope.loaderForgotPassMail = false;
														$scope.verifiedForgotPassMail = false;
														$scope.unverifiedForgotPassMail = true;
													}
												},
												function error(response) {
													$scope.loaderForgotPassMail = false;
													$scope.verifiedForgotPassMail = false;
													$scope.unverifiedForgotPassMail = true;
												});
							}
							/* verify username */
							$scope.checkUsername = function(username) {
								var regex1 = new RegExp("[^a-z|^A-Z]");

								$scope.loaderUsername = true;
								if (regex1.test(username)) {
									$scope.userError = "*invalid Username pls enter only alphabets*";

								} else {
									$scope.userError = "";
								}
								loginService
										.checkUsername(username)
										.then(
												function(response) {
													console
															.log("check password"
																	+ response)
													$scope.data = response.data;
													console.log($scope.data.success);
													if ($scope.data.success==true) {
															$scope.loaderUsername = false;
															$scope.verifiedUsername = true;
															$scope.unverifiedUsername = false;
													} else {
														$scope.loaderUsername = false;
														$scope.verifiedUsername = false;
														$scope.unverifiedUsername = true;
														
													}

												},
												function error(response) {
													$log
															.log(response.statusText);
												});

							}
							
							$scope.checkUsernameForReg = function(username) {
								var regex1 = new RegExp("[^a-z|^A-Z]");

								$scope.loaderUsernameForReg = true;
								if (regex1.test(username)) {
									$scope.userError = "*invalid Username pls enter only alphabets*";

								} else {
									$scope.userError = "";
								}
								loginService
										.checkUsername(username)
										.then(
												function(response) {
													console
															.log("check password"
																	+ response)
													$scope.data = response.data;
													console.log($scope.data.success);
													if ($scope.data.success==true) {
															$scope.loaderUsernameForReg = false;
															$scope.verifiedUsernameForReg = true;
															$scope.unverifiedUsernameForReg = false;
													} else {
														$scope.loaderUsernameForReg = false;
														$scope.verifiedUsernameForReg = false;
														$scope.unverifiedUsernameForReg = true;
														
													}

												},
												function error(response) {
													$log
															.log(response.statusText);
												});

							}
							/* verify current password */
							$scope.validateOldPassWord = function(password) {
								$scope.oldPass = true;
								console.log("inside validatepass");
								$scope.checkPassword(password);

							}

							$scope.checkPassword = function(password) {
								if (sessionStorage.getItem("user") != null) {
									$scope.username = sessionStorage
											.getItem("user")
								} else {
									$scope.username = $scope.user.username;
								}
								loginService
										.checkPassword(password)
										.then(
												function(response) {

													if (response.data.success == true) {
															$scope.Pass = false;
															$scope.verified = true;
															$scope.unverified = false;
															
														} else {
															$scope.Pass = false;
															$scope.verified = false;
															$scope.unverified = true;

														}
													

												},
												function error(response) {
													$scope.Pass = false;
													$scope.verified = false;
													$scope.unverified = true;
												});
							}

						} ]);