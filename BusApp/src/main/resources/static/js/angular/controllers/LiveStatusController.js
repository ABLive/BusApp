'use strict';

busApp.controller('LiveStatusController', function LiveStatusController($scope, $location, $http) {
	
	console.log($location.absUrl());
	
	var url = $location.absUrl();
	var n = url.lastIndexOf('=');
	var result = url.substring(n + 1);
	
	console.log(result);
	
	$scope.currentRoute = result;
	
	$http.get("https://192.168.43.84:8082/specificroute/getroute?routeid=" + result)
	.then(function(response) {
		$scope.getStatus = response.data;
		console.log(response.data);
	});
	
});