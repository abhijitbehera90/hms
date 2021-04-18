/**
 * Created by Assaycr-02 on 11/28/2016.
 */
(function () {
    'use strict';

    angular.module('Home', ['oc.lazyLoad', 'ui.router', 'ui.bootstrap', 'ngCookies']).
            config(['$stateProvider', '$urlRouterProvider', '$ocLazyLoadProvider', function ($stateProvider, $urlRouterProvider, $ocLazyLoadProvider) {

                    $ocLazyLoadProvider.config({
                        debug: false,
                        events: true
                    });

                    $stateProvider
                            .state('home',
                                    {
                                        url: '/home',
                                        controller: 'HomeController',
                                        controllerAs: 'vm',
                                        templateUrl: 'home/home.view.html'
                                    });



                }]);
})();
