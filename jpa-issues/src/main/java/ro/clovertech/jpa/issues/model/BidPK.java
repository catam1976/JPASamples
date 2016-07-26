package ro.clovertech.jpa.issues.model;

import java.io.Serializable;

/**
 * @author Catalin Mihalache
 *
 */
public class BidPK implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -659164608015730427L;

    private Long item;

    private Long user;

    public BidPK() {
    }

    public Long getItem() {
        return item;
    }

    public void setItem(Long item) {
        this.item = item;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        if (item != null) {
            result = prime * result + item.hashCode();
        }
        if (user != null) {
            result = prime * result + user.hashCode();
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        BidPK other = (BidPK) obj;
        if (item == null) {
            if (other.item != null) {
                return false;
            }
        } else if (!item.equals(other.item)) {
            return false;
        }
        if (user == null) {
            if (other.user != null) {
                return false;
            }
        } else if (!user.equals(other.user)) {
            return false;
        }
        return true;
    }

}
