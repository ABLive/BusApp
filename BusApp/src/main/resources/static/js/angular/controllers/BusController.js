'use strict';

busApp.controller('BusController', function BusController($scope, busService, $log) {
	
	busService.getAllBuses()
		.then(function mySuccess(response) {
			$scope.busInfo = response.data;
		}, function myError(response) {
			$scope.busInfo = response.statusText;
		});	
});