angular.module('main',[])
.controller('buttonCtrl',function($scope){

	$scope.submit = function(){
		$scope.visible
 =true;
		$scope.student = {
			name :'Mayur',
			id : 10,
			age : 21,
			agg : 7.20,
			src : 'index.jpg'
		};
	}
});