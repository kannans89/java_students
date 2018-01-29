(function () {
    angular.module("bookStoreModule").controller("homeController", ['$rootScope', '$scope', 'getBookService', function ($rootScope, $scope, getBookService) {
        getBookService.getBooks().then(function (response) {
            if ($rootScope.books == null) {
                $rootScope.books = response.data;
				$rootScope.noOfBooks=$rootScope.books.length;
                console.log($scope.books)
            }
        });
        $scope.deleteBookEvent = function (event) {
            $rootScope.id = event;
        }
        $scope.editBookEvent = function (event) {
            $rootScope.id = event;
        }
		$scope.showBookEvent = function (event) {
            $rootScope.id = event;
			console.log($rootScope.id);
        }
 }]);
 angular.module("bookStoreModule").service('getBookService', ['$http', function ($http) {
        this.getBooks = function () {
            return $http.get("books.json");
        };
}]);
})();