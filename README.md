# Image_Repository_Shopify_2021

This is a very simple Java application about a painting shop (image repository), that can achieve sell/buy items functionality.

The app demonstrates my understanding of Object Orientated Programming, where the app contains in total four class as below:

1. Owner Class has fields of name and amount of money owned. The class has two methods, one is add new painting to the inventory
by purchasing inventories at inventory prices. The other method is to set discount on the paintings by changing their prices.

2. Buyer Class also has fields of name and amount of money owned. It has one method which is to purchase paintings from the shop.
Once purchased, the buyer's amount of money will decrease and that painting will be removed from the shop.

3. Painting Class represents each painting object, with fields of name, painter, price and isDamaged. Using the set price method,
the owner is able to change the price of the painting.

4. Painting Shop Class represents the painting shop. There is a static field that represents the collections of paintings in the shop.
Add and remove operations are used when users purchase or the owner imports. The static field is used because it is a class method that
goes with the painting shop.

To run the program, simply click run and start the app from the main class. Since the app follows OOD principle, all the operations will
be done by declaration, instantiations, initialization, and method calls.
