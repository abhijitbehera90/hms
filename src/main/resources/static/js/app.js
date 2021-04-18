/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


(function () {
    'use strict';

    angular.module('hmsapp', [                'ui.router'
             
                
            ])
            .config(config)
            
            config.$inject = ['$httpProvider', '$stateProvider', '$urlRouterProvider'];
    function config($httpProvider, $stateProvider, $urlRouterProvider, $ocLazyLoadProvider) {


    

        $stateProvider
        .state('appointment', {
            controller: 'appointmentController',
            templateUrl: 'appointment/appointment.html',
            controllerAs: 'vm',
            url: '/'
        })
      
      
       ,
                $urlRouterProvider.otherwise('/');

    }
         
           
})();

