package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    private Set<Address> addresses = new HashSet<>();

    @ManyToMany
    private Set<CreditCard> creditCards = new HashSet<>();

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public Set<CreditCard> getCreditCards() {
        return creditCards;
    }
}
