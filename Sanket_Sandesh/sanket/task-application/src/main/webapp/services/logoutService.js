angular.module('taskapp')		
		.service('taskService', ['$http', function($http){
			var generalUrl =  'http://localhost:8080/task-application/api';
			this.logout = function(callback){
				$http({
					method: 'GET',
					url:  generalUrl + '/logout'
				})
				.then(function(response){
					console.log(response);
					callback(response);
				});
			};
