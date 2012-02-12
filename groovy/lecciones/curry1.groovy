
/**
 * Created by IntelliJ IDEA.
 * User: agc
 * Date: 15/10/11
 * Time: 18:47
 * To change this template use File | Settings | File Templates.
 */

def joinTwoWordsWithSymbol = { symbol, first, second -> first + symbol + second }

assert joinTwoWordsWithSymbol('#', 'Hello', 'World') == 'Hello#World'

def concatWords = joinTwoWordsWithSymbol.curry(' ')
assert concatWords('Hello', 'World') == 'Hello World'

def prependHello = concatWords.curry('Hello')
// def prependHello = joinTwoWordsWithSymbol.curry(' ', 'Hello')
assert prependHello('World') == 'Hello World'
