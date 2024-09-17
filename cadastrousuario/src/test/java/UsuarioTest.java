import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.Usuario;

public class UsuarioTest {
    /**
     * 
     */
    @Test
    public void DeveCadastrarComSucessoTest(){
        Usuario usuarioValido = new Usuario("Andrey", "andrey@gmail.com", "123", "123", 12789677964, );
        usuarioValido.salvarUsuario();
        assertEquals("Usuário salvo com sucesso!", usuarioValido);
    }
}
