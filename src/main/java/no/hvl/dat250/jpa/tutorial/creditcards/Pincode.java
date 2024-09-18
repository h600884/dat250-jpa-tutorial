package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String pincode;
    private Integer count;

    @OneToMany(mappedBy = "pincode")
    private List<CreditCard> creditCard;

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
