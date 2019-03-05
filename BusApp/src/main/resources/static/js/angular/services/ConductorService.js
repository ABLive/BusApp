busApp.factory('conductorService', function($http) {
	return {
		getAllConductors: function() {
			return $http({method: 'GET', url: 'https://192.168.43.84:8082/conductor/conductorInfo/getAllConductors'});
		}
	};
});