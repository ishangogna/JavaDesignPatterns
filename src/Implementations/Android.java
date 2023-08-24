package Implementations;

import Interfaces.Phone;

public class Android implements Phone {
    @Override
    public void display() {
        System.out.println("Hey, this is Android!");
    }
}
