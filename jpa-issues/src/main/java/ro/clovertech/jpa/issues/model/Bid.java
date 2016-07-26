package ro.clovertech.jpa.issues.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Catalin Mihalache
 */
@NamedQueries({
        @NamedQuery(
                name = "Bid.findHighest",
                query = "SELECT MAX(b.amount) FROM Bid b WHERE b.item.id = :itemId"),
        @NamedQuery(
                name = "Bid.getByItemAndUser",
                query = "SELECT b FROM Bid b WHERE b.item.id = :itemId "
                        + "AND b.user.accountName = :accountName"),
        @NamedQuery(
                name = "Bid.getBidCount",
                query = "SELECT COUNT(b) FROM Bid b WHERE b.item.id = :itemId") })
@IdClass(BidPK.class)
@Entity
@Table(name = "bids")
public class Bid implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 8890004826621747337L;

    @Id
    @ManyToOne
    private Item item;

    @Id
    @ManyToOne
    private User user;

    private BigDecimal amount;

    @Temporal(TemporalType.DATE)
    @Column(name = "creation_date")
    private Date creationDate;

    public Bid() {
    }

    /**
     * Sets up the creation date.
     */
    @PrePersist
    public void beforePersist() {
        creationDate = new Date();
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getCreationDate() {
        return new Date(creationDate.getTime());
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = new Date(creationDate.getTime());
    }
}
