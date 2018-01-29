angular.module("bookstore-app").controller("addCtrl", function ($scope, $rootScope) {
    $scope.addBook = function () {
        $scope.book = {
            "ISBN": Math.random() * 100,
            "title": $scope.title,
            "author": $scope.author,
            "price": $scope.price,
            "image": $scope.image,
            "description": $scope.description

        }
        console.log($scope.book);
        console.table($rootScope.books);
        $rootScope.books[$rootScope.books.length] = $scope.book;
        console.table($rootScope.books);
        window.location = "#/";
    }

});
