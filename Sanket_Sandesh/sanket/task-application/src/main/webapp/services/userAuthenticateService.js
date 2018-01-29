angular.module('taskapp')		
		.service('taskService', ['$http', function($http){
			var generalUrl =  'http://localhost:8080/task-application/api';
			
			this.authenticate = function(user, callback){	
				$http({
					method: 'POST',
					url: generalUrl + '/user/authenticate',
					data: user
	            })
	            .then(function(response) {
	            	console.log(response);
					callback(response);						
				});
			};
