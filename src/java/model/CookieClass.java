package model;

import javax.servlet.http.Cookie;

/**
 *
 * @author Avishka Perera
 */
public class CookieClass {

    public static Cookie setCookie(String name, String value,int age) {
        Cookie obj = new Cookie(name, value);     
        obj.setMaxAge(age);
        return obj;
    }

}
