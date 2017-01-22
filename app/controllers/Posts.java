package controllers;

/**
 * Created with IntelliJ IDEA.
 * User: Spek
 * Date: 22.01.17
 * Time: 22:47
 * To change this template use File | Settings | File Templates.
 */
import play.*;
import play.mvc.*;

@Check("admin")
@With(Secure.class)
public class Posts extends CRUD {
}
