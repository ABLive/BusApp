'use strict';

busApp.controller('DriverController', function DriverController($scope, driverService, $log) {
	
	driverService.getAllDrivers()
		.then(function mySuccess(response) {
			$scope.driverInfo = response.data;
		}, function myError(response) {
			$scope.driverInfo = response.statusText;
		});	
});