
angular.module('app').controller('editCtrl',['$rootScope','$scope',f3]);
function f3($rootScope,$scope){
	
	$scope.addBook=function(){
		var elment;
		var isbn;


		// console.log($scope.showBook);

		for (var i = 0; i < $rootScope.books.length; i++) 
		{
			if ($scope.showBook.ISBN==null) {
				elment=$rootScope.books.length;
				isbn= Math.floor(Math.random()*9999999999);
				$scope.showBook.ISBN=isbn;
				break;
			}
			if ($rootScope.showBook.ISBN==$rootScope.books[i].ISBN  ) 
			{
				elment=i;
				isbn=$rootScope.showBook.ISBN;
				break;
			}else {
				elment=$rootScope.books.length;
				isbn= Math.floor(Math.random()*9999999999);
			}
		}

		$rootScope.books[elment]=angular.copy($scope.showBook);
		clear();
		
	};	

	$scope.clear=function(){
		$rootScope.showBook=null;
		$scope.showBook=null;

		 // console.log("in clr");

		};	




		$scope.deleteBook=function(elment){
			$rootScope.books.splice(elment,1);

		// console.log($rootScope.books);

	};	 

	

}