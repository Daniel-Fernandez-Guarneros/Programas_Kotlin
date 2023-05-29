fun main () {
    println("Valores de i: ");
    for(i in 1..10){
        println(i);
    }

    println();
    println("Letras: ");
    for(caracter in 'a'..'g' step 2){
        println(caracter);
    }
    println();
    println("Letras en reversa: ");
    for(caracter in 'g' downTo 'a'){
        println(caracter);
    }

    // Recorrido for coun un arreglo
    println();
    val mascotas = arrayOf("Lazzy", "Sparky", "Toby", "Niko", "Copo");

    println("Mascotas: ");
    for(i in mascotas.indices) {
        println("[$i - ${mascotas[i]}]");
    }

    println();
    println("Dividiendo un String en caracteres: ")
    for (letra in "=== Hola mundo Kotlin ===") {
        println(letra);
    }
}