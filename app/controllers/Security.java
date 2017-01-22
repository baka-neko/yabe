package controllers;

import models.User;

/**
 * Created with IntelliJ IDEA.
 * User: Spek
 * Date: 23.01.17
 * Time: 0:09
 * To change this template use File | Settings | File Templates.
 */
public class Security extends Secure.Security {

    static boolean authenticate(String username, String password) {
        return User.connect(username, password) != null;
    }

    static void onDisconnected() {
        Application.index();
    }

    static void onAuthenticated() {
        Admin.index();
    }

    static boolean check(String profile) {
        if("admin".equals(profile)) {
            return User.find("byEmail", connected()).<User>first().isAdmin;
        }
        return false;
    }

}
