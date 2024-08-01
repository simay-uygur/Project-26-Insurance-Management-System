 # Project-26-Insurance-Management-System
This is an insurance system assignment given in Java Patika course. 

The task is:
```

Imagine you are developing a software system for an insurance company. The insurance company has two types of customer profiles: "Individual" and "Enterprise." Design an abstract class named `Account` for the customer profiles. The `Account` class will hold all the account information after the customer logs into the system. The `Account` class should have a `User` type reference (as an aggregation relationship).

The `User` class represents the customer's personal information and includes:

- first name (String)
- last name (String)
- email (String)
- password (String)
- occupation (String)
- age (int)
- address list (ArrayList<Address>)
- last login date (Date)

Additionally, the `User` class should have an ArrayList of addresses. The address information consists of two types: Home address (`HomeAddress`) and Business address (`BusinessAddress`). Both of these address classes should inherit from an interface named `Address`. You need to decide which methods should be included in this interface.

Design a class named `AddressManager` that handles adding and removing addresses for a `User` object. This class should include two static methods to add and remove elements from the address list of the `User` object. You can name these methods as you see fit.

In the `Account` class, define a `final` method named `showUserInfo` that does not return a value and prints out the customer information.

In the `Account` class, maintain a list of the insurances the customer has. Design an abstract class named `Insurance` to represent insurance, with the following attributes:

- insurance name (String)
- insurance fee (double)
- insurance start-end date (Date)

The abstract class should also include an abstract method `calculate`. This method will be implemented in subclasses.

Create four subclasses of `Insurance`:

- `HealthInsurance` (private health insurance)
- `ResidenceInsurance` (home insurance)
- `TravelInsurance` (travel insurance)
- `CarInsurance` (automobile insurance)

Each subclass should override the `calculate` method to compute the insurance fee accordingly.

Given the above definitions, the abstract `Account` class should include the following:

- user login status (AuthenticationStatus)
- user object (User)
- list of insurances (ArrayList)

Define an enum named `AuthenticationStatus` with two constants: SUCCESS and FAIL. SUCCESS is used when the login process is successful, and FAIL is used when the login is unsuccessful.

Implement a method in the `Account` class for user login, which accepts an email and password and compares them with the email and password in the `User` class. If the provided information is correct, the login process will be successful, and the user's login status will be set to SUCCESS. If the login fails, an `InvalidAuthenticationException` should be thrown. This exception class should extend the `Exception` class.

In the `Account` class, provide a non-abstract method to add and remove addresses for the user. Also, provide a method to return the user's login status.

Define an abstract method in the `Account` class for adding insurance policies. This method will be overridden in the `Individual` and `Enterprise` subclasses, as the profit margins applied to the packages added by individual and corporate customers will differ.

The `Individual` and `Enterprise` classes should extend the `Account` class.

Design a class named `AccountManager` that maintains a TreeSet of accounts. This class should store the individual and corporate accounts in the set. It should include a `login` method that takes an email and password, searches through the list of accounts, and returns the appropriate `Account` object if a matching login is found. This method should call the `login` method on the `Account` object and handle any `InvalidAuthenticationException` that may be thrown.

Since `Account` objects will be stored in a TreeSet, ensure that the `Account` class implements the `Comparable` interface. Also, do not forget to implement the `hashCode` and `equals` methods in the `Account` class.

Create a class that reads email and password from the keyboard. Use this information to call the `login` method in the `AccountManager` class. If a valid user logs in, the method should return an `Account` object.

```