var busApp = angular.module('busApp', ['ui.router']);

busApp.config(function($stateProvider, $urlRouterProvider) {
	
	$urlRouterProvider.otherwise('/home');
	
	$stateProvider.state('home', {
		url: '/home',
		templateUrl: '../template/home.html'
	})
	
	.state('drivers', {
		url: '/drivers',
		templateUrl: '../template/drivers.html',
		controller: 'DriverController'
	})
	
	.state('conductors', {
		url: '/conductors',
		templateUrl: '../template/conductors.html',
		controller: 'ConductorController'
			
	})
	
	.state('buses', {
		url: '/buses',
		templateUrl: '../template/buses.html',
		controller: 'BusController'			
	})
	
	.state('routes', {
		url: '/routes',
		templateUrl: '../template/routes.html'
	})
	
	.state('schedule', {
		url: '/schedule',
		templateUrl: '../template/schedule.html'
	})
	
	.state('addNewBus', {
		url: '/addNewBus',
		templateUrl: '../template/addNewBus.html',
		controller: 'AddNewBusController'
	})
	
	.state('addNewConductor', {
		url: '/addNewConductor',
		templateUrl: '../template/addNewConductor.html',
		controller: ''
	})
	
	.state('addNewDriver', {
		url: '/addNewDriver',
		templateUrl: '../template/addNewDriver.html',
		controller: ''
	})
	
	.state('addNewRoute', {
		url: '/addNewRoute',
		templateUrl: '../template/addNewRoute.html',
		controller: ''
	})
	
	.state('addNewSchedule', {
		url: '/addNewSchedule',
		templateUrl: '../template/addNewSchedule.html',
		controller: ''
	});
	
});