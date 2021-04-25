'use strict';

/**
 * @ngdoc directive
 * @name izzyposWebApp.directive:adminPosHeader
 * @description
 * # adminPosHeader
 */
angular.module('hmsapp')
	.directive('headerNotification',function(){
		return {
        templateUrl:'/hms/directives/header/header-notification/header-notification.html',
        restrict: 'E',
        replace: true
    	}
	});


