'use strict';

busApp.controller('ScanQRCodeController', function ScanQRCodeController($scope, $location, $http) {
	
	console.log($location.absUrl());
	
	var url = $location.absUrl();
	var n = url.lastIndexOf('=');
	var result = url.substring(n + 1);
	
	console.log(result);
	
	$http.get("https://192.168.43.84:8082/qrcode/qrcodeInfo/getStatusForQRCode?stopid=" + result)
	.then(function(response) {
		$scope.getStatus = response.data;	
	});
	
	$scope.openlivestatus = function(routeid) {
		window.location = "https://192.168.43.84:8082/#!/livestatus?routeid=" + routeid;
	}
	
});