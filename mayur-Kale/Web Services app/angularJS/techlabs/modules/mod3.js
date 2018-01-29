angular.module('mod2', []).
controller('Controller3', function($rootScope, $scope) {
    $scope.emp = 'Vikram';
    console.log('$rootScope:' + $rootScope.company + " , $scope:" + $scope.emp);
    console.log('controller in module 3')

});
