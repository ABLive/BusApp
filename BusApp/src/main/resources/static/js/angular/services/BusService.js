busApp.factory('busService', function($http) {
	return {
		getAllBuses: function() {
			return $http({method: 'GET', url: 'https://192.168.43.84:8082/bus/busInfo/getAllBuses'});
		}
	};
});