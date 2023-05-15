import java.util.*;

public class decryption {
    //-------------------------MAPS------------------------------>>
    public static Map<Character, Integer> getUnicode() {
        Map<Character, Integer> unicodeMap = new HashMap<>();

        System.out.println("- Caracteres del alfabeto en minúsculas:" );
        for (char c = 'a'; c <= 'z'; c++) {
            unicodeMap.put(c, (int) c);
        }

        System.out.println("- Caracteres del alfabeto en mayúsculas:" );
        for (char c = 'A'; c <= 'Z'; c++) {
            unicodeMap.put(c, (int) c);
        }

        System.out.println("- Caracteres del alfabeto numeros:" );
        for (char c = '0'; c <= '9'; c++) {
            unicodeMap.put(c, (int) c);
        }

        System.out.println("- Caracteres especiales ñ y tildes:" );
        unicodeMap.put('ñ', (int) 'ñ');
        unicodeMap.put('Ñ', (int) 'Ñ');
        unicodeMap.put('á', (int) 'á');
        unicodeMap.put('é', (int) 'é');
        unicodeMap.put('í', (int) 'í');
        unicodeMap.put('ó', (int) 'ó');
        unicodeMap.put('ú', (int) 'ú');
        unicodeMap.put('Á', (int) 'Á');
        unicodeMap.put('É', (int) 'É');
        unicodeMap.put('Í', (int) 'Í');
        unicodeMap.put('Ó', (int) 'Ó');
        unicodeMap.put('Ú', (int) 'Ú');

        System.out.println("- Caracteres especiales:" );
        unicodeMap.put('!', (int) '!');
        unicodeMap.put('¡', (int) '¡');
        unicodeMap.put('?', (int) '?');
        unicodeMap.put('¿', (int) '¿');
        unicodeMap.put('.', (int) '.');
        unicodeMap.put(',', (int) ',');
        unicodeMap.put(':', (int) ':');
        unicodeMap.put(';', (int) ';');
        unicodeMap.put('-', (int) '-');
        unicodeMap.put('_', (int) '_');
        unicodeMap.put('(', (int) '(');
        unicodeMap.put(')', (int) ')');
        unicodeMap.put('[', (int) '[');
        unicodeMap.put(']', (int) ']');
        unicodeMap.put('{', (int) '{');
        unicodeMap.put('}', (int) '}');
        unicodeMap.put('"', (int) '"');
        unicodeMap.put('\'', (int) '\'');
        unicodeMap.put('\\', (int) '\\');
        unicodeMap.put('/', (int) '/');
        unicodeMap.put('<', (int) '<');
        unicodeMap.put('>', (int) '>');

        return unicodeMap;
    }

//------------------------------decryption---------------------------------------\\
    public static String cifrar(String mensaje, int clave) {
        StringBuilder cifrado = new StringBuilder();
        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            caracter = (char) (caracter + clave);
            cifrado.append(caracter);
        }
        return cifrado.toString();
    }
    public static String descifrar(String mensajeCifrado, int clave) {
        StringBuilder descifrado = new StringBuilder();
        for (int i = 0; i < mensajeCifrado.length(); i++) {
            char caracter = mensajeCifrado.charAt(i);
            caracter = (char) (caracter - clave);
            descifrado.append(caracter);
        }
        return descifrado.toString();
    }
 //><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><\\
    public static String cifrarConMapa(String msg){
        StringBuilder cifrado = new StringBuilder();


        return cifrado.toString();
    }

    public static String descifrarConMapa(String msg){
        StringBuilder descifrado = new StringBuilder();


        return descifrado.toString();
    }




