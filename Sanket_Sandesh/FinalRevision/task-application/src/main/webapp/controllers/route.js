angular.module('taskapp', ['ngRoute', 'ngCookies'])
		.config(['$routeProvider', function($routeProvider) {
			$routeProvider
				.when('/', {
		            templateUrl: 'partials/home.html',
		            controller: 'indexCtrl'
        		})

        		.when('/login', {
		            templateUrl: 'partials/login.html',
		            controller: 'loginCtrl'
        		})

        		.when('/logout', {
		            templateUrl: 'partials/login.html',
		            controller: 'logoutCtrl'
        		})

        		.when('/changepassword', {
		            templateUrl: 'partials/changepassword.html',
		            controller: 'updatePasswordCtrl'
        		})

        		.when('/forgotpassword', {
		            templateUrl: 'partials/forgotpassword.html',
		            controller: 'forgotPasswordCtrl'
        		})

        		.when('/signup', {
		            templateUrl: 'partials/signup.html',
		            controller: 'signupCtrl'
        		})

        		.when('/uploadimage', {
		            templateUrl: 'partials/uploadform.html',
		            controller: 'imageCtrl'
        		})


        		.when('/tasks', {
		            templateUrl: 'partials/main.html',
		            controller: 'getTaskCtrl'
        		})

        		.when('/task/:taskId/subtasks', {
		            templateUrl: 'partials/subtask.html',
		            controller: 'getSubTaskCtrl'
        		})

        		.when('/addtask', {
		            templateUrl: 'partials/addTask.html',
		            controller: 'addTaskCtrl'
        		})

        		.when('/task/:taskId/addsubtask', {
		            templateUrl: 'partials/addSubTask.html',
		            controller: 'addSubTaskCtrl'
        		})

				.when('/updatetask/:taskId', {
		            templateUrl: 'partials/editTask.html',
		            controller: 'updateTaskCtrl'
        		})

        		.when('/task/:taskId/updatesubtask/:subtaskId', {
		            templateUrl: 'partials/editSubTask.html',
		            controller: 'updateSubTaskCtrl'
        		})

        		.when('/deletetask/:taskId', {
		            templateUrl: 'partials/main.html',
		            controller: 'deleteTaskCtrl'
        		})

        		.when('/task/:taskId/deletesubtask/:subtaskId', {
		            templateUrl: 'partials/subtask.html',
		            controller: 'deleteSubTaskCtrl'
        		})
        		.when('/profile', {
		            templateUrl: 'partials/profile.html',
		            controller: 'profileCtrl'
        		})
        }]);