/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


(function () {
    'use strict';

    angular.module('hmsapp', [ 'oc.lazyLoad',
        'ui.router',
        'ui.bootstrap',
        'ngCookies',
        'Appointment'
            ])
            .config(config)
            
            config.$inject = ['$httpProvider', '$stateProvider', '$urlRouterProvider'];
    function config($httpProvider, $stateProvider, $urlRouterProvider, $ocLazyLoadProvider) {


    

        $stateProvider
        .state('login', {
            templateUrl: 'login/login.view.html',
            controller: 'LoginController',
            controllerAs: 'vm',
            url: '/'
        }).state('home',{
            url:'/home',
            controller: 'HomeController',
            controllerAs: 'vm',
            templateUrl:'home/home.view.html',
            resolve: {
                loadMyFiles:function($ocLazyLoad) {
                    return $ocLazyLoad.load({
                        name:'hmsapp',
                        files:[
                            '/hms/directives/header/header.js',
                            '/hms/directives/header/header-notification/header-notification.js',
                            '/hms/directives/sidebar/sidebar.js',
                            '/hms/directives/sidebar/sidebar-search/sidebar-search.js',
                        ]
                    })
                }
            }
        }).state('home.dashboard',{
            url:'/',
            controller: 'DashBoardCtrl',
            templateUrl:'home/home.html',
            resolve: {
                loadMyFiles:function($ocLazyLoad) {
                    return $ocLazyLoad.load({
                        name:'hmsapp',
                        files:[
                            '/hms/styles/morris.css',
                            '/hms/js/moment.js',
                            '/hms/js/raphael-min.js',
                            '/hms/js/morris.min.js',
                            '/hms/directives/notifications/notifications.js'
                        ]
                    })
                }
            }
        })
      
      
       ,
                $urlRouterProvider.otherwise('/login');

    }
         
           
})();

