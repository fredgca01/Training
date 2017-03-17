var myApp = angular.module('example', []);

myApp.controller('ServerCtrl', ['$scope', 'Server', function ($scope, Server) {
    var jsonGet = 'https://www.google.com';
    var jsonPost = '//myserver/postURL';
    
	Server.get(jsonGet);
    //Server.post(jsonPost);
}]);

myApp.controller('UserCtrl', ['$scope', function ($scope) {
	$scope.user = {};
	$scope.user.details= {
		"username": "Fred G",
		"id": "666999"
	};
}]);

myApp.directive('exampleButton', function() {
	return {
		restrict: 'A',
		replace: true,
		transclude: true,
		template: '<a href="" class="myawesomebutton" ng-transclude>' +
				'<i class="icon-ok-sign"></i>' +
				'</a>',
		link:function (scope, element, attrs) {

		}
	};
});

myApp.directive('exampleButtonTmpl', function() {
	return {
		restrict: 'A',
		replace: true,
		transclude: true,
		templateUrl: 'customButton.html',
		link:function (scope, element, attrs) {

		}
	};
});

//a service is a function, or object, that is available for, and limited to, your AngularJS application
myApp.service('Math', function() {
	this.multiply = function(x, y) {
		return x * y;
	};
});

//Once you have created a service, and connected it to your application, 
//you can use the service in any controller, directive, filter, or even inside other services.
//To use the service inside a filter, add it as a dependency when defining the filter:
myApp.controller('MainCtrl', ['$scope', 'Math', function ($scope, Math) {
    var a = 12;
    var b = 24;
    var result = Math.multiply(a,b);
    $scope.text = 'Hello man '+result;
	
}]);

//$http is an XMLHttpRequest object for requesting external data.
myApp.factory('Server', ['$http', function($http) {
	return {
		get: function (url) {
			return $http.get(url);
		},
		post: function(url) {
			return $http.post(url);
		},
	};
}]);


//You can make your own filters by registering a new filter factory function with your module
myApp.filter('reverse', function () {
    return function (input, uppercase) {
        var out = '';
        for (var i = 0; i < input.length; i++) {
            out = input.charAt(i) + out;
        }
        if (uppercase) {
            out = out.toUpperCase();
        }
        return out;
    }
});


myApp.controller('EmailsCtrl', ['$scope', function ($scope) {

  // create a emails Object
  $scope.emails = {};

  // pretend data we just got back from the server
  // this is an ARRAY of OBJECTS
  $scope.emails.messages = [{
        "from": "Steve Jobs",
        "subject": "I think I'm holding my phone wrong :/",
        "sent": "2013-10-01T08:05:59Z"
    },{
        "from": "Ellie Goulding",
        "subject": "I've got Starry Eyes, lulz",
        "sent": "2013-09-21T19:45:00Z"
    },{
        "from": "Michael Stipe",
        "subject": "Everybody hurts, sometimes.",
        "sent": "2013-09-12T11:38:30Z"
    },{
        "from": "Jeremy Clarkson",
        "subject": "Think I've found the best car... In the world",
        "sent": "2013-09-03T13:15:11Z"
    }];

	$scope.deleteEmail = function (index) {
    	$scope.emails.messages.splice(index, 1)
  	};

}]);