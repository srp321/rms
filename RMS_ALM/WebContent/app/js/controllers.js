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
			alert("SUBMIT 2, 1ST ONE SUBMITTED");
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
}]).

controller('showRequirementsCtrl',["RequirementService","$scope","$routeParams", function(RequirementService,$scope,$routeParams) {
	$scope.isException=false;
	$scope.Requirements=RequirementService.getAll( function(responsedata) {
	},function(data)
	{
		$scope.isException=true;
		throw { message: 'Requirement Not Found' };	
	});
	
	$scope.$on('exception',function(e,cause){
	     $scope.exception = cause;
	  });
}]).

controller('updateRequirementCtrl',["RequirementService","$scope","$routeParams", function(RequirementService,$scope,$routeParams) {
	alert("update Requirement");
	$scope.isSubmitted = false;
	$scope.isFailure = false;
	$scope.Requirement=false;
	$scope.newRequirement=true;
	$scope.submit1Update = function() {
		alert("in submit");
		RequirementService.submit1($scope.Requirement, function () {
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
	$scope.$on('exception',function(e,cause){
	     $scope.exception = cause;
	  });
}]).

controller('deleteRequirementCtrl',["RequirementService","$scope","$routeParams", function(RequirementService,$scope,$routeParams) {
	alert("delete Requirement");
	$scope.$on('exception',function(e,cause){
	     $scope.exception = cause;
	  });
}])


