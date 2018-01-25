app.controller("TipoContaController", function($scope, $http, $location, $rootScope) {

	$scope.container = {};
	$scope.path = 'tipoConta/';
	$scope.container.tipo = '';

	/**
	 * Metodo responsavel por salvar tipo de conta
	 */
	$scope.salvar = function() {

		var params = {
				'tipoConta'   : $scope.container.tipo
		}

		$http.post($scope.path + 'salvar', params).then(
				function success (response) {
					if (response.status == 200) {
						swal("Sucesso", response.data.msg, "success");
						$scope.container.tipo = '';
					}
				},
				function error (response) {

					if (response.status == 500) {

						swal("Oops", response.data.erro, "error");

					}

				}

		);

	}
	
});