
/**
 * Created by IntelliJ IDEA.
 * User: agc
 * Date: 13/10/11
 * Time: 18:21
 * To change this template use File | Settings | File Templates.
 */


def fac(n) { n == 0 ? 1 : n * fac(n - 1) }
def fac2 = { n -> n == 0 ? 1 : n * call(n - 1) }
def fac3 = this.&fac


assert 24 == fac(4)
assert 24 == fac2(4)
assert 24 == fac3(4)

/* ordenacion quick-sort */

def sort(list) {
    if (list.isEmpty()) return list
    anItem = list[0]
    def smallerItems = list.findAll{it < anItem}
    def equalItems = list.findAll{it == anItem}
    def largerItems = list.findAll{it > anItem}
    sort(smallerItems) + equalItems + sort(largerItems)
}

assert [1, 3, 4, 5] == sort([1, 4, 5, 3])
assert [1, 1, 3, 4, 4, 5, 8] == sort([4, 1, 4, 1, 8, 5, 3])
assert ['a', 'b', 'c'] == sort(['c', 'b', 'a'])