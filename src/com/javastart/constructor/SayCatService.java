package com.javastart.constructor;

public class SayCatService {

    public static String hello = "Hello from static";

    public static  void sayMeow(){
        System.out.println("Say Meow");
    }

    public void say(Cat cat, String message){
        String catName = cat.getName();

        System.out.println(concatNameAndMessage(catName, message));
    }
    private String concatNameAndMessage(String name,String message) {
        return name + ": " + message;
    }

}
