# Task 10
n this assignment, you are asked to modify code that relates to a simple social networking concept: suggesting friends to a student based on who is taking the same classes.

The code works correctly but is susceptible to the types of issues discussed in the lesson on reliability, in particular unexpected inputs and mistakes made by the programmer who is using this code and the programmer whose code we are using. Your objective is to use defensive programming to make sure that the code does not throw any exceptions but still works correctly.

In completing this assignment, you will:

    Apply defensive programming techniques to improve the reliability of code
    Get more experience understanding and modifying existing code

Debugging/Error Note:

If you run into errors/bugs/don't understand the output that Codio is giving you, please post in the Discussion Forum and a TA will assist you!  Please do NOT email Codio as they will not review any errors you are getting.

## Getting Started

Download the files that you will need for this assignment. In particular:

    Student.java represents a student. For simplicity, the only field in this class is the student’s name.
    ClassesDataSource.java is an interface that defines a method called getClasses which returns a List containing the names of the classes being taken by the specified student.
    StudentsDataSource.java is an interface that defines a method called getStudents which returns a List containing the Students who are taking the specified class
    FriendFinder.java defines a method called findClassmates that works as described below. It relies on ClassesDataSource and StudentsDataSource.

The method takes a String representing the name of a student and then returns a Set containing the names of everyone else who is taking the same classes as that student. For instance, if the argument to the method represents me, and:

    I am taking CIS573 and CIS550
    Alice is taking CIS573, CIS550, and CIS555
    Bob is taking CIS573 and CIS555
    Chen is taking CIS550 and CIS573
    Dhriti is taking CIS550

then the method should return a Set containing Alice and Chen, since both of them are taking the same classes I am; however, it should not contain Bob or Dhriti since Bob is not taking CIS550 and Dan is not taking CIS573.

## Activity

We will assume for our purposes that the FriendFinder.findClassmates method works correctly for good/valid inputs.

However, this code does not make any attempt to handle values that are null, including the input to the method, the objects on which it depends, and the objects that are returned from the methods it invokes. In any of these cases, the current code will throw a NullPointerException. Which is bad.

Using defensive programming, modify FriendFinder.findClassmates so that it does not throw any NullPointerExceptions in the situations listed above. Specifically:

    Use IllegalArgumentException and IllegalStateException appropriately as discussed in the lesson
    Return null if the input Student is not taking any classes or if there are no students taking the same classes as that student
    Ignore any other null values encountered during the operation of the method

You may not change the Student, StudentsDataSource, or ClassesDataSource code at all, nor should you change the FriendFinder constructor or the signature of FriendFinder.findClassmates. Likewise, you should not change that method’s behavior for good/valid inputs, but rather should only be looking for and handling null objects.

Keep in mind that it is not sufficient to simply put a try/catch block around the entire method and catch any NullPointerException that arises, since in some cases the method must throw a different exception, in some cases it must return null, and in others it must simply ignore the null value and return the correct output.

## Helpful Hints

Keep in mind that any object can be null, though if you use the “new” keyword you will not get a null object returned. But for all other objects in the code, check that they are not null before using them.

For testing your code, you may want to create your own implementations of the StudentsDataSource and ClassesDataSource interfaces and then have them return different values for the different things you are trying to protect against.