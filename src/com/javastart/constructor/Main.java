package com.javastart.constructor;

public class Main {
    public static void main (String[] args){
        Cat lori = new Cat("Lori");
        SayCatService sayCatService = new SayCatService();
        sayCatService.say(lori, "I want to kill))");

        Cat baxter = new Cat( "Baxter");
        sayCatService.say(baxter, "I want to sleep");

        Cat martin = new Cat ("MartinL");
        sayCatService.say(martin,"I want rights");
        SayCatService.sayMeow();
        System.out.println(SayCatService.hello);
    }
}
