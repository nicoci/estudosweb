package br.com.estudosweb.estudosweb.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.estudosweb.estudosweb.persistencia.entidade.Usuario;

public class UsuarioDAO {
	private Connection con = ConexaoFactory.getConnection();

	public void cadastrar(Usuario usu) {
		// TODO Auto-generated method stub
		String sql = "insert into usuario (nome,login,senha) values (?,?,?)";
		
		try {
			//Criando um Statement
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usu.getNome());//substituindo o ? pelo dado do usuario
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			//executando o comando sql no banco
			preparador.execute();
			//fechando o objeto preparador
			preparador.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void alterar(Usuario usu) {
		
String sql = "update usuario set nome=?, login=?, senha=? where id=?";
		
		try {
			//Criando um Statement
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usu.getNome());//substituindo o ? pelo dado do usuario
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			preparador.setInt(4, usu.getId());
			//executando o comando sql no banco
			preparador.execute();
			//fechando o objeto preparador
			preparador.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void excluir(Usuario usu) {
		
		String sql = "delete from usuario where id=?";
				
				try {
					//Criando um Statement
					PreparedStatement preparador = con.prepareStatement(sql);
					preparador.setInt(1, usu.getId());
					//executando o comando sql no banco
					preparador.execute();
					//fechando o objeto preparador
					preparador.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
}
