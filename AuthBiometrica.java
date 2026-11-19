
public class AuthBiometrica implements MetodoAutenticacion {

    private String huellaRegistrada;


    public AuthBiometrica(String huella) {
        this.huellaRegistrada = huella;
    }

    @Override
    public boolean autenticar(String credencialPrincipal,
                              String credencialSecundaria) {

        return huellaRegistrada.equals(credencialPrincipal)
                && "BIOMETRIA".equals(credencialSecundaria);
    }
}
