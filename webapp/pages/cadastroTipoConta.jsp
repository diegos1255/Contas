<%@ page contentType="text/html; charset=utf-8"%>
<div ng-controller="TipoContaController">

	<ol class="breadcrumb">
		<li class="breadcrumb-item" style="color: #007bff;">Você está em</li>
		<li class="breadcrumb-item active">Gerenciar</li>
		<li class="breadcrumb-item active">Cadastrar Tipo de Conta</li>
	</ol>
	
	<form name="cadastroTipoConta" ng-submit="salvar()" style="width: 50%;">
	
		<div class="card-body">
			<div class="form-group">
				<label>Nome</label> <input type="text"
					class="form-control" placeholder="Digite o tipo da conta">
			</div>

			<button class="btn btn-primary btn-block" style="width: auto;">Salvar</button>
	
		</div>
	
	</form>

</div>