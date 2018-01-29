angular
		.module('main')
		.factory(
				"loginService",
				[
						'$http',
						function($http) {
							var factory = {};
							var path = "http://localhost:8080/task-management-app/api/UserLogin";
							var loginPath = "http://localhost:8080/task-management-app/api/UserLogin";
							var userPath = "http://localhost:8080/task-management-app/api/User";
							var users = [];
							factory.get = function(userData, fnSuccess, fnError) {

								return $http.post(path + "/validate", userData)
										.then(function(response) {
											fnSuccess(response);
										}, function(response) {
											fnError(response);
										});

							};

							factory.post = function(obj) {
								$http.post(path, obj);

							}

							factory.update = function(obj) {
								return $http.put(path + "/updateUser", obj)
										.then(function mysuccess(response) {

											return response;

										}, function myError(response) {

											console.log(response.statusText);
										});

							}

							factory.postUser = function(obj) {
								console.log(obj)
								$http.post(userPath + "/addUser", obj);

							}

							factory.postLoginDetail = function(obj) {
								console.log(obj)
								$http.post(loginPath + "/register", obj);

							}

							factory.put = function(obj) {
								$http.put(path, obj);

							}

							factory.checkUser = function(mail) {

								return $http.get(
										userPath + "/getUserByMail?mail="
												+ mail).then(
										function successCallback(response) {
											console.log(response.data)
											return response;
										}, function errorCallback(response) {
											console.log(response.statusText);
										});
							}
							/* old password check */
							factory.checkPassword = function(password) {
								console.log(password);
								return $http.get(
										loginPath
												+ "/validatePassword?password="
												+ password).then(
										function successCallback(response) {
											return response;
										}, function errorCallback(response) {
											console.log(response.statusText);
										});

							}
							factory.checkUsername = function(username) {
								return $http.get(
										loginPath + "/getLoginDetail?username="
												+ username).then(
										function successCallback(response) {
											return response;
										}, function errorCallback(response) {
											console.log(response.statusText);
										});

							}
							return factory;
						} ]);