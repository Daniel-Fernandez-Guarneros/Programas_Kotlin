fun main() {
    var nombre : String? = null;
    println("Imprimiendo el valor nulo de nombre: ")
    println(nombre);
    nombre = "Dante";
    // println(nombre!!.length);

    var longitud = nombre?.length ?: 0;
    println("Longitud de nombre: ");
    println(longitud);
}