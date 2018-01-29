angular.module('main', ['ngRoute']).config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/login', {
        templateUrl: 'app/login.html',
        controller: 'loginCtrl'
    }).when('/', {
        templateUrl: 'app/login.html',
        controller: 'loginCtrl'
    }).when('/UserHome', {
        templateUrl: 'app/userHomePage.html',
        controller: 'taskCtrl'
    }).when('/addUser', {
        templateUrl: 'addUser.html',
        controller: 'userCtrl'
    }).when('/addTask', {
        templateUrl: 'app/addTask.html',
        controller: 'taskCtrl'
    }).when('/addSubTask', {
        templateUrl: 'app/addSubTask.html',
        controller: 'subTaskCtrl'
    }).when('/viewUser', {
        templateUrl: 'viewUser.html',
        controller: 'userCtrl'
    }).when('/viewTask', {
        templateUrl: 'viewTask.html',
        controller: 'taskCtrl'
    }).when('/viewSubTask', {
        templateUrl: 'app/subTasks.html',
        controller: 'subTaskCtrl'
    }).when('/forgotPassword', {
        templateUrl: 'app/forgotPassword.html',
        controller: 'passwordCtrl'
    }).when('/UpdateTask', {
        templateUrl: 'app/updateTask.html',
        controller: 'updateCtrl'
    }).when('/UpdateSubTask', {
        templateUrl: 'app/updateSubTask.html',
        controller: 'subTaskCtrl'
    });

        }]).controller('homeCtrl', ['$scope', function ($scope) {

    }]);