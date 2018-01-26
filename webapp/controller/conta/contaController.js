app.controller("ContaController", function($scope, $http) {

	$scope.container = {};
	$scope.path = 'conta/';
	$scope.container.tipos = [];
	$scope.container.tipoSelecionado = '';
	$scope.container.despesa = '';
	$scope.container.valor = '';


	$scope.salvar = function () {

		var params = {
				'descricao' : $scope.container.despesa,
				'valor'     : $scope.container.valor,
				'idConta' : $scope.container.tipoSelecionado
		}
		
		$http.post($scope.path + 'salvar', params).then(
				function success (response) {
					if (response.status == 200) {


					}
				},
				function error (response) {

					if (response.status == 500) {

						swal("Oops", response.data.erro, "error");

					}

				}

		);

	}

	$scope.buscarTiposConta = function () {

		$http.post($scope.path + 'listaTipoConta').then(
				function success (response) {
					if (response.status == 200) {

						$scope.container.tipos = response.data.listaTipoConta;

					}
				},
				function error (response) {

					if (response.status == 500) {

						swal("Oops", response.data.erro, "error");

					}

				}

		);

	}

	$scope.buscarTiposConta();

});