
/**
 * Created by IntelliJ IDEA.
 * User: agc
 * Date: 13/10/11
 * Time: 18:10
 * To change this template use File | Settings | File Templates.
 */


def mastres = { a ->  a + 3 }
def porcinco = { a -> 5*a}
def escribir = { a -> println(a)}

// so now instead of calling notify(save(log(user)))
// you may call it like
def composicion = mastres >> porcinco >> escribir
def otracomposicion= escribir<<porcinco<<mastres

composicion(10)
otracomposicion(10)
