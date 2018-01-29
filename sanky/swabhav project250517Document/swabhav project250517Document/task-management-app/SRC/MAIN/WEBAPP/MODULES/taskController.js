angular
		.module('main')
		.controller(
				'taskCtrl',
				[
						'$scope',
						'taskService',
						'$location',
						'$log',
						'subService',
						'$rootScope',
						'$templateCache',
						function($scope, taskService, $location, $log,
								subService, $rootScope, $templateCache) {
							if (sessionStorage.getItem("user") != null) {

								taskService
										.getTasks()
										.then(
												function(response) {
													if (response != null
															&& response.data.length > 0) {
														$scope.tasks = response.data;
													} else {
														$("#noTaskAlert")
																.modal("show");
													}
												},
												function error(response) {
													$log
															.log("no task"
																	+ response.statusText);
												});
							} else {
								$location.path("/login");
							}

							$scope.addTask = function() {
								var taskobj = $scope.task;
								if (taskobj.taskName != ''
										&& taskobj.startDate != ''
										&& taskobj.endDate != '') {
									var task = {
										"taskName" : taskobj.taskName,
										"startDate" : taskobj.startDate,
										"endDate" : taskobj.endDate,

									};

									taskService
											.addTask(task)
											.then(
													function(response) {
														$("#addTaskAlert")
																.modal("show");
														taskService
																.getTasks()
																.then(
																		function(
																				response) {
																			$scope.tasks = response.data;
																		},
																		function error(
																				response) {
																			$log
																					.log("no task"
																							+ response.statusText);
																		})
														if (sessionStorage
																.getItem("user") != null) {
															$location
																	.path("/UserHome");
														} else {
															$location
																	.path("/login");
														}
													},
													function error(response) {
														$log
																.log("no task"
																		+ response.statusText);
													});
								}
							};
							/* delete task */
							$scope.setTaskToDelete = function(taskno) {
								$scope.taskToDelete = taskno;

							}

							$scope.deleteTask = function() {

								taskService
										.deleteTask($scope.taskToDelete)
										.then(
												function(response) {
													$("#deleteTaskAlert")
															.modal("show");
													$scope.getTasksFunction();
													if (sessionStorage
															.getItem("user") != null) {
														$location
																.path("/UserHome");
													} else {
														$location
																.path("/login");
													}
												},
												function error(response) {
													$log
															.log("no task"
																	+ response.statusText);
												});

							}

							$scope.viewUpdate = function(taskId, taskName,
									startDate, endDate) {
								var task = {
									"taskNo" : taskId,
									"taskName" : taskName,
									"startDate" : startDate,
									"endDate" : endDate
								};
								console.log(taskId);
								console.log(endDate);
								taskService.setTask(task);
								if (sessionStorage.getItem("user") != null) {
									$location.path("/UpdateTask");
								} else {
									$location.path("/login");
								}

							};

							$scope.showSubTask = function(taskNo) {
								console.log(taskNo);
								taskService.setTaskNo(taskNo);
								$location.path("/viewSubTask");
							}
							/* update task */
							$scope.viewupdateTask = function(taskno) {
								taskService.getTaskById(taskno).then(
										function(response) {
											console.log(response.data);
											$scope.task = response.data;

										},
										function error(response) {
											$log.log("no subtasks"
													+ response.statusText);
										});
							}

							$scope.updateTask = function(taskId) {

								var taskobj = $scope.task;
								if (taskobj.taskNo != ''
										&& taskobj.taskName != ''
										&& taskobj.startDate != ''
										&& taskobj.endDate != '') {
									var task = {
										"taskNo" : taskobj.taskNo,
										"taskName" : taskobj.taskName,
										"startDate" : taskobj.startDate,
										"endDate" : taskobj.endDate,

									};

									taskService
											.updateTask(task)
											.then(
													function(response) {
														$("#updateTaskAlert")
																.modal("show");
														$scope
																.getTasksFunction();
														if (sessionStorage
																.getItem("user") != null) {
															$location
																	.path("/UserHome");
														} else {
															$location
																	.path("/login");
														}
													},
													function error(response) {
														$log
																.log("no task"
																		+ response.statusText);
													});

								}
							}

							$scope.getTasksFunction = function() {
								taskService
										.getTasks()
										.then(
												function(response) {
													if (response != null
															&& response.data.length > 0) {
														$scope.tasks = response.data;
													} else {
														$("#noSubTaskAlert")
																.modal("show");
													}
												},
												function error(response) {
													$log
															.log("no task"
																	+ response.statusText);
												});
							}

						} ]);