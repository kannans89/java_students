angular.module("bookStoreModule").controller("deleteBookController", function ($scope, $rootScope) {
    $scope.deletedBook = $rootScope.books[$rootScope.id];
	$rootScope.books.splice($rootScope.id, 1);
	$rootScope.noOfBooks-=1;
});