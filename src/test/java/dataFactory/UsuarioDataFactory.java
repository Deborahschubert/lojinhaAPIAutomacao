package dataFactory;
import Pojo.UsuarioPojo;

public class UsuarioDataFactory {
        public static UsuarioPojo criarUsuarioAdministrador(){
            UsuarioPojo usuario = new UsuarioPojo();
            usuario.setUsuarioLogin("inserir usuário");
            usuario.setUsuarioSenha("inserir senha");

            return usuario;
        }
    }
