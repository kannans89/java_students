angular.module('main').factory("studentService", ['$http', function ($http) {
    var factory = {};
    var path = "http: //gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students";
    var students = [];
    factory.get = function () {

        $http.get(path).then(function mysuccess(response) {
            console.log("sevice" + response.data[0].name)
            for (var i = 0; i < response.data.length - 1; i++) {
                students.push(response.data[i])
            }
            //console.log("sevice1" + students)


        });
        return students;
    }
    factory.post = function (obj) {
        // console.log(obj)
        $http.post(path, obj);

    }
    return factory;
}]);