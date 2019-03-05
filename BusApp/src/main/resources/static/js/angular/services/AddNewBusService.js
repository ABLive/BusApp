busApp.factory('addNewBusService', function($http) {
	return {
		getMaxBusId: function() {
			return $http({method: 'GET', url: 'https://192.168.43.84:8082/bus/busInfo/maxBusId'});
		}
	};
});