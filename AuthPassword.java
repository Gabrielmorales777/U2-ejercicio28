
public class AuthPassword implements MetodoAutenticacion {

    private String usuarioCorrecto;
    private String passwordCorrecta;

    public AuthPassword(String usuario, String password) {
        this.usuarioCorrecto = usuario;
        this.passwordCorrecta = password;
    }

    @Override
    public boolean autenticar(String credencialPrincipal,
                              String credencialSecundaria) {

        return usuarioCorrecto.equals(credencialPrincipal)
                && passwordCorrecta.equals(credencialSecundaria);
    }
}
