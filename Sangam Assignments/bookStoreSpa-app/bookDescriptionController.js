angular.module("bookStoreModule").controller("bookDescriptionController", function ($scope, $rootScope) {
$scope.selectedBook=$rootScope.books[$rootScope.id];
console.log($rootScope.books[$rootScope.id]);
})
