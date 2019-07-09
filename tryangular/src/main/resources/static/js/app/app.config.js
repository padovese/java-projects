'use strict';

angular.module('tryangular').
	config(function($locationProvider, $routeProvider){
		
		$locationProvider.html5Mode({
			enabled: true
		});
		
		$routeProvider.
			when("/", {
				template: "<h1>Index</h1>"
		}).
		when("/blog/:id", {
			template: "<blog-details></blog-details>"
		})
		
	});