angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:51586/api/v1/front';

    // console.log(123);

    $scope.loadProducts = function (pageIndex = 1) {
        $http({
            url: contextPath + '/products',
            method: 'GET',
        }).then(function (response) {
            console.log(response.data)
            $scope.ProductsList = response.data;
        });
    };


    $scope.loadProducts();

});