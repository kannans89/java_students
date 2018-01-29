var app = angular.module('main');
app.controller('LoginCtrl', function($scope,LoginService,$location) {
$scope.name ="";
$scope.pwd ="";
$scope.submit = function(){
	var isValid = LoginService.authenticate($scope.name, $scope.pwd);
	if(isValid){
		$location.path('/home');
	}else {
		console.log('error!');
	}
}
});
