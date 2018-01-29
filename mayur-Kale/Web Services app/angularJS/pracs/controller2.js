var app = angular.module('mainApp', []);


app.controller('CommentsCtrl', function($scope) {
    $scope.comments = [];
    $scope.commentBtn = function() {
        if ($scope.commentText.length != 0 && $scope.commentText != null) {

            $scope.comments.push($scope.commentText);

        }
        $scope.commentText = "";
    }
});
