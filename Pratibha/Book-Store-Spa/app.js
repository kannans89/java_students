(function () {
    angular.module("bookStoreModule", ["ngRoute"]).config(['$routeProvider', f1]);

    function f1($routeProvider) {
        $routeProvider.when("/", {
            templateUrl: "home.html"
            , controller: "homeController"
        })
        $routeProvider.when("/addBook", {
            templateUrl: "addBook.html"
            , controller: "addBookController"
        })
        $routeProvider.when("/deleteBook", {
            templateUrl: "deleteBook.html"
            , controller: "deleteBookController"
        });
    }
})();