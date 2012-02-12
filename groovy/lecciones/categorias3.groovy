
/**
 * Created by IntelliJ IDEA.
 * User: agc
 * Date: 15/10/11
 * Time: 21:17
 * To change this template use File | Settings | File Templates.
 */


use (Multiplicity.class) {
  range = 1..50
  range.each {number ->
    if (number.isMultipleOf(5) && number.isMultipleOf(7)) {
      println "fizzbuzz"
    } else if (number.isMultipleOf(5)) {
      println "fizz"
    } else if (number.isMultipleOf(7)) {
      print "buzz"
    } else {
      println "${number}"
    }
    print " "
  }
}

class Multiplicity {
  static boolean isMultipleOf(Integer dividend, Integer divisor) {
    dividend % divisor == 0
  }
}
