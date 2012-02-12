
import java.util.concurrent.locks.*


class LockableList {
    @Delegate private List list = []
    @Delegate private Lock lock = new ReentrantLock()
}


def lista = new LockableList()


lista.lock()
try {
    lista << 'Groovy'
    lista << 'Grails'
    lista << 'Griffon'
} finally {
    lista.unlock()
}


assert lista.size() == 3
assert lista instanceof Lock
assert lista instanceof List