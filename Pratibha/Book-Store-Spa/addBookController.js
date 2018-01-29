angular.module("bookStoreModule").controller("addBookController", function ($rootScope, $scope, addBookService) {
    $scope.addBook = function () {
        $rootScope.count++;
        $rootScope.books.push(addBookService.addBook($scope.isbn, $scope.title, $scope.author, $scope.image, $scope.description));
        alert("Book added Successfully...");
    }
});
angular.module("bookStoreModule").service('addBookService', function () {
    var book = {
        isbn: ''
        , title: ''
        , author: ''
        , image: ''
        , description: ''
    };
    this.addBook = function (isbn, title, author, image, description) {
        book.isbn = isbn;
        book.title = title;
        book.author = author;
        book.image = image;
        book.description = description;
        return book;
    };
});