# Task 9 Refactoring

In this assignment, you will refactor a piece of code in order to reduce its size and make it more generalizable.

In completing this assignment, you will:

    Reinforce what you have learned about identifying code smells
    Demonstrate that you are able to apply the appropriate refactoring patterns to fix code smells
    Get experience understanding and modifying existing code

Debugging/Error Note:

If you run into errors/bugs/don't understand the output that Codio is giving you, please post in the Discussion Forum and a TA will assist you!  Please do NOT email Codio as they will not review any errors you are getting.

## Getting Started

Download the files that you will need for this assignment.

NewspaperArticle.java contains the definition of a NewspaperArticle class that represents an article you would find in a newspaper, including various fields and methods.

Client.java is a class that invokes the various methods in NewspaperArticle for testing purposes.

## Activity Part 1: Applying Extract Class

The NewspaperArticle implementation is an example of what we described in the lesson as a “Large Class”: it has 10 fields, which is perhaps too much, especially since some go together and can be moved to another class.

In particular, the city, state, and postCode fields should be combined into a separate class, which would then make NewspaperArticle a little smaller and allow for reusability of the related fields.

Use the Extract Class refactoring pattern to create a new class called PublishingLocation and implement that class so that it contains the city, state, and postCode fields and any other necessary methods. Then modify NewspaperArticle accordingly by removing fields and methods as needed, and then setting up the appropriate relationship between NewspaperArticle and this newly created PublishingLocation class.

Your refactoring must not necessitate any changes to the Client class in order for it to still compile. That is, you may not change the Client class as a result of this refactoring: you should only be creating a new PublishingLocation class and modifying NewspaperArticle as needed.

## Activity Part 2: Fixing a Large Class

After completing Part 1, the NewspaperArticle class is a bit smaller but still has many fields and methods that may be common to other types of documents, e.g. journal articles or books. By moving those fields and methods to another class, we can have a more generalizable class that can be used for representing other types of documents.

Refactor NewspaperArticle and apply either the Extract Class or Extract Superclass pattern (you need to decide which!) to create a new class called Document that contains the fields and methods that would be common to all types of documents. In particular, move the title, author, date, and publishing location fields and related methods to the new Document class, but leave the rest in NewspaperArticle.

Then modify NewspaperArticle accordingly by removing fields and methods as needed, and then set up the appropriate relationship between NewspaperArticle and this newly created Document class.

While performing this refactoring, you also need to decide whether Document should be a concrete class, an abstract class, or an interface.

As in Part 1, your refactoring must not necessitate any changes to the Client class in order for it to still compile. That is, you may not change the Client class as a result of this refactoring: you should only be creating a new Document class and modifying NewspaperArticle as needed.

## Helpful Hints

For both parts, if you’re not sure how to do the refactoring without changing Client, review the “Abstraction” and “Law of Demeter” lessons from the end of week 3.

In Part 2, think about the difference between the Extract Class and Extract Superclass patterns, especially as they relate to the “has-a” and “is-a” relationships between classes.