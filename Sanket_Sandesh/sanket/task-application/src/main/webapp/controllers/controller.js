angular
	.module('taskapp')
	.controller('indexCtrl',
	['$scope', '$location', function ($scope, $location) {
		$scope.message = "This is Index controller";
		$location.path('/');
	}])

	.controller('homeCtrl', ['$scope', function ($scope) {
		$scope.message = "This is Home controller";
	}])

	.controller(
	'loginCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'$cookieStore',
		'taskService',
		function ($scope, $location, $http, $cookieStore,
			taskService) {
			$scope.welcomeMessage = "This is Login controller";
			$scope.login = function () {
				$scope.user = {
					'username': $scope.username,
					'password': $scope.password
				};
				taskService
					.authenticate(
					$scope.user,
					function (response) {
						if (response.data.status) {
							$cookieStore.put(
								'currentUser',
								$scope.user);
							var activeuser = $cookieStore
								.get('currentUser');
							console.log(activeuser);
							$location
								.path('/tasks');
						} else {
							$scope.error = 'Username or Password is incorrect';
							$location
								.path('/login');
						}
					});
			};
		}])

	.controller(
	'logoutCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'$cookieStore',
		'taskService',
		function ($scope, $location, $http, $cookieStore,
			taskService) {
			$scope.message = "This is Logout controller";
			taskService
				.logout(function (response) {
					if (response.data.status) {
						if ($cookieStore.get('currentUser') != null) {
							$cookieStore
								.remove('currentUser');
						}
						$location.path('/login');
					}
				});
		}])

	.controller(
	'signupCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'taskService',
		function ($scope, $location, $http, taskService) {
			$scope.message = "This is Sign-Up controller";
			$scope.signup = function () {
				if ($scope.password1 === $scope.password2) {
					$scope.user = {
						'username': $scope.username,
						'email': $scope.email,
						'password': $scope.password1
					};
					console.log($scope.user);
					taskService
						.signup(
						$scope.user,
						function (response) {
							if (response.data.status) {
								$location
									.path('/login');
							} else {
								$scope.error = 'Username Alredy Exist';
								$location
									.path('/signup');
							}
						});
				} else {
					$scope.error = "Password doesnt match.";
				}
			};
		}])

	.controller(
	'addTaskCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'taskService',
		function ($scope, $location, $http, taskService) {
			$scope.message = "This is Addition Task controller";
			$scope.addTask = function () {
				$scope.newTask = {
					'taskId': $scope.taskId,
					'name': $scope.name,
					'startDate': $scope.startDate,
					'endDate': $scope.endDate
				};
				console.log($scope.newTask);
				taskService.newTask($scope.newTask, function (
					response) {
					if (response.data.status) {
						$location
							.path('/tasks');
					}
					else {
						$scope.error = 'Task Alredy Exist';
						$location.path('/tasks');
					}

				});
			};
		}])

	.controller(
	'addSubTaskCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'$routeParams',
		'taskService',
		function ($scope, $location, $http, $routeParams,
			taskService) {
			$scope.message = "This is Addition Sub-Task controller";
			$scope.addSubTask = function () {
				$scope.newSubTask = {
					'name': $scope.name,
					'startDate': $scope.startDate,
					'endDate': $scope.endDate
				};
				console.log($scope.newSubTask);
				taskService.newSubTask($routeParams.taskId,
					$scope.newSubTask, function (response) {
						$location.path('/tasks');
					});
			};
		}])
	.filter('orderObjectBy', function () {
		return function (items, field, reverse) {
			var filtered = [];
			angular.forEach(items, function (item) {
				filtered.push(item);
			});
			filtered.sort(function (a, b) {
				return (a[field] > b[field] ? 1 : -1);
			});
			if (reverse)
				filtered.reverse();
			return filtered;
		};
	})

	.controller(
	'getTaskCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'$routeParams',
		'$cookieStore',
		'taskService',
		function ($scope, $location, $http, $routeParams,
			$cookieStore, taskService) {
			$scope.message = "This is Task controller";
			$scope.updateTaskStatus = function (task) {
				task.startDate = new Date(task.startDate);
				task.endDate = new Date(task.endDate);
				if (task.status == false)
					task.status = 0;
				else
					task.status = 1;
				$scope.updateTask = {
					'taskId': task.taskId,
					'name': task.name,
					'startDate': task.startDate,
					'endDate': task.endDate,
					'status': task.status
				};
				console.log($scope.updateTask);
				taskService.updateTask(
					$scope.updateTask.taskId,
					$scope.updateTask, function (response) {
						if (response.data.status) {
							$location.path('/tasks');
						} else {
							$location.path('/login');
						}
					});
			};

			taskService.getTasks(function (response) {
				var activeuser = $cookieStore
					.get('currentUser');
				if (activeuser != null) {
					$scope.activeuser = {
						username: activeuser.username,
						password: activeuser.password
					};
				}
				$scope.tasks = response.data;
			});
		}])

	.controller(
	'getSubTaskCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'$routeParams',
		'taskService',
		function ($scope, $location, $http, $routeParams,
			taskService) {
			$scope.message = "This is Get Sub-Task controller";
			$scope.taskId = $routeParams.taskId;
			$scope.updateSubtaskStatus = function (taskId,
				subtask) {
				subtask.startDate = new Date(subtask.startDate);
				subtask.endDate = new Date(subtask.endDate);
				if (subtask.status == false)
					subtask.status = 0;
				else
					subtask.status = 1;
				$scope.updateSubTask = {
					'subtaskId': subtask.subtaskId,
					'name': subtask.name,
					'startDate': subtask.startDate,
					'endDate': subtask.endDate,
					'status': subtask.status
				};
				console.log($scope.updateSubTask);
				taskService.updateSubTask(taskId,
					$scope.updateSubTask.subtaskId,
					$scope.updateSubTask,
					function (response) {
						if (response.data.status) {
							$location.path('/tasks');
						} else {
							$location.path('/login');
						}
					});
			};

			taskService.getSubTasks($routeParams.taskId,
				function (response) {
					$scope.taskId = $routeParams.taskId;
					console.log(response.data);
					$scope.subtasks = response.data;
				});
		}])

	.controller(
	'updateTaskCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'$routeParams',
		'taskService',
		function ($scope, $location, $http, $routeParams,
			taskService) {
			$scope.message = "This is Edit Task controller";
			taskService
				.getTasks(function (response) {
					$scope.tasks = response.data;
					for (var i = 0; i < response.data.length; i++) {
						if (response.data[i].taskId == $routeParams.taskId) {
							console
								.log(response.data[i].name);
							$scope.editTaskData = response.data[i];
							$scope.editTaskData.startDate = new Date(
								$scope.editTaskData.startDate);
							$scope.editTaskData.endDate = new Date(
								$scope.editTaskData.endDate);
						}
					}
				});
			$scope.editTask = function () {
				$scope.updateTask = {
					'taskId': $scope.editTaskData.taskId,
					'name': $scope.editTaskData.name,
					'startDate': $scope.editTaskData.startDate,
					'endDate': $scope.editTaskData.endDate
				};
				console.log($scope.updateTask);
				taskService.updateTask($routeParams.taskId,
					$scope.updateTask, function (response) {
						if (response.data.status) {
							$location.path('/tasks');
						} else {
							$location.path('/login');
						}
					});
			};
		}])

	.controller(
	'updateSubTaskCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'$routeParams',
		'taskService',
		function ($scope, $location, $http, $routeParams,
			taskService) {
			$scope.message = "This is Edit Sub-Task controller";
			taskService
				.getSubTasks(
				$routeParams.taskId,
				function (response) {
					$scope.subtasks = response.data;
					for (var i = 0; i < response.data.length; i++) {
						if (response.data[i].subtaskId == $routeParams.subtaskId) {
							console
								.log(response.data[i].name);
							$scope.editSubTaskData = response.data[i];
							$scope.editSubTaskData.startDate = new Date(
								$scope.editSubTaskData.startDate);
							$scope.editSubTaskData.endDate = new Date(
								$scope.editSubTaskData.endDate);
						}
					}
				});
			$scope.editSubTask = function () {
				$scope.updateSubTask = {
					'subtaskId': $scope.editSubTaskData.subtaskId,
					'name': $scope.editSubTaskData.name,
					'startDate': $scope.editSubTaskData.startDate,
					'endDate': $scope.editSubTaskData.endDate
				};
				console.log($scope.updateSubTask);
				taskService.updateSubTask($routeParams.taskId,
					$routeParams.subtaskId,
					$scope.updateSubTask,
					function (response) {
						if (response.data.status) {
							$location.path('/tasks');
						} else {
							$location.path('/login');
						}
					});
			};
		}])

	.controller(
	'deleteTaskCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'$routeParams',
		'taskService',
		function ($scope, $location, $http, $routeParams,
			taskService) {
			$scope.message = "This is delete Task controller";
			// $scope.deleteTask = function(){
			taskService.deleteTask($routeParams.taskId,
				function (response) {
					console.log('inside delete');
					if (response.data.status) {
						$location.path('/tasks');
					} else {
						$location.path('/login');
					}
				});
		}])

	.controller(
	'deleteSubTaskCtrl',
	[
		'$scope',
		'$location',
		'$http',
		'$routeParams',
		'taskService',
		function ($scope, $location, $http, $routeParams,
			taskService) {
			$scope.message = "This is delete Sub-Task controller";
			taskService.deleteSubTask($routeParams.taskId,
				$routeParams.subtaskId, function (response) {
					if (response.data.status) {
						$location.path('/tasks');
					} else {
						$location.path('/login');
					}
				});
		}]);