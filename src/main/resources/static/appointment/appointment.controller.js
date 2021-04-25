
(function () {
    'use strict';
angular
    .module('Appointment')
    .controller('AppointmentListController',['$scope','$state', function ($scope,$state)
    {
    	$scope.name='Ram';
    	
    	$scope.createNewAppointment= function(){
    		 $state.go('home.appointment-creation');
    		
    	}
    	
    	
    }])
.controller('AppointmentCreationController',['$scope', function ($scope)
    {
    
    	
    }]).controller('AppointmentDetailsController',['$scope', function ($scope)
    {
    
    	
    	
    }]);
})();