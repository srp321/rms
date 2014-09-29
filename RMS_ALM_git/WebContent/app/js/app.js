'use strict';

angular.module('project', ['ngRoute','ngResource', 'project.services', 'project.controllers', 'project.factory']).
config(['$routeProvider',function($routeProvider) {
    $routeProvider.
        when('/', {
        	templateUrl: 'app/partials/home.html',
        	controller: 'ProjectList'
        	}).
    	when('/project/Requirement/show', {
    		templateUrl: 'app/partials/showRequirement.html',
    		controller: 'showRequirementsCtrl'
    		}).
    	when('/project/Requirement', {
    		templateUrl: 'app/partials/addRequirement.html',
    		controller: 'addRequirementCtrl'
    		})
}]);    