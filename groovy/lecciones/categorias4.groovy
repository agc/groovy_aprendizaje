
/**
 la clase que se extiend es Integer y se la añade un metodo multiplos
 this es la instancia a la que se le esta aplicando el metodo multiplos
 */


@Category(Integer)
class IntegerUtil {
    List<Integer> multiples(Integer upto) {
        (1..upto).collect {this * it}
    }
}


List<Integer> multiples
use(IntegerUtil) {
    multiples = 2.multiples(10)
}
println multiples  // Output -: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]