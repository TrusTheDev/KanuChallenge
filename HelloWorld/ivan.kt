/*
 * El hola mundo más raro del  mundo, 
 * tenes que hacer un hola mundo de la manera más inconvencional de la historia
 * vale todo, siempre y cuando al final la consola muestre hola mundo, ejemplo abajo
 * 
 * */
fun main() {
    val asciiNumbers = arrayOf(104,111,108,97,32,109,117,110,100,111)
    var holaMundo = ""
    
    for(x in asciiNumbers){
        holaMundo = holaMundo + x.toChar()
    }
    println(holaMundo)
}