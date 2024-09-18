package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pincode;
    private Integer count;

    @OneToMany
    private Set<CreditCard> creditCard;

    public Pincode() {
    }

    public Pincode(String pincode, Integer count) {
        this.pincode = pincode;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return pincode;
    }

    public Integer getCount() {
        return count;
    }
}
