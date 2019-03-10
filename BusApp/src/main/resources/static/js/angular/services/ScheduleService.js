busApp.factory('scheduleService', function($http) {
	return {
		getAllSchedules: function() {
			return $http({method: 'GET', url: 'https://192.168.43.84:8082/schedule/scheduleInfo/getAllSchedules'});
		}
	};
});