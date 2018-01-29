angular.module('main', ['mod1', 'mod2']).
controller('Controller1', function($rootScope) {
    $rootScope.company = 'Aurion Pro';
});
