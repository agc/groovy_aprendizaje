
/**
 * Created by IntelliJ IDEA.
 * User: agc
 * Date: 15/10/11
 * Time: 21:11
 * To change this template use File | Settings | File Templates.
 */


public class TextTools {

    public static CharSequence removeHTML(CharSequence s) {
        StringBuilder b = new StringBuilder(s.length());
        char c;
        for (int i = 0; i < s.length(); ++i) {
            if ((c = s.charAt(i)) != '<') {
                b.append(c);
            }
            else {
                while (i < s.length() && s.charAt(i) != '>') {
                    ++i;
                }
            }
        }
        return b;
    }

}

use (TextTools) {
 println '<foo>keks</foo> bar <rofl blorb="bla"/>'.removeHTML()
}