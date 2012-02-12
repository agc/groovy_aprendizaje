
/**
 * Created by IntelliJ IDEA.
 * User: agc
 * Date: 15/10/11
 * Time: 18:53
 * To change this template use File | Settings | File Templates.
 */

int sum(int... someInts) {
    def total = 0
    for (int i = 0; i < someInts.size(); i++)
        total += someInts[i]
    return total
}

int producto(int[] variosEnteros) {
    def total = 1
    for (int i = 0; i < variosEnteros.size(); i++)
        total *= variosEnteros[i]
    return total
}

assert sum(1)       == 1
assert sum(1, 2)    == 3
assert sum(1, 2, 3) == 6
assert producto(1,2,3,4)==24

