'use strict';

busApp.controller('ConductorController', function ConductorController($scope, conductorService, $log) {
	
	conductorService.getAllConductors()
		.then(function mySuccess(response) {
			$scope.conductorInfo = response.data;
		}, function myError(response) {
			$scope.conductorInfo = response.statusText;
		});	
});