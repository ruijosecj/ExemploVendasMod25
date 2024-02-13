package dao;

import domain.Cliente;

public interface IClienteDAO{

	Boolean cadastrar(Cliente cliente);
	
	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente);


}
