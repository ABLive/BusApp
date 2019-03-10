busApp.factory('routeService', function($http) {
	return {
		getAllRoutes: function() {
			return $http({method: 'GET', url: 'https://192.168.43.84:8082/route/routeInfo/getAllRoutes'});
		}
	};
});