fun main () {
    val age = 15;
    val votar = if(age.compareTo(18) > 0){
        true;
    } else {
        false;
    }
    println("Puede votar: $votar")
}