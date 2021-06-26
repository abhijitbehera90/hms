
(function () {
    'use strict';
angular
    .module('Appointment')
    .controller('AppointmentListController',['$scope','$http','$state', function ($scope,$http,$state)
    {
    	
    	$scope.name='Ram';
    	$scope.rootUrl='http://localhost:9091/hms/';
    	$scope.createNewAppointment= function(){
    		 $state.go('home.appointment-creation');
    		
    		 
    	}
    	
    	$http.get($scope.rootUrl+"patientappointment/getAll")
    	.then(function(response){
    		$scope.appointmemtList=response.data;
    	});
    
    	
    	
    }])
.controller('AppointmentCreationController',['$scope','$http','$state', function ($scope,$http,$state)
    {
	$scope.appointment={};
	$scope.rootUrl='http://localhost:9091/hms/';
	$scope.createNewAppointment=function(){
		

    	$http.post($scope.rootUrl+"patientappointment/register", $scope.appointment)
    	.then(function(response){
    		 $state.go('home.appointment-list');
    	});
    
	}
    	
    }]).controller('AppointmentDetailsController',['$scope', function ($scope)
    {
    
    	
    	
    }]);
})();