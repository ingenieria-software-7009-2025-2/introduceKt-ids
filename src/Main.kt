fun main() {
    println("Hello World!")

    /*var password : String? = null

     val c = "Luis"

     when(c){
         "Luis" -> println("Luis")
         "Juan"-> println("Juan")
         else-> println("ERRRRROOOOOOR")
     }*/


    val auto = Auto()

//    println("Color: ${auto.color} \nYear: ${auto.year}")
//    println("Auto: $auto")


    /*  for(i in 1..5){
          println("Value: $i")
      }*/

    val list = mutableListOf(1, 3, 5, 6, 7, 34)

    list.forEach { item ->
        println("item list: $item")

    }

}