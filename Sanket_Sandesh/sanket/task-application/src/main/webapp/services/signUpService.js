angular.module('taskapp')		
		.service('taskService', ['$http', function($http){
			var generalUrl =  'http://localhost:8080/task-application/api';
			this.signup = function(user, callback){
				$http({
					method: 'POST',
					url: generalUrl + '/signup',
					data: user
				})
				.then(function(response){
					callback(response);
				});
			};

		
