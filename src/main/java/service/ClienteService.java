package service;

import dao.IClienteDAO;
import domain.Cliente;
import exception.TipoChaveNaoEncontradaException;

public class ClienteService implements IClienteService{
	
	private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}
	@Override
	public Boolean cadastrar(Cliente cliente) {
		clienteDAO.cadastrar(cliente);
		return true;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		// TODO Auto-generated method stub
		return clienteDAO.buscarPorCPF(cpf);
	}

	@Override
	public void excluir(Long cpf) {
		clienteDAO.excluir(cpf);
		
	}

	@Override
	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		
	}

}
