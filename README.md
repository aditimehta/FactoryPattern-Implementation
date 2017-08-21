# FactoryPattern-Implementation

Factory Design Pattern:

* A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the instance of the class.
* The Factory Method Pattern is also known as Virtual Constructor.

* Advantage: 
   * Factory Method Pattern allows the sub-classes to choose the type of objects to create.
   * It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code. That means the code              interacts solely with the resultant interface or abstract class, so that it will work with any classes that implement that interface        or that extends that abstract class.
* Usage: 
  * When a class doesn't know what sub-classes will be required to create
  * When a class wants that its sub-classes specify the objects to be created.
  * When the parent classes choose the creation of objects to its sub-classes.
  
* Scenario: There is an interface called Shape. And there 3 classes implementing this interface. We just want to call method draw of interface shape irrespective of whatever shape is assigned to it and also we are dont know how to create those objects. We just want instance and call method draw.
