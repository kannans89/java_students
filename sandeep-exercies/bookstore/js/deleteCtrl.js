
angular.module('app').controller('deleteCtrl',['$rootScope','$scope',f3]);
	function f3($rootScope,$scope){
	
		$scope.show=function(elment){
		
		$rootScope.showBook=$rootScope.books[elment];

		 // console.log($rootScope.books);
		};
	

		$scope.deleteBook=function(elment){
			$rootScope.books.splice(elment,1);

			 // console.log($rootScope.books);

		};	 

		$scope.clear=function(){
			$rootScope.showBook=null;
			$scope.showBook=null;

			 // console.log("in clr");

		};	


}



