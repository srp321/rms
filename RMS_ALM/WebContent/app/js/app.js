'use strict';

angular.module('project', ['ngRoute','ngResource', 'project.services', 'project.controllers', 'project.factory']).
config(['$routeProvider',function($routeProvider) {
    $routeProvider.
        when('/', {
        	templateUrl: 'app/partials/home.html',
        	controller: 'none'
        	}).
    	when('/project/Requirement/show', {
    		templateUrl: 'app/partials/showRequirement.html',
    		controller: 'showRequirementsCtrl'
    		}).
    	when('/project/Requirement', {
    		templateUrl: 'app/partials/addRequirement.html',
    		controller: 'addRequirementCtrl'
    		}).
    	when('/project/Requirement/update', {
    		templateUrl: 'app/partials/updateRequirement.html',
    		controller: 'updateRequirementCtrl'
    		}).
    	when('/project/Requirement/delete', {
    		templateUrl: 'app/partials/deleteRequirement.html',
    		controller: 'deleteRequirementCtrl'
    		})
}]);    