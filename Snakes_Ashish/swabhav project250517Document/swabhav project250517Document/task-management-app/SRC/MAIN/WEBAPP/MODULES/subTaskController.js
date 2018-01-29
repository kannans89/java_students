angular
		.module('main')
		.controller(
				'subTaskCtrl',
				[
						'$scope',
						'subService',
						'taskService',
						'$location',
						'$rootScope',
						'$templateCache',
						function($scope, subService, taskService, $location,
								$rootScope, $templateCache) {
							$scope.subtaskNameError = "";

							if (sessionStorage.getItem("user") != null) {
								$templateCache.remove('/viewSubTask');
								subService
										.getSubTasks()
										.then(
												function(response) {
													if (response != null
															&& response.data.length > 0) {
														$scope.subtasks = response.data;
													} else {
														$("#noSubTaskAlert").modal("show");
													}
												},
												function error(response) {
													$log
															.log("no subtasks"
																	+ response.statusText);
												});
							} else {
								$location.path("/login");
							}

							$scope.addSubTask = function() {
								var subTaskobj = $scope.subtask;
								if (subTaskobj.subTaskname != ''
										&& subTaskobj.startDate != ''
										&& subTaskobj.endDate != '') {
									var subTask = {
										"subTaskname" : subTaskobj.subTaskname,
										"startDate" : subTaskobj.startDate,
										"endDate" : subTaskobj.endDate,

									};
									subService
											.addSubTask(subTask)
											.then(
													function(response) {
														$("#addSubTaskAlert").modal("show");
														$scope
																.getSubTasksFunction();

														if (sessionStorage
																.getItem("user") != null) {
															$location
																	.path("/viewSubTask");
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

							$scope.updateSubTask = function(subtaskId) {

								var subtask = {
									"subTaskno" : $scope.subtask.subTaskno,
									"subTaskname" : $scope.subtask.subTaskname,
									"startDate" : $scope.subtask.startDate,
									"endDate" : $scope.subtask.endDate,

								};

								subService
										.updateSubTask(subtask)
										.then(
												function(response) {
													$("#updateSubTaskAlert").modal("show");
													$scope
															.getSubTasksFunction();

													if (sessionStorage
															.getItem("user") != null) {
														$location
																.path("/viewSubTask");
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
							
							$scope.viewSubTask = function(subtaskno) {
								subService.getSubTaskById(subtaskno).then(
										function(response) {
											$scope.subtask = response.data;
										},
										function error(response) {
											$log.log("no subtasks"
													+ response.statusText);
										});
							}

							

							$scope.getSubTasksFunction = function() {
								subService
										.getSubTasks()
										.then(
												function(response) {
													if (response != null
															&& response.data.length > 0) {
														$scope.subtasks = response.data;
													} else {
														$("#noSubTaskAlert").modal("show");
													}
												},
												function error(response) {
													$log
															.log("no subtasks"
																	+ response.statusText);
												});
							}
							
							$scope.validateSubTaskForm = function() {
								var regex1 = new RegExp("[^a-z|^A-Z]");
								console.log("inside validate");
								if (regex1.test($scope.subtask.subTaskname)) {
									$scope.subtaskNameError = "*invalid Subtask name!!! pls enter only alphabets*";

								} else {
									$scope.subtaskNameError = "";

								}

							}
							$scope.setSubTaskToDelete = function(subTaskno) {
								$scope.subTaskToDelete = subTaskno;

							}
							$scope.deleteSubTask = function() {
								subService
										.deleteSubTask($scope.subTaskToDelete)
										.then(
												function(response) {
													$("#deleteSubTaskAlert").modal("show");
													$scope
															.getSubTasksFunction();

													if (sessionStorage
															.getItem("user") != null) {
														$location
																.path("/viewSubTask");
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

						} ]);