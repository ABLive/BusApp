'use strict';

busApp.controller('ScheduleController', function ScheduleController($scope, scheduleService, $log) {
	
	scheduleService.getAllSchedules()
		.then(function mySuccess(response) {
			$scope.scheduleInfo = response.data;
		}, function myError(response) {
			$scope.scheduleInfo = response.statusText;
		});	
});