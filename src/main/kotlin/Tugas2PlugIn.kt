fun main (){
    val angka : Array<Int> = arrayOf(6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    for (index in angka) {
        if (index % 2 == 0) {
            println("Angka " + index + " adalah genap")
        }
    }
    println("Jumlahnya adalah " + angka.sum())
}