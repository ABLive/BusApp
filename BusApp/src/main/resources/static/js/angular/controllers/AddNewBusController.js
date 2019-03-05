'use strict';

busApp.controller('AddNewBusController', function AddNewBusController($scope, addNewBusService, $log) {
	
	addNewBusService.getMaxBusId()
		.then(function mySuccess(response) {
			$scope.maxBusId = response.data;
		}, function myError(response) {
			$scope.maxBusId = response.statusText;
		});	
});