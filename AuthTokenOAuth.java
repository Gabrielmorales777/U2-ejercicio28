
public class AuthTokenOAuth implements MetodoAutenticacion {

    private String tokenValido;


    public AuthTokenOAuth(String token) {
        this.tokenValido = token;
    }

    @Override
    public boolean autenticar(String credencialPrincipal,
                              String credencialSecundaria) {

        return tokenValido.equals(credencialPrincipal)
                && "OAUTH".equals(credencialSecundaria);
    }
}
