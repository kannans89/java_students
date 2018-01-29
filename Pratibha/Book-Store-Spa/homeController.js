(function () {
    angular.module("bookStoreModule").controller("homeController", ['$rootScope', '$scope', 'getBookService', function ($rootScope, $scope, getBookService) {
        $rootScope.count;
        $scope.msg = "Home Controller here...iffe!!!";
        console.log($scope.msg);
        getBookService.getBooks().then(function (response) {
            if ($rootScope.books == null) {
                $rootScope.books = response.data;
                $rootScope.count = $rootScope.books.length;
                console.log($scope.books)
            }
        });
        $scope.go = function (event) {
            console.log(event);
            console.log("delete");
            $rootScope.id = event;
        }
}]);
    angular.module("bookStoreModule").service('getBookService', ['$http', function ($http) {
        this.getBooks = function () {
            return $http.get("books.json");
        };
}]);
})();