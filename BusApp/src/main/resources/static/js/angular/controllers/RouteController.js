'use strict';

busApp.controller('RouteController', function RouteController($scope, routeService, $log) {
	
	routeService.getAllRoutes()
		.then(function mySuccess(response) {
			$scope.routeInfo = response.data;
		}, function myError(response) {
			$scope.routeInfo = response.statusText;
		});	
});