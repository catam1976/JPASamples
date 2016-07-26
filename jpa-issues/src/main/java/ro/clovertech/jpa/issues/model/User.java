package ro.clovertech.jpa.issues.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Catalin Mihalache
 */
@NamedQueries({
        @NamedQuery(name = "User.findByEmail", query = "SELECT e FROM User e WHERE e.email = :email"),
        @NamedQuery(name = "User.findByAccount",
                query = "SELECT e FROM User e WHERE e.accountName = :accountName"),
        @NamedQuery(name = "User.getByUUID",
                query = "SELECT e FROM User e WHERE e.activationCode = :activationCode"),
        @NamedQuery(name = "User.activateAccount",
                query = "UPDATE User e SET e.activated = true"
                        + " WHERE e.activationCode = :activationCode and e.activated = false"),
        @NamedQuery(name = "User.removeByUUID",
                query = "DELETE FROM User e WHERE e.activationCode = :activationCode and e.activated = false") })
@Entity
@EntityListeners(UserListener.class)
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = -6134776758947464648L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(unique = true)
    private String email;

    @Column(name = "account_name", unique = true)
    private String accountName;

    private String password;

    @Column(name = "activation_code")
    private String activationCode;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean activated;

    @Column(name = "is_admin", nullable = false, columnDefinition = "TINYINT(1)")
    private boolean isAdmin;

    @Temporal(TemporalType.DATE)
    @Column(name = "creation_date")
    private Date creationDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public Date getCreationDate() {
        return new Date(creationDate.getTime());
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = new Date(creationDate.getTime());
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

}
