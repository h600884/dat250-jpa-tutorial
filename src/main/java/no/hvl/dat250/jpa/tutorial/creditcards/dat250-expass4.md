## Lab report assignment 4

#### Technical problems and solutions:

While testing, I ran into a NullPointerException when trying to persist entities with relationships (such as Customer and CreditCard). The issue arose from not properly initializing collections that mapped relationships.
Resolution: I made sure to initialize collections such as Set<CreditCard>. This ensured that when relationships were added, they were properly tracked by the persistence context.

There was a need to ensure proper bidirectional relationships between entities without relying on setter methods. This included managing CreditCard ownership by a Bank and setting a pincode to the card. Instead of creating setter methods, I could have adjusted the constructors to handle these relationships at the moment of instantiation.
Resolution: I decided to stick with using setter methods for setting a credit card to be owned by the bank I created and too add a pincode to the credit card.

Here you can see an example of how some of the databases looks. 
<img width="435" alt="Skjermbilde 2024-09-18 kl  20 56 52" src="https://github.com/user-attachments/assets/3edd4b7e-da0d-4bc9-9939-228a65a5088c">

As of now, there are no significant unresolved issues. The entities are correctly persisting in the database, and the test cases pass as expected.

Link to the repository with a passed test: https://github.com/h600884/dat250-jpa-tutorial
