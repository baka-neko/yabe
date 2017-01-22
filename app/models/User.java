package models;

/**
 * Created with IntelliJ IDEA.
 * User: Spek
 * Date: 22.01.17
 * Time: 3:17
 * To change this template use File | Settings | File Templates.
 */
import java.util.*;
import javax.persistence.*;

import play.data.validation.Email;
import play.data.validation.Required;
import play.db.jpa.*;

@Entity
@Table(name="blog_user")
public class User extends Model {

    @Email
    @Required
    public String email;

    @Required
    public String password;

    public String fullname;
    public boolean isAdmin;
    public User(String email, String password, String fullname) {
        this.email = email;
        this.password = password;
        this.fullname = fullname;
    }

    public static User connect(String email, String password) {
        return find("byEmailAndPassword", email, password).first();
    }

    public String toString() {
        return email;
    }

}