//------------------------------MENU---------------------------------------------\\
    public static void limpiarConsola(){
    for(int i =0;i<50;i++){
        System.out.println("");
    }
}
    public static void txtMenu(){
        System.out.println("*------------------------------*");
        System.out.println("|  ·   ·   -|[MENU]|-   ·   ·  |");
        System.out.println("*------------------------------*");
        System.out.println("| 1 | -  Ingresar mensaje      |");
        System.out.println("| 2 | -  Mostrar mensaje       |");
        System.out.println("| 3 | -  TEST                  |");
        System.out.println("| 4 | -  Cifrar mensaje        |");
        System.out.println("| 5 | -  Descifrar mensaje     |");
        System.out.println("| 6 | -  Ver clave Cifrado     |");
        System.out.println("| 7 | -  Cambiar clave Cifrado |");
        System.out.println("| 8 | -  borrar msg            |");
        System.out.println("| 9 | -  Ver mapa actual       |");
        System.out.println("| 0 | -  Salir                 |");
        System.out.println("*------------------------------*");
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int option = -1;      // Option elegida por usuario
        String msg = null;     // Mensaje introducido por usuario
        String xxx = null;   // Variable Aux para encriptar mensaje

        boolean salir = false;
        int clave = 1234;

        char[] auxMsg;    // ** PRUEBAS ** | (variable auxiliar para la Conversion mensaje)

        do {
            txtMenu();
            try {
                System.out.println("Escribe una de las opciones:");
                option = sc.nextInt();
                switch (option) {
                    case 1 -> {
                        sc.nextLine(); //limpiar buffer
                        System.out.println("Escriba su mensaje:");
                        msg = sc.nextLine();
                        System.out.println("Mensaje guardado correctamente.");
                    }
                    case 2 -> {
                        if (!msg.isBlank()) {
                            System.out.println("Su mensaje es: " + msg);
                        } else {
                            System.out.println("Utilice la opcion 1 para almacenar un mensaje.");
                        }
                    }
                    case 3 -> {
                        String mensajeCifrado = cifrar(msg, clave);
                        String mensajeDescifrado = descifrar(mensajeCifrado, clave);
                        System.out.println("Mensaje original: " + msg);
                        System.out.println("Mensaje cifrado: " + mensajeCifrado);
                        System.out.println("Mensaje descifrado: " + mensajeDescifrado);
                    }
                    case 4 -> {
                        if(msg == null){
                            sc.nextLine(); //limpiar buffer
                            System.out.println("Ingrese mensaje para cifrar: ");
                            msg = sc.nextLine();
                            System.out.println("Mensaje guardado correctamente.");
                        }
                        xxx = cifrar(msg, clave);
                        System.out.println("Mensaje cifrado correctamente: " + xxx);
                    }
                    case 5 -> {
                        if(xxx == null){
                            sc.nextLine(); //limpiar buffer
                            System.out.println("Ingrese mensaje para descifrar:");
                            xxx = sc.nextLine();
                        }
                        xxx = descifrar(xxx, clave);
                        System.out.println("Mensaje descifrado correctamente: " + xxx);
                    }
                    case 6 -> System.out.println("La clave es --> " + clave);
                    case 7 -> {
                        System.out.println("Introduzca nueva clave:");
                        clave = sc.nextInt();
                        System.out.println("Clave cambiada correctamente.");
                    }
                    case 8 -> {
                        msg = null;
                        xxx = null;
                        System.out.println("Reset OK.");
                    }
                    case 9 -> {
//                        auxMsg = msg.toCharArray(); // Convertimos string a array de chars
//                        if (!(auxMsg.length == 0)) {
//                            System.out.println("Su array es: ");
//                            imprimirArregloChar(auxMsg);
//                        } else {
//                            System.out.println("Utilice la opcion 1 para almacenar un mensaje.");
//                        }
                        //Imprimimos MAP con letras nums ,mayus y minus
                        System.out.println("caracteres del map:");
                        Map<Character, Integer> unicodeAlphabet = getUnicode();
                        for (Map.Entry<Character, Integer> entry : unicodeAlphabet.entrySet()) {
                            System.out.println(entry.getKey() + ": " + entry.getValue());
                        }
                    }
                    case 0 -> salir = true;
                    default -> {
                        System.out.println("Solo números mostrados en pantalla.");
                        sc.next(); // Limpiar buffer scanner
                        limpiarConsola();
                        txtMenu();
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR HUMANO");
                System.out.println("Debes insertar un número");
                System.out.println("Introduzca cualquier tecla para continuar...");
                sc.next(); // Limpiar buffer scanner
                sc.next();
                limpiarConsola();
                txtMenu();
            }
        } while (!salir);
    }

//--------------------------TEST-------------------------------------------------\\
    public static void imprimirArregloChar(char[] mensaje){
        for(int i =0;i< mensaje.length;i++){
            System.out.println("["+i+"] --> "+mensaje[i]);
        }
    }


// ·||||      EJECUCION PROGRAMA!     · \\
    public static void main(String[] args) {
        menu();
    }

}