import java.util.*;

public class decryption {

    char[] auxMsg;    // ** PRUEBAS ** | (variable auxiliar para la Conversion mensaje)

//-------------------------RANDOM---MAPS-------PRINT---------->>
    public static int randomCode(){
        /** Max Value == 65537 **/
        Random num = new Random();
        int ran = num.nextInt(65537); // max valor
        return ran;
    }
    public static Map<Character,Integer> randomMapValues() {
        Map<Character, Integer> unicodeRandomMap = new HashMap<>();

        System.err.println("- Caracteres del alfabeto en minúsculas:" );
        for (char c = 'a'; c <= 'z'; c++) {
            unicodeRandomMap.put(c, (int) c);
//lo hacemos aleatoriamente
            unicodeRandomMap.replace(c,randomCode());
        }
        System.err.println("- Caracteres del alfabeto en mayúsculas:" );
        for (char c = 'A'; c <= 'Z'; c++) {
            unicodeRandomMap.put(c, (int) c);
//lo hacemos aleatoriamente
            unicodeRandomMap.replace(c,randomCode());
        }
        System.err.println("- Caracteres del alfabeto numeros:" );
        for (char c = '0'; c <= '9'; c++) {
            unicodeRandomMap.put(c, (int) c);
//lo hacemos aleatoriamente
            unicodeRandomMap.replace(c,randomCode());
        }
//------------------->> Cambiar caracteres especiales TODO
        System.out.println("- Caracteres especiales ñ y tildes:" );
        unicodeRandomMap.put('ñ', (int) 'ñ');
        unicodeRandomMap.put('Ñ', (int) 'Ñ');
        unicodeRandomMap.put('á', (int) 'á');
        unicodeRandomMap.put('é', (int) 'é');
        unicodeRandomMap.put('í', (int) 'í');
        unicodeRandomMap.put('ó', (int) 'ó');
        unicodeRandomMap.put('ú', (int) 'ú');
        unicodeRandomMap.put('Á', (int) 'Á');
        unicodeRandomMap.put('É', (int) 'É');
        unicodeRandomMap.put('Í', (int) 'Í');
        unicodeRandomMap.put('Ó', (int) 'Ó');
        unicodeRandomMap.put('Ú', (int) 'Ú');
        System.out.println("- Caracteres especiales:" );
        unicodeRandomMap.put('!', (int) '!');
        unicodeRandomMap.put('¡', (int) '¡');
        unicodeRandomMap.put('?', (int) '?');
        unicodeRandomMap.put('¿', (int) '¿');
        unicodeRandomMap.put('.', (int) '.');
        unicodeRandomMap.put(',', (int) ',');
        unicodeRandomMap.put(':', (int) ':');
        unicodeRandomMap.put(';', (int) ';');
        unicodeRandomMap.put('-', (int) '-');
        unicodeRandomMap.put('_', (int) '_');
        unicodeRandomMap.put('(', (int) '(');
        unicodeRandomMap.put(')', (int) ')');
        unicodeRandomMap.put('[', (int) '[');
        unicodeRandomMap.put(']', (int) ']');
        unicodeRandomMap.put('{', (int) '{');
        unicodeRandomMap.put('}', (int) '}');
        unicodeRandomMap.put('"', (int) '"');
        unicodeRandomMap.put('\'', (int) '\'');
        unicodeRandomMap.put('\\', (int) '\\');
        unicodeRandomMap.put('/', (int) '/');
        unicodeRandomMap.put('<', (int) '<');
        unicodeRandomMap.put('>', (int) '>');

        return unicodeRandomMap;
    }
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
    public static void printOriginal(){
        System.out.println("Caracteres del map [ORIGINAL]:");
        Map<Character, Integer> unicodeAlphabet = getUnicode();
        for (Map.Entry<Character, Integer> entry : unicodeAlphabet.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void printRandom(){
        System.err.println("Caracteres del map [RANDOM]:");
        Map<Character, Integer> unicodeAlphabet = randomMapValues();
        for (Map.Entry<Character, Integer> entry : unicodeAlphabet.entrySet()) {
            System.err.println(entry.getKey() + ": " + entry.getValue());
        }
    }

//------------------------------decryption--------------------------------------->>
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
 //><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><\\ TODO
    public static String cifrarConMapa(String msg){
        StringBuilder cifrado = new StringBuilder();


        return cifrado.toString();
    }
    public static String descifrarConMapa(String msg) {
        StringBuilder descifrado = new StringBuilder();


        return descifrado.toString();
    }
//><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><\\ TODO

//------------------------------MENU---------------------------------------------\\
    public static void limpiarConsola(){
    for(int i =0;i<50;i++){
        System.out.println(" ");
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
        System.out.println("| 8 | -  Borrar msg            |");
        System.out.println("| 9 | -  Ver mapas    [!]      |");
        System.out.println("| 0 | -  Salir                 |");
        System.out.println("*------------------------------*");
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int option;            // Option elegida por usuario
        boolean salir = false;
        int clave = 1234;      // clave para cifrar mensajes
        String msg = null;     // Mensaje introducido por usuario
        String xxx = null;     // Variable Aux para encriptar mensaje
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
                        if (!msg.isBlank() ) {
                            System.out.println("Su mensaje es: " + msg);
                        } else {
                            System.err.println("Utilice la opcion 1 para almacenar un mensaje.");
                        }
                    }
                    case 3 -> {
                        randomMapValues();
//                        String mensajeCifrado = cifrar(msg, clave);
//                        String mensajeDescifrado = descifrar(mensajeCifrado, clave);
//                        System.out.println("Mensaje original: " + msg);
//                        System.out.println("Mensaje cifrado: " + mensajeCifrado);
//                        System.out.println("Mensaje descifrado: " + mensajeDescifrado);
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
                    case 9 -> {//
                        //Imprimimos MAP's con letras nums ,mayus y minus
                        System.out.println("· Introduzca 1 para ver mapa original.");
                        System.out.println("· Introduzca cualquier tecla para ver nuevo mapa aleatorio.");
                        int auxOpt = sc.nextInt();
                        if(auxOpt==1){
                            printOriginal();
                        }else{
                            printRandom();
                        }

                    }
                    case 0 -> salir = true;
                    default -> {
                        System.err.println("Solo números mostrados en pantalla.");
                        System.err.println("Introduce numero de nuevo..");
                        sc.next(); // Limpiar buffer scanner
                        limpiarConsola();
                        txtMenu();
                    }
                }
            } catch (InputMismatchException e) {
                System.err.println("ERROR HUMANO");
                System.err.println("Debes insertar un número");
                System.err.println("Introduzca cualquier tecla para continuar...");
                sc.next(); // Limpiar buffer scanner
                sc.next();
                limpiarConsola();
            }
        } while (!salir);
    }
//--------------------------TEST-------------------------------------------------\\
    public static void imprimirArregloChar(char[] mensaje){
        for(int i =0;i< mensaje.length;i++){
            System.out.println("["+i+"] --> "+mensaje[i]);
        }
    }



// ·|||| ·        EJECUCION PROGRAMA!        · |||| · \\
    public static void main(String[] args) {
        menu();
    }

}