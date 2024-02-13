package service;

import domain.Cliente;
import exception.TipoChaveNaoEncontradaException;

public interface IClienteService {
	Boolean cadastrar(Cliente cliente);

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
