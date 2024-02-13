package ruijosecj.dao;

import dao.IClienteDAO;
import domain.Cliente;

public class ClienteDaoMock implements IClienteDAO {

	@Override
	public Boolean cadastrar(Cliente cliente) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		Cliente cliente = new Cliente("Rui José", 12312312312L, 85999999999L, "End", 10, "Fortaleza", "CE");
		return cliente;
	}

	@Override
	public void excluir(Long cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

}
