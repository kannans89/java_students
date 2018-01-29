angular.module("bookStoreModule").controller("editBookController", function ($rootScope, $scope, editBookService) {
    $scope.id = $rootScope.id;
    $scope.edit = $rootScope.books.splice($scope.id, 1);
    $scope.editBook = function () {
        deleteBookService.deleteBook();
    }
});
angular.module("bookStoreModule").service('editBookService', function () {
    this.deleteBook = function () {};
});