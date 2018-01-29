angular.module('main', [])
    .controller('StudentCtrl', function($scope, $timeout) {
        function Student(name, id, age, agg) {
            this.getName = function() {
                return name;
            };
            this.getId = function() {
                return id;
            };
            this.getAge = function() {
                return age;
            };
            this.getAgg = function() {
                return agg;
            };


            var setColor = function(agg) {
                if (agg >= 7 && agg <= 10)
                    return 'green';
                else
                if (agg >= 5 && agg < 7)
                    return 'yellow';
                else if (agg < 5)
                    return 'red';
            };
            $scope.colorType = setColor(agg);


        };


        $scope.student = new Student('Mayur', 1, 21, 7.22);

        var changeStudent = function() {
            $scope.student = new Student('Vikram', 2, 21, 8.22);
        }
        $timeout(changeStudent, 2000);
    });
