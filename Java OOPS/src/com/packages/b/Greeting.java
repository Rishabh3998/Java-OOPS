package com.packages.b;

import static com.packages.b.Message.message;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hey buddy");
        // Imported message function from Message class but this will only work for public entities
        message();
    }
}
