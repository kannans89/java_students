angular.module("bookStoreModule").controller("addBookController", function ($scope, $rootScope) {
    $scope.addBook = function () {
        $scope.book = {
            "ISBN":($rootScope.books[$rootScope.books.length - 1].ISBN) + 1
            , "title": $scope.title
            , "author": $scope.author
            , "image": $scope.image
            , description: $scope.description
        }
        $rootScope.books.push($scope.book);
		$rootScope.noOfBooks+=1;
    }
});