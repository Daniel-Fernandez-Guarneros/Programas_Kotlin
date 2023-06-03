fun main(){
    
    // Reto:
    // Crear un diccionario español - ingles usando un mapa
    // 1. Funcion para crear o cargar el diccionario
    // 2. Funcion para consulta, reciba una palabra en español y regrese su traduccion, si no existe, un valor por default
    // 3. Imprimir todo el diccionario

    var separador = "======================================================================";
    println(separador);
    println("Tarea de creacion de un diccionario Español - Ingles usando un mapa");
    println(separador);

    // 1. Funcion para crear o cargar el diccionario
    val diccionario = crearDiccionario();
    println("Se ha creado exitosamente el diccionario");
    println(separador);

    do {
        println("Teclea 1 si deseas buscar una palabra para saber su significado de español a ingles");
        println("Teclea 2 si deseas imprimir todo el diccionario");
        println("Teclea 3 si desea terminar el programa");
        var terminar = true;

        try{
            var choice = readLine()!!.toInt();
            println(separador);
            when(choice){
                1 -> {
                    // 2. Funcion para consulta, reciba una palabra en español y regrese su traduccion, si no existe, un valor por default
                    println("Ingresa la palabra en español para saber su significado en ingles: ")
                    var palabra = readLine()!!.toLowerCase();
                    println("----------------------------------------------------------------------");
                    consultarDiccionario(palabra, diccionario);
                    println(separador);
                }
                2 -> {
                    // 3. Imprimir todo el diccionario
                    println("Todas las traducciones del diccionario son las siguientes: ");
                    println("----------------------------------------------------------------------");
                    imprimirDiccionario(diccionario);
                    println(separador);
                }
                3 -> {
                    terminar = false;
                    println("Programa terminado correctamente!!");
                    println(separador);
                }
            }
        } catch (exception: NumberFormatException) {
            println(separador);
            println("Ha ocurrido un error, debes ingresar un numero entero");
            println(separador);
        }
    } while (terminar);
}

// 1. Funcion para crear o cargar el diccionario
fun crearDiccionario(): Map<String, String> {
    var palabras = mutableMapOf(
        "caja" to "box",
        "manzana" to "apple",
        "libro" to "book",
        "celular" to "cellphone",
        "teclado" to "keyboard",
        "computadora" to "computer",
        "carro" to "car",
        "videojuego" to "videogame",
        "consola" to "console",
        "tortuga" to "turtle",
        "tiburon" to "shark",
        "lagrima" to "tear",
        "odio" to "hate",
        "vida" to "life",
        "amor" to "love",
        "dormir" to "sleep",
        "caballero" to "knight",
        "noche" to "night",
        "luna" to "moon",
        "oscuro" to "dark",
        "sangre" to "blood"
    );
    return palabras;
}

// 2. Funcion para consulta, reciba una palabra en español y regrese su traduccion, si no existe, un valor por default
fun consultarDiccionario(palabra: String, diccionario: Map<String, String>){
    println("Traduccion de la palabra ${palabra}: ${diccionario.getOrDefault(palabra, "La palabra no existe en el diccionario")}");
}

// 3. Imprimir todo el diccionario
fun imprimirDiccionario(diccionario: Map<String, String>){
    diccionario.forEach{ (k, v) -> println("$k -> $v") };
}