
/**
 * Created by IntelliJ IDEA.
 * User: agc
 * Date: 15/10/11
 * Time: 19:22
 * To change this template use File | Settings | File Templates.
 */

def (m, n) = [1, 2]

assert m == 1
assert n == 2


def geocode(String location) {
    // implementation returns [48.824068, 2.531733] for Paris, France

    return [48.824068, 2.531733]
}

def (lat, longitud) = geocode("Paris, France")

assert lat == 48.824068
assert longitud == 2.531733

def firstname, lastname


(firstname, lastname) = "Guillaume Laforge".tokenize()


assert firstname == "Guillaume"
assert lastname == "Laforge"


def elements = [1, 2, 3, 4]
def (a, b, c) = elements


assert a == 1
assert b == 2
assert c == 3

// given those two variables
def r = 1, s = 2


// swap variables with a list
(r, s) = [s,r]


assert r == 2
assert s == 1
