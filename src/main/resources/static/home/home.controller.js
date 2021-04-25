(function () {
    'use strict';

    angular
        .module('hmsapp')
        .controller('HomeController', HomeController);

    HomeController.$inject = ['$rootScope'];
    function HomeController($rootScope) {
        var vm = this;
    }

})();