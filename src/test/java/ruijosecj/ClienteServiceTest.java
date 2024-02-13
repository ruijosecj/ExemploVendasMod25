package ruijosecj;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dao.IClienteDAO;
import domain.Cliente;
import exception.TipoChaveNaoEncontradaException;
import ruijosecj.dao.ClienteDaoMock;
import service.ClienteService;
import service.IClienteService;

public class ClienteServiceTest {
	private IClienteService clienteService;
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		this.clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException{
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Rodrigo");
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		
	}

	@Test
	public void pesquisarCliente() {
		//String nome, Long cpf, Long tel, String end, Integer numero, String cidade, String estado
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente()  {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Rodrigo Pires");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Rodrigo Pires", cliente.getNome());
	}
}
