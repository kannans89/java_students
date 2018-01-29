angular.module('main', [])
    .controller('BindingCtrl', function($scope) {

        $scope.style = {
            message: 'Hello World',
            size: 30,
            bgcolor: 'white',
            txtcolor: 'black',
            fontType: 'arial'
        }
    });
