package no.hvl.dat250.jpa.tutorial.creditcards.driver;

import jakarta.persistence.*;
import no.hvl.dat250.jpa.tutorial.creditcards.*;

import java.util.Set;

public class CreditCardsMain {

  static final String PERSISTENCE_UNIT_NAME = "jpa-tutorial";

  public static void main(String[] args) {
    try (EntityManagerFactory factory = Persistence.createEntityManagerFactory(
        PERSISTENCE_UNIT_NAME); EntityManager em = factory.createEntityManager()) {
      em.getTransaction().begin();
      createObjects(em);
      em.getTransaction().commit();
    }

  }

  private static void createObjects(EntityManager em) {
    // TODO: Create object world as shown in the README.md.
    Customer customer = new Customer("Max Mustermann");

    Address address = new Address("Inndalsveien", 28);

    customer.getAddresses().add(address);

    Bank bank = new Bank("Pengebank");

    Pincode pincode = new Pincode("123", 1);

    CreditCard firstCard = new CreditCard(12345, -10000, -5000);
    firstCard.setOwningBank(bank);
    firstCard.setPincode(pincode);
    customer.getCreditCards().add(firstCard);

    CreditCard secondCard = new CreditCard(123, 2000, 1);
    secondCard.setOwningBank(bank);
    secondCard.setPincode(pincode);
    customer.getCreditCards().add(secondCard);

    em.persist(customer);
    em.persist(address);
    em.persist(bank);
    em.persist(pincode);
    em.persist(firstCard);
    em.persist(secondCard);
  }
}