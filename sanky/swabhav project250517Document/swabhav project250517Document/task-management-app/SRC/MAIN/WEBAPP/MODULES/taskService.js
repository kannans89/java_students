angular
		.module('main')
		.factory(
				"taskService",
				[
						'$http','subService','$location','$rootScope',
						function($http,subService,$location,$rootScope) {
							var factory = {};
							var path = "http://localhost:8080/task-management-app/api/Task";
							var task = {};
							var taskNo=0;

							factory.getTask = function() {
								return task;
							}
							factory.setTask = function(value) {
								task=value;
							}
							factory.getTaskNo = function() {
								return taskNo;
							}
						    
							factory.setTaskNo = function(value) {
								subService.setTaskNo(value)
								
							}
							
							
							factory.getTasks = function() {

								return $http.get(path + "/getUserTasks").then(
										function successCallback(response) {
											console.log(response.data)
											return response;
										}, function errorCallback(response) {
											console.log(response.statusText);
										});
							}
							 factory.getTaskById= function(taskNo){
							    	return $http.get(path+"/getTaskById?taskNo="+taskNo).then(
							        		function successCallback(response) {
							        	console.log(response.data)
										return response;
									}, function errorCallback(response) {
										console.log(response.statusText);
									});
							    }
							    

							factory.addTask = function(taskData) {
								
								return $http.post(path + "/addTask", taskData).then(
										function successCallback(response) {
											return response;
										}, function errorCallback(response) {
										});

							}
							factory.updateTask = function(taskData) {
								return $http.put(path + "/updateTask", taskData).then(function success(response) {
									if (sessionStorage.getItem("user")!= null) {
										$location.path("/UserHome");
										console.log(response);
										return response;
									} else {
										$location.path("/login");
									}
					                   console.log(response);
					                  }, function error(response) {
					                    console.log(response);
					                  });
								

							}
							factory.deleteTask = function(taskno) {
								
								return $http.delete(path + "/deleteTask?taskNo="+taskno).then(
										function successCallback(response) {
											return response;
										}, function errorCallback(response) {
										});

							}
							return factory;
						} ]);