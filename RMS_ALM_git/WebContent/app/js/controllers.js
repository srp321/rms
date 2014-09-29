'use strict';

/* Controllers */
angular.module('project.controllers',[]).

controller('addRequirementCtrl',["$routeParams","RequirementService","$scope", function($routeParams,RequirementService,$scope) {
	alert("in controller");
	$scope.isSubmitted = false;
	$scope.isFailure = false;
	$scope.Requirement=false;
	$scope.newRequirement=true;
	$scope.submitRequirement = function() {
		alert("in submit");
		RequirementService.submit($scope.Requirement, function () {
			alert("submit 2");
			console.log('scope is', scope);
			alert("submit 3");
			$scope.isSubmitted = true;
			$scope.isFailure = false;
			$scope.Requirement = {};
		},
		function() {
			$scope.isFailure = true;
			$scope.isSubmitted = false;
		});
		$scope.Requirement = {};
		$("#myModal2").modal ('hide'); 
	};
    $('input').keyup(function() {
        this.value = this.value.toUpperCase();
        makeAllCaps($scope.Requirement);
      });

    function makeAllCaps(Object) {
        for (var key in Object) {
        if(typeof Object[key] == 'number') {}
        else Object[key] = Object[key].toUpperCase();
       }
     }
}]).
controller('showRequirementsCtrl',["RequirementService","$scope","$routeParams", function(RequirementService,$scope,$routeParams) {
	$scope.isException=false;
	$scope.Requirements=RequirementService.getAll( function(responsedata) {
	},function(data)
	{
		$scope.isException=true;
		throw { message: 'Project Id Not Found' };	
	});
	
	$scope.$on('exception',function(e,cause){
	     $scope.exception = cause;
	  });
}])

