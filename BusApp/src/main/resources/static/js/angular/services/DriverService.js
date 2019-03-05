busApp.factory('driverService', function($http) {
	return {
		getAllDrivers: function() {
			return $http({method: 'GET', url: 'https://192.168.43.84:8082/driver/driverInfo/getAllDrivers'});
		}
	};
});