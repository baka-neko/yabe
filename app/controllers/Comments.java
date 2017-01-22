package controllers;

import play.mvc.With;

/**
 * Created with IntelliJ IDEA.
 * User: Spek
 * Date: 22.01.17
 * Time: 23:02
 * To change this template use File | Settings | File Templates.
 */

@Check("admin")
@With(Secure.class)
public class Comments extends CRUD {
}
