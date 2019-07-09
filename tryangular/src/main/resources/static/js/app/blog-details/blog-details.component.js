'use strict';

angular.module('blogDetails').component('blogDetails', {
	templateUrl: "/templates/blog-details.html",
	controller: function($scope, $http, $routeParams){
		
		$http({
			  method: 'GET',
			  url: '/blog/' + $routeParams.id
			}).then(function successCallback(response) {
			    // this callback will be called asynchronously
			    // when the response is available
				$scope.blog = response.data;
			  }, function errorCallback(response) {
			    // called asynchronously if an error occurs
			    // or server returns response with an error status.
				$scope.blog = response;
			  });
		
	}	
});