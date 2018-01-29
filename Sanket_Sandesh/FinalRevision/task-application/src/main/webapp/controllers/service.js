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

			this.updatepassword = function(user, callback){
				$http({
					method: 'POST',
					url:  generalUrl + '/changepassword',
					data: user
				})
				.then(function(response){
					callback(response);
				});
			};

			this.forgotpassword = function(user, callback){
				$http({
					method: 'POST',
					url:  generalUrl + '/forgotpassword',
					data: user
				})
				.then(function(response){
					callback(response);
				});
			};

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

		

			this.getTasks = function(callback){
				$http({
					method: 'GET',
					url: generalUrl + '/tasks'
				})
				.then(function(response){
					callback(response);
				});
			};

			this.getTaskById = function(taskId, callback){
				$http({
					method: 'GET',
					url: generalUrl + '/task/' + taskId
				})
				.then(function(response){
					console.log(response);
					callback(response);
				});
			};

			this.getSubTasks = function(taskId, callback){
				$http({
					method: 'GET',
					url: generalUrl + '/task/' + taskId + '/subtasks'
				})
				.then(function(response){
					callback(response);
				});
			};

			this.getSubTaskById = function(taskId, subtaskId, callback){
				$http({
					method: 'GET',
					url: generalUrl + '/task/' + taskId + '/subtask/' + subtaskId
				})
				.then(function(response){
					console.log(response);
					callback(response);
				});
			};

			this.newTask = function(newTask, callback){
				$http({
					method: 'POST',
					url: generalUrl + '/addtask',
					data: newTask
				})
				.then(function(response){
					callback(response);
				});
			};

			this.newSubTask = function(taskId, newSubTask, callback){
				$http({
					method: 'POST',
					url: generalUrl + '/task/' + taskId + '/addsubtask',
					data: newSubTask
				})
				.then(function(response){
					callback(response);
				});
			};

			this.updateTask = function(taskId, updateTask, callback){
				$http({
					method: 'PUT',
					url: generalUrl + '/updatetask/' + taskId,
					data: updateTask
				})
				.then(function(response){
					callback(response);
				});
			};

			this.updateSubTask = function(taskId, subtaskId, updateSubTask, callback){
				$http({
					method: 'PUT',
					url: generalUrl + '/task/' + taskId + '/updatesubtask/' + subtaskId,
					data: updateSubTask
				})
				.then(function(response){
					callback(response);
				});
			};

			this.deleteTask = function(taskId, callback){
				$http({
					method: 'DELETE',
					url: generalUrl + '/deletetask/' + taskId
				})
				.then(function(response){
					callback(response);
				});
			};

			this.deleteSubTask = function(taskId, subtaskId, callback){
				$http({
					method: 'DELETE',
					url: generalUrl + '/task/' + taskId + '/deletesubtask/' + subtaskId
				})
				.then(function(response){
					callback(response);
				});
			};

		}]);