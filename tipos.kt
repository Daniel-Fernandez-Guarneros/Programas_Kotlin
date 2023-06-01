// Usnado funciones que regresan valores
// Y funciones que no regresan valores

fun main() {

    val numero1 = 15;
    val numero2 = 40;
    
    borde("=", 20);
    var resultado = suma(numero1, numero2);
    println(resultado);
    borde("*", 35);

    // Ejemplo de una funcion anonima
    val slogan = { r : Int -> println("Tu puedes con $r problemas y mas") };

    // Invocacion de una funcion anonima - Forma 1
    slogan(resultado);

    val resta = { n1 : Int , n2 : Int -> n1 -n2 };
    println("Resta: ${resta(numero1,numero2)}");

    println("============================================");
    println("Tarea");
    println();
    
    // Funcion anonima que encuentre el mayor de tres numeros
    val num1 = 69;
    val num2 = 259;
    val num3 = 7;
    val max = { n1 : Int, n2 : Int, n3 : Int -> maxOf(num1, num2, num3) };

    println("El numero mayor entre los 3 es: ${max(num1, num2, num3)}");
    println();

    // Funcion anonima que calcule el promedio de tres numeros
    val prome1 : Double = 8.0;
    val prome2 : Double = 9.0;
    val prome3 : Double = 9.0;
    val promedio = { n1 : Double, n2 : Double, n3 : Double -> (n1+n2+n3)/3 };
    println("El promedio es de: ${promedio(prome1, prome2, prome3)}");

    println("============================================");
}

fun borde(caracter : String, veces : Int) {
    for (i in 1..veces){
        print(caracter);
    }
    println();
}

fun suma(n1 : Int, n2 : Int) : Int{
    return n1 + n2
}