
/**
 * Created by IntelliJ IDEA.
 * User: agc
 * Date: 15/10/11
 * Time: 18:59
 * To change this template use File | Settings | File Templates.
 */

enum Day {
     SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
     THURSDAY, FRIDAY, SATURDAY
}

def today = Day.SATURDAY
switch (today) {
     // Saturday or Sunday
     case [Day.SATURDAY, Day.SUNDAY]:
         println "Weekends are cool"
         break
     // a day between Monday and Friday
     case Day.MONDAY..Day.FRIDAY:
         println "Boring work day"
         break
     default:
         println "Are you sure this is a valid day?"
}

enum Planet {
     MERCURY (3.303e+23, 2.4397e6),
     VENUS   (4.869e+24, 6.0518e6),
     EARTH   (5.976e+24, 6.37814e6),
     MARS    (6.421e+23, 3.3972e6),
     JUPITER (1.9e+27,   7.1492e7),
     SATURN  (5.688e+26, 6.0268e7),
     URANUS  (8.686e+25, 2.5559e7),
     NEPTUNE (1.024e+26, 2.4746e7)

     double mass
     double radius

     Planet(double mass, double radius) {
         this.mass = mass;
         this.radius = radius;
     }

     void printMe() {
         println "${name()} has a mass of ${mass} " +
                 "and a radius of ${radius}"
     }
}
Planet.EARTH.printMe()
