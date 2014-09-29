'use strict';

/* Services */


// Demonstrate how to register services
// In this case it is a simple value service.
angular.module('project.services', []).

service('RequirementService', function($resource) {
    return $resource('', {}, {
      getAll: {method:'GET',isArray:true, url:'RequirementsAll'},
      submit: {method:'POST', url:'Requirement'},
     
    });
});