package com.sistema.gerenciador.clube.session;
import com.sistema.gerenciador.clube.entity.Usuario;

/**
 *
 * @author rian_
 */
public class UsuarioLogado {
    
    public static Long id;
    public static String nome;
    public static String login;

    public void setUsuarioLogado(Usuario usuarioLogado){        
        id = usuarioLogado.getId();
        nome = usuarioLogado.getNome();
        login = usuarioLogado.getLogin();
    }
}
