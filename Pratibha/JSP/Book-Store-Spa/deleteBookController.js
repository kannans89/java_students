angular.module("bookStoreModule").controller("deleteBookController", function ($rootScope, $scope, deleteBookService) {
    $scope.id = $rootScope.id;
    $scope.delete = $rootScope.books.splice($scope.id, 1);
    $scope.deleteBook = function () {
        $rootScope.count--;
        alert("Book Deleted ")
        deleteBookService.deleteBook();
    }
});
angular.module("bookStoreModule").service('deleteBookService', function () {
    this.deleteBook = function () {};
});