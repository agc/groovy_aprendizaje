
/**
 class Foo {
 static Bar rofl(Keks k) {   a todo Keks le añadimos un metodo rofl que devuelve un Bar
  k.doIncredibleThings()
 }
}

Keks keks = createKeks()

use (Foo) {
 keks.rofl()
}
 */

final class Distance {
    def number
    String toString() { "${number}m" }
}


class NumberCategory {
    static Distance getMeters(Number self) {
        new Distance(number: self)
    }
}

/* a un numero Number se le añade un metodo getMeters que devuelve una Distance */
/* se emplea la convención java bean */

use(NumberCategory) {
    def dist = 300.meters    /*300.getMeters*/


    assert dist instanceof Distance
    assert dist.toString() == "300m"
}
