
public class ServicioLogin {

    public void iniciarSesion(MetodoAutenticacion metodo,
                              String credencialPrincipal,
                              String credencialSecundaria) {

        System.out.println("\nProcesando inicio de sesion...");

        if (metodo.autenticar(credencialPrincipal,
                credencialSecundaria)) {

            System.out.println("Acceso concedido. Bienvenido al sistema.");

        } else {

            System.out.println("Acceso denegado. Credenciales incorrectas.");

        }
    }
}
