<%@ page contentType="text/html; charset=utf-8"%>
<div ng-controller="ContaController">

	<ol class="breadcrumb">
		<li class="breadcrumb-item" style="color: #007bff;">Você está em</li>
		<li class="breadcrumb-item active">Gerenciar</li>
		<li class="breadcrumb-item active">Cadastrar Clientes</li>
	</ol>
	
	<form name="cadastro" ng-submit="salvar()">
	
		<div class="card-body">
			<div class="form-group">
				<label>Descrição Despesa</label> <input type="text"
					class="form-control" placeholder="Digite a descrição da despesa" ng-model="container.despesa">
			</div>

			<div class="form-group">
				<label>Valor</label> <input type="text"
					class="form-control" placeholder="Digite o valor" ng-model="container.valor">
			</div>

			<div class="form-group">
				<label>Tipo Conta</label>
				<select class="form-control" style="height: auto;" ng-model="container.tipoSelecionado">
					 <option value="">--Selecione--</option>
					 <option ng-repeat="tipo in container.tipos" value="{{tipo.id}}">{{tipo.tipoConta}}</option>
	        	</select>
			</div>

			<button class="btn btn-primary btn-block">Salvar</button>
	
		</div>
	
	</form>

</div>