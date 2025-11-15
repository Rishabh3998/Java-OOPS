package com.introduction;

import java.util.Arrays;

// Create a class
// Objects or instances will store in heap memory
class Student {
    // properties / instance variables (Will store in Stack memory)
    String name; // By-default null is the value
    float marks; // By-default 0.0 is value
    int rollNumber; // By-default 0 is value

    // Default Constructor
    Student() {
        // return-type of a constructor is the class itself, because it is the
        // custom data-type that we need

        // The keyword 'this' is what points to our reference variable which will store the
        // data, the reference of the instantiated object.

        // Student rishabh = new Student();
        // this -> rishabh (reference variable)

        // When we call an empty constructor, it will under the hood call the default one
        // that you have in class, it can be parameterized or un-parameterized.

        // We can call the other constructors from this default constructor
        // this(13, "Rishabh", 89.7F);
    };

    // Constructor overloading
    Student (Student other) {
        this.name = other.name;
        this.rollNumber = other.rollNumber;
        this.marks = other.marks;
    }

    // Parametrised Constructor
    Student(int rollNumber, String name, float marks) {
        this.name = name;
        this.marks = marks;
        this.rollNumber = rollNumber;
    }

    // Method: Setter
    void setStudentData (String name, float marks, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method: Getter
    void getStudentData () {
        System.out.println(rollNumber + " " + name + " " + marks);
    }

    void greeting () {
        System.out.println("Hello " + this.name);
    }

    // Garbage Collection: (Automatic process)
    // Whenever an object is destroyed and collected as garbage we can do some operations
    // after that which can be used like a notification. For this we have to use finalize().
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is freed and collected as garbage");
    }
}

public class Main {
    public static void main (String[] args) {
        // Problem: Store 5 roll numbers
        int[] rollNumbers = new int[5];

        // Problem: Store 5 names
        String[] names = new String[5];

        // Problem: Store student data {rollNumber, name, marks}
        int[] studentRollNumbers = new int[5];
        String[] studentNames = new String[5];
        float[] studentMarks = new float[5];

        // In the above code where we are storing student data we are creating 3 types of Data
        // structures to store the data. This is not a good practice instead we have to create a
        // Single data structure which can store accumulated data of every student collectively.

        // To do this kind of stuff we need classes and OOPS concepts
        // Class is a named group of properties and functions or methods.
        // It is a blueprint according to which
        // we can store data of an object or instance of the defined class.
        // So we can create our own data type by using classes

        // Class => Logic construct
        // Object => Physical reality

        // By-default the instance present in the array will point to null
        Student[] students = new Student[5];

        System.out.println(Arrays.toString(students));
        // Output: [null, null, null, null, null]

        // Declaration (present in stack memory)
        Student rishabh;

        // Instantiation (returns a reference which stored after allocation done in heap)
        rishabh = new Student();

        System.out.println(rishabh); // Output: com.introduction.Student@8efb846

        // Initialization of properties without using setter
        rishabh.rollNumber = 1;
        rishabh.name = "Rishabh";
        rishabh.marks = 80.5F;

        // new operator is used to create an object or instance in heap memory (Dynamic allocation)
        Student vansh = new Student(); // Object / Instance of Student class

        // vansh is the reference variable pointing to the object present in heap.
        Student ritik = new Student();

        // Initialization of properties using setter
        vansh.setStudentData("Vansh", 99, 3);
        ritik.setStudentData("Ritik", 69, 2);

        // Fetching the properties using getter
        vansh.getStudentData();
        ritik.getStudentData();
        rishabh.getStudentData();

        // Introduction to constructor
        // Student(); => constructor
        // A constructor basically defines what happens when an object gets created

        Student peter = new Student(10, "Peter", 99);
        peter.getStudentData();
        peter.greeting();

        Student random = new Student(peter);
        random.getStudentData();

        Student one = new Student();
        Student two = one;

        one.name = "Something";

        System.out.println(two.name);

        final int VALUE = 10;
        // VALUE = 20; // final is like const we cannot modify the variable which is of final type

        // This immutability of final keyword is only true for primitive data types. (int, float, char, etc.)
        // For non-primitive or reference types (Object, Arrays, List, etc.), we cannot reassign the reference,
        // but the object itself is still mutable:

        // So the correct statement is:
        // final does NOT make objects immutable.
        // final only prevents reassignment of the reference.
        // You can still modify the internal state of the object (unless the class is immutable).

        // Summary: The final keyword prevents reassignment of a variable. For primitive types, this means
        // you cannot assign a new value. For reference types, you cannot assign a new object to the reference,
        // but you can still modify the object's internal state (unless the object itself is immutable).
    }
}
