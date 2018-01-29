angular.module("bookstore-app", ["ngRoute"]).config(function ($routeProvider) {
    $routeProvider.when("/", {
        templateUrl: "GetBooksData.html",
        controller: "GetBooksCtrl"
    }).when("/add", {
        templateUrl: "add.html",
        controller: "addCtrl"
    }).when("/edit", {
        templateUrl: "add.html",
        controller: "addCtrl"
    })
});
