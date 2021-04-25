'use strict';




angular.module('Appointment', ['oc.lazyLoad', 'ui.router', 'ui.bootstrap', 'ngCookies', 'ngTable']).
    config(['$stateProvider', '$urlRouterProvider', '$ocLazyLoadProvider', function ($stateProvider, $urlRouterProvider, $ocLazyLoadProvider) {

        $ocLazyLoadProvider.config({
            debug: false,
            events: true
        });

        $stateProvider
            .state('home.appointment-list', {
                templateUrl: 'appointment/appointment-list.html',
                controller: 'AppointmentListController',
                controllerAs: 'vm',
                url: '/appointment-list'
            })
            .state('home.appointment-detail', {
                templateUrl: 'appointment/appointment-detail.html',
                controller: 'AppointmentDetailsController',
                controllerAs: 'vm',
                url: '/appointment-detail/:id'
            })

            .state('home.appointment-creation', {
                templateUrl: 'appointment/appointment-creation.html',
                controller: 'AppointmentCreationController',
                controllerAs: 'vm',
                url: '/appointment-creation'
            })
    }]);
