'use strict';

angular.module('blogList').component('blogList', {
	templateUrl: "/templates/blog-list.html",
	controller: function($scope, $http){
		
		$http({
			  method: 'GET',
			  url: '/blogs'
			}).then(function successCallback(response) {
			    // this callback will be called asynchronously
			    // when the response is available
				$scope.blogs = response.data;
			  }, function errorCallback(response) {
			    // called asynchronously if an error occurs
			    // or server returns response with an error status.
				$scope.blogs = response;
			  });
		
		
		console.log("Hello");
		$scope.title = 'Hi There';
		$scope.clicks = 0;
		$scope.someClickTest = function(){
			console.log('Clicked');
			$scope.clicks++;
			$scope.title = 'Clicked ' + $scope.clicks + ' times';
		}
	}	
});