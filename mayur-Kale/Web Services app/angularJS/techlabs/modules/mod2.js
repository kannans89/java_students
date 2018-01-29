angular.module('mod1', []).
controller('Controller2', function($rootScope, $scope) {
    $scope.emp = 'Mayur';
    console.log('$rootScope:' + $rootScope.company + " , $scope:" + $scope.emp);
    console.log('controller in module 2')
});

