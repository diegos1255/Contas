<%@ page contentType="text/html; charset=utf-8"%>
<div ng-controller="HomeController">

	<ol class="breadcrumb">
		<li class="breadcrumb-item" style="color: #007bff;">Você está em</li>
		<li class="breadcrumb-item active">Home</li>
	</ol>
	
	<div class="row">
		<div class="col-xl-3 col-sm-6 mb-3">
			<div class="card text-white bg-danger o-hidden h-100">
				<div class="card-body">
					<div class="card-body-icon">
						<i class="fa fa-fw fa-support"></i>
					</div>
					<div class="mr-5">Despesas</div>
				</div>
				<a href="#" class="card-footer text-white clearfix small z-1"> <span
					class="float-left">Gerenciar Despesas</span> <span class="float-right">
						<i class="fa fa-angle-right"></i>
				</span>
				</a>
			</div>
		</div>
		<div class="col-xl-3 col-sm-6 mb-3">
			<div class="card text-white bg-success o-hidden h-100">
				<div class="card-body">
					<div class="card-body-icon">
						<i class="fa fa-fw fa-list"></i>
					</div>
					<div class="mr-5">Meus Dados</div> 
				</div>
				<a href="#" class="card-footer text-white clearfix small z-1"> <span
					class="float-left">Gerenciar Dados</span> <span class="float-right">
						<i class="fa fa-angle-right"></i>
				</span>
				</a>
			</div>
		</div>
	</div>
	
	<div class="card mb-3">
		<div class="card-header">
			<i class="fa fa-bell-o"></i> Ùltimas contas cadastradas
		</div>
		<div class="list-group list-group-flush small">
			<button ng-click="detalhaServico()" class="list-group-item list-group-item-action" data-target="#modalDetalheServico" data-toggle="modal">
				<div class="media">
					<img class="d-flex mr-3 rounded-circle"
						src="http://placehold.it/45x45" alt="">
					<div class="media-body">
						<strong>Conta 1</strong> cadastrada por <strong>Diego</strong>.
						<div class="text-muted smaller">Data/Hora Cadastro: 12/09/2017 10:50.</div>
					</div>
				</div>
			</button> 
			
			<button ng-click="detalhaServico()" class="list-group-item list-group-item-action" data-target="#modalDetalheServico" data-toggle="modal">
				<div class="media">
					<img class="d-flex mr-3 rounded-circle"
						src="http://placehold.it/45x45" alt="">
					<div class="media-body">
						<strong>Conta 1</strong> cadastrada por <strong>Diego</strong>.
						<div class="text-muted smaller">Data/Hora Cadastro: 12/09/2017 10:50.</div>
					</div>
				</div>
			</button> 
			
			<a href="#" class="list-group-item list-group-item-action"> Ver
				todas as contas... </a>
		</div>
	</div>
	
	<!-- Modal -->
	<div class="modal fade" id="modalDetalheServico" tabindex="-1" role="dialog" aria-labelledby="modalDetalhe" aria-hidden="true">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="modalDetalhe">Detalhes da conta</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
	      
	        <p>Data/Hora Serviço: 15/09/2017 10:52</p>
	        <p>Cliente: {{container.pedido}}</p>
	        <p>Tel Cliente: (41) 99999-9999</p>
	        <p>Atendente: {{container.pedido}}</p>
	        <p>Status: {{status}}</p>
	        <select class="form-control heightAuto">
	        
	        	<option>Selecione</option>
	        	<option>Concluído</option>
	        	<option>Andamento</option>
	        	
	        </select>
	        
	        <div ng-if="enviaMensagem">
	        	
	        	<p>Enviar Mensagem</p>
	        	<input type="text" class="form-control" />
	        	
	        	<br />
	        	<button type="button" class="btn btn-primary">Enviar</button>
	        
	        </div>
	        
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-primary" data-dismiss="modal">Fechar</button>
	      </div>
	    </div>
	  </div>
	</div>

</div>