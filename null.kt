fun main() {
    var nombre : String? = null;
    println("Imprimiendo el valor nulo de nombre: ")
    println(nombre);
    // nombre = "Dante";
    // println(nombre!!.length);

    // var longitud = nombre?.length ?: 0;
    // println("Longitud de nombre: ");
    // println(longitud);

    try {
        println("nombre: $nombre");
    } catch (exception : NullPointerException){
        println("Ha ocurrido un error");
        println(exception);
    } finally {
        println("Lo que esta en finally, se ejecuta siempre");
    }


    println("----------- try -----------")
    try {
        var longitud = nombre?.length;
        println("Longitud: $longitud")
    } catch (error : NullPointerException){
        // Hubo un error, no se pudo obtener la longitud del nombre
        var longitud = 0;
        println("Longitud: $longitud")
    } finally {
        println("Finally!")
    }
    println("Termina prueba de try");
}