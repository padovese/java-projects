'use strict';

angular.module('blogList').component('blogList', {
	templateUrl: "/templates/blog-list.html",
	controller: function($scope){
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