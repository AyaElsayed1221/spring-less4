package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
    private Heart humanHeart;

    public Human(){ }

    //@Autowired
    public Human(Heart humanHeart){
        this.humanHeart = humanHeart;
        System.out.println("human constructor is invoked");
    }

//    @Autowired
//    @Qualifier("octopusHeart")
    public void setHumanHeart(Heart humanHeart){

        this.humanHeart = humanHeart;
        System.out.println("Setter method is invoked");
    }

    public void work(){
        if (humanHeart == null){
            System.out.println("U r dead !");
        }else {
            System.out.println("ur heart is work");
            System.out.println("U r alive :)");
        }
    }
}
