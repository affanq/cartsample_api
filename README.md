# cartsample_api

This is a very simple Shopping cart project. The goal is to demonstrate a few design principles in a simple manner. 

It supports the following features:
- Cart
- Tax calculation
- Offers and discounts
- Shipping methods

The key principle followed in the project is to allow re-use and decoupling of code components. For example, to create a new Tax type, there is no need to modify existing code. The client can simply add the functionality by implementing the interface. Similarly, if we need to add additional offers or discounts, its just a matter of implementing the new functionality without having to change the code or re-run the test cases. 

TODO: 
- Code cleanup - Since this entire code was written in just a couple of hours, it is by no means perfect and bug free. For example, it may not contain all the checks for null or edge cases
- Test cases - Not implemented yet
- Client application - I was planning to create multiple clients around this code: a command line version, a traditional web UI version as well as a microservice based Docker implementation. Time permitting, the core allows for those implementations very easily
- A lot of wiring of objects can be improved using DI tools like Spring. 
- A lot of hard-coding of values and constructs 
- System.out.println statements all over the place. Need to be replaced with logging tools 
- Maven cleanup 
