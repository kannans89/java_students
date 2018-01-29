angular.module("bookStoreModule").controller("editController", function ($scope, $rootScope) {
    $scope.title = $rootScope.books[$rootScope.id].title;
    $scope.author = $rootScope.books[$rootScope.id].author;
    $scope.image = $rootScope.books[$rootScope.id].image;
    $scope.description = $rootScope.books[$rootScope.id].description;
    $scope.updateBookDetails = function () {
        $scope.book = {
            "ISBN": $rootScope.id + 1
            , "title": $scope.title
            , "author": $scope.author
            , "image": $scope.image
            , "description": $scope.description
        }
		console.log($rootScope.id);
        $rootScope.books[$rootScope.id] = $scope.book;
    }
});