
/**
 * Created by IntelliJ IDEA.
 * User: agc
 * Date: 15/10/11
 * Time: 20:46
 * To change this template use File | Settings | File Templates.
 */


import java.text.SimpleDateFormat


class Event {
    @Delegate Date when
    String title, url
}


def df = new SimpleDateFormat("yyyy/MM/dd")


def gr8conf = new Event(title: "GR8 Conference",
                          url: "http://www.gr8conf.org",
                         when: df.parse("2009/05/18"))
def javaOne = new Event(title: "JavaOne",
                          url: "http://java.sun.com/javaone/",
                         when: df.parse("2009/06/02"))

assert gr8conf.before(javaOne.when)