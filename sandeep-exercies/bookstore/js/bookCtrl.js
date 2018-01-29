angular.module('app').service('DataService',['$http',f1]);
function f1($http){
	this.request=function(){
		books=$http.get('books.json');
		return books;
	};
}

angular.module('app').controller('bookCtrl',['$rootScope','$scope','DataService',f2]);
	function f2($rootScope,$scope,DataService){
	
	$rootScope.name="sandeep";
	var books=[];

	DataService.request().then(function(response){
		$rootScope.books=response.data;
			 
		
	});	

}