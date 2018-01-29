angular.module('main').factory("regService", [ '$http', function($http) {
	var factory = {};
	var loginPath = "http://localhost:8080/task-management-app/api/UserLogin";
	var userPath = "http://localhost:8080/task-management-app/api/User";

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
	return factory;
} ]);