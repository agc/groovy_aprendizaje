
/**
 * Created by IntelliJ IDEA.
 * User: agc
 * Date: 15/10/11
 * Time: 19:32
 * To change this template use File | Settings | File Templates.
 */


def method() {
    if (true) 1 else 0
}


assert method() == 1

def method(bool) {
    try {
        if (bool) throw new Exception("foo")
        1
    } catch(e) {
        2
    } finally {
        3
    }
}


assert method(false) == 1
assert method(true) == 2