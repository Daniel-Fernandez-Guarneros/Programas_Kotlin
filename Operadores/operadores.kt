fun main() {

    val a = 10; // Inmutable
    val b = 5; // Inmutable
    var c = 0; // Mutable (su valor va a cambiar)

    println("Operadores: ");
    println("==========================");

    // Suma
    // c = a + b;
    println("Operador = +");
    c = a.plus(b);
    println("$c = $a + $b");
    println("==========================");

    // c = a - b;
    println("Operador = -");
    c = a.minus(b);
    println("$c = $a - $b");
    println("==========================");

    // Comparaciones
    println("Operador mayor que ... = >");
    print("b > a: ");
    println(b.compareTo(a) > 0); // b > a
    print("a > b: ");
    println(a.compareTo(b) > 0); // a > b
    //println("$a > $b = " + (a > b));
    println("==========================");

    println("Operador menor que ... = <");
    print("b < a: ");
    println(b.compareTo(a) < 0); // b < a
    print("a < b: ");
    println(a.compareTo(b) < 0); // a < b
    println("==========================");

    // a == b
    println("Operador igual que ... : ==");
    print("a == b: ");
    println(a.equals(b));
    println("==========================");

    // a != b
    println("Operador menor que ... : !");
    print("a != b: ");
    println(!(a.equals(b)));
}