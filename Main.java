
public class Main {

    public static void main(String[] args) {

        // Crear servicio de login
        ServicioLogin servicio = new ServicioLogin();


        AuthPassword password = new AuthPassword(
                "gabriel", "123456"
        );

        AuthBiometrica biometrica = new AuthBiometrica(
                "HUELLA_GABRIEL"
        );

        AuthTokenOAuth oauth = new AuthTokenOAuth(
                "TOKEN_ABC123"
        );


        System.out.println("=== AUTENTICACION PASSWORD ===");

        servicio.iniciarSesion(
                password,
                "gabriel",
                "123456"
        );

        // Intento fallido
        servicio.iniciarSesion(
                password,
                "gabriel",
                "000000"
        );


        System.out.println("\n=== AUTENTICACION BIOMETRICA ===");

        servicio.iniciarSesion(
                biometrica,
                "HUELLA_GABRIEL",
                "BIOMETRIA"
        );


        servicio.iniciarSesion(
                biometrica,
                "HUELLA_DESCONOCIDA",
                "BIOMETRIA"
        );


        System.out.println("\n=== AUTENTICACION OAUTH ===");

        servicio.iniciarSesion(
                oauth,
                "TOKEN_ABC123",
                "OAUTH"
        );


        servicio.iniciarSesion(
                oauth,
                "TOKEN_INVALIDO",
                "OAUTH"
        );
    }
}

