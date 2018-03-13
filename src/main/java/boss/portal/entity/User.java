package boss.portal.entity;

import javax.persistence.*;

/**
 * @author zhaoxinguo on 2017/9/13.
 */
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String password;

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
