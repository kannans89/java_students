angular.module('app',["ngRoute"])
.config(["$routeProvider",f1]);

function f1($routeProvider){
	$routeProvider
	.when("/",{
		templateUrl:"template/main.html",
		controller:"deleteCtrl"
	})
	.when("/editBook", {
	    templateUrl : "template/edit.html",
	    controller:"editCtrl"
	})
	.when("/view", {
	    templateUrl : "template/view.html",
	    controller:"editCtrl"
	});

}