angular
		.module('main')
		.factory(
				"subService",
				[
						'$http',
						'$rootScope',
						function($http, $rootScope) {
							var factory = {};
							var path = "http://localhost:8080/task-management-app/api/SubTask";
							var taskNo = 0;
							var subtask = {};

							factory.getSubTasks = function() {
								return $http
										.get(
												path
														+ "/getSubTasks?taskNo="
														+ localStorage
																.getItem("taskNo"))
										.then(
												function successCallback(
														response) {
													console.log(response.data)
													return response;
												},
												function errorCallback(response) {
													console
															.log(response.statusText);
												});
							}

							factory.getSubTaskById = function(subtaskNo) {
								return $http.get(
										path + "/getSubTaskById?subTaskNo="
												+ subtaskNo).then(
										function successCallback(response) {
											return response;
										}, function errorCallback(response) {
										});
							}

							factory.getTaskNo = function() {
								return taskNo;
							}

							factory.setTaskNo = function(value) {
								taskNo = value;
								localStorage.setItem("taskNo", value);
							}

							factory.getSubTask = function() {
								return subtask;
							}
							factory.setSubTask = function(value) {
								subtask = value;
							}

							factory.addSubTask = function(obj) {
								return $http.post(
										path + "/addSubTask?taskNo=" + taskNo,
										obj).then(
										function successCallback(response) {
											return response;
										}, function errorCallback(response) {
										});
							}
							factory.updateSubTask = function(obj) {
								return $http
										.put(path + "/updateSubTask", obj)
										.then(
												function successCallback(
														response) {
													return response;
												},
												function errorCallback(response) {
												});

							}
							
								factory.deleteSubTask = function(subtask) {
								return $http.delete(path + "/deleteSubTask?subTaskno="+subtask).then(
										function successCallback(response) {
											return response;
										}, function errorCallback(response) {
										});

							}
								factory.getSubTasksNo = function(taskNo) {
									return $http
											.get(
													path
															+ "/getSubTasks?taskNo="
															+ taskNo)
											.then(
													function successCallback(
															response) {
														return response;
													},
													function errorCallback(response) {
														console
																.log(response.statusText);
													});
								}

							return factory;
						} ]);