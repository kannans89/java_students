angular.module('taskapp')		
		.service('taskService', ['$http', function($http){
			var generalUrl =  'http://localhost:8080/task-application/api';

			this.getTasks = function(callback){
				$http({
					method: 'GET',
					url: generalUrl + '/tasks'
				})
				.then(function(response){
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

			this.deleteTask = function(taskId, callback){
				$http({
					method: 'DELETE',
					url: generalUrl + '/deletetask/' + taskId
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