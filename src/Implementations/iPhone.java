package Implementations;

import Interfaces.Phone;

public class iPhone implements Phone {
    @Override
    public void display() {
        System.out.println("Hey, this is an iPhone");
    }
}
