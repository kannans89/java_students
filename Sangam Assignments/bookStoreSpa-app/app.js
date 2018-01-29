(function () {
    angular.module("bookStoreModule", ["ngRoute"]).config(['$routeProvider', appFunction]);

    function appFunction($routeProvider) {
        $routeProvider.when("/", {
            templateUrl: "Template/home.html"
            , controller: "homeController"
        }).when("/addBook", {
            templateUrl: "Template/addBook.html"
            , controller: "addBookController"
        }).when("/deleteBook", {
            templateUrl: "Template/deleteBook.html"
            , controller: "deleteBookController"
        }).when("/editBook", {
            templateUrl: "Template/editBook.html"
            , controller: "editController"
        }).when("/bookDescription", {
            templateUrl: "Template/bookDescription.html"
            , controller: "bookDescriptionController"
        });
    }
}());