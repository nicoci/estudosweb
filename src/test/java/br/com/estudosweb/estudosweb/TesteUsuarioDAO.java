package br.com.estudosweb.estudosweb;

import br.com.estudosweb.estudosweb.persistencia.entidade.Usuario;
import br.com.estudosweb.estudosweb.persistencia.jdbc.UsuarioDAO;

public class TesteUsuarioDAO {

	public static void main(String[] args) {
		
		testExcluir();
		
			}
	
	public static void testExcluir(){
		//Excuindo o usuario
		Usuario usu = new Usuario();
		usu.setId(5);
		//Excluindo usuario no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
		
		System.out.println("Alterado com sucesso!!!");

	
}
	
	
	
	public static void testAlterar(){
		//Alterando o usuario
		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("ultra");
		usu.setLogin("ntu");
		usu.setSenha("123456");
		//Alterando usuario no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		
		System.out.println("Alterado com sucesso!!!");

	
}
	
		public static void testCadastrar(){
			//criando o usuario
			Usuario usu = new Usuario();
			usu.setNome("Nitrox ul");
			usu.setLogin("ntx");
			usu.setSenha("123456");
			//cadastrando usuario no banco de dados
			UsuarioDAO usuDAO = new UsuarioDAO();
			usuDAO.cadastrar(usu);
			
			System.out.println("Cadastrado com sucesso!!!");

		
	}

}
