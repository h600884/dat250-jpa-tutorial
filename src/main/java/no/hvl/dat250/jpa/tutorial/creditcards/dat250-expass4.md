## Lab report assignment 4

#### Technical problems and solutions:

While testing, I ran into a NullPointerException when trying to persist entities with relationships (such as Customer and CreditCard). The issue arose from not properly initializing collections that mapped relationships.
Resolution: I made sure to initialize collections such as Set<CreditCard> in the entity constructors. This ensured that when relationships were added, they were properly tracked by the persistence context.

There was a need to ensure proper bidirectional relationships between entities without relying on setter methods. This included managing CreditCard ownership by a Bank and setting a pincode to the card. Instead of creating setter methods, I could have adjusted the constructors to handle these relationships at the moment of instantiation.
Resolution: I decided to stick with using setter methods for setting a credit card to be owned by the bank I created and too add a pincode to the credit card.

Here you can see an example of how some of the databases looks. 
![Skjermbilde 2024-09-18 kl. 20.44.10.png](..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fs3%2Fl3y1b0nj3535s5vfsr0sbtn40000gp%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_WIW2ND%2FSkjermbilde%202024 -09-18%20kl.%2020.44.10.png)

As of now, there are no significant unresolved issues. The entities are correctly persisting in the database, and the test cases pass as expected.

Link to the repository with a passed test: https://github.com/h600884/dat250-jpa-tutorial