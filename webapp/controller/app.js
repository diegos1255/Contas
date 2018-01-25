var app = angular.module('app', ['ui.router', 'angularUtils.directives.dirPagination']);

app.config(function($stateProvider, $locationProvider) {

	/*$locationProvider.html5Mode({
		enabled: true,
		requireBase: false
	});*/

	$stateProvider

	.state('init', {
		url: '/',
		templateUrl: 'index.html' 
	})
	.state('home', {
		url: '/home',
		templateUrl: 'pages/home.jsp'
	})
	.state('conta', {
		url: '/conta',
		templateUrl: 'pages/cadastroContas.jsp'
	})
	.state('tipoConta', {
		url: '/tipoConta',
		templateUrl: 'pages/cadastroTipoConta.jsp' 
	});

});