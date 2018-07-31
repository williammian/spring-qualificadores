package qualificadores.servico.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import qualificadores.model.Usuario;
import qualificadores.notificador.Mensagem;
import qualificadores.notificador.Notificador;
import qualificadores.servico.UsuarioServico;

@Service
public class UsuarioServicoImpl implements UsuarioServico {
	
	@Qualifier("importante")
	@Autowired
	private Notificador notificador;
	
	@Override
	public void cadastrar(Usuario usuario) {
		System.out.println("Novo usuário: " + usuario);
		
		notificador.notificar(new Mensagem("Bem vindo!", "Olá!"));
	}
}
