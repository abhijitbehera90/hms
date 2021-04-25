'use strict';




angular.module('hmsapp')
	.directive('header',function(){
		return {
        templateUrl:'/hms/directives/header/header.html',
        restrict: 'E',
        replace: true
    	}
	});


