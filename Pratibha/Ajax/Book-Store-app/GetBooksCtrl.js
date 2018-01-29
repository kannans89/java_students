angular.module("bookstore-app").controller("GetBooksCtrl", function ($scope, $rootScope, getBookService) {

    getBookService.getBooks().then(function (response) {
        if ($rootScope.books == null) {
            $rootScope.books = response.data;
            $rootScope.count = $rootScope.books.length;
            console.log($scope.books)
            $scope.data = response.data;
        }
    });
    $scope.delete = function (element) {
        $scope.data.splice(element, 1);
    }
});
angular.module("bookstore-app").service('getBookService', function ($http) {
    this.getBooks = function () {
        return $http.get("data2.json");
    };
});
