'use strict';

/**
 * @ngdoc directive
 * @name izzyposWebApp.directive:adminPosHeader
 * @description
 * # adminPosHeader
 */
angular.module('hmsapp')
	.directive('notifications',function(){
		return {
        templateUrl:'/hms/directives/notifications/notifications.html',
        restrict: 'E',
        replace: true
    	}
	});


