package org.program1.treningjavaclass;

public class Program1 {
    public static void main(String[] args) {
        System.out.println("WorkingTest");
        Box mybox = new Box();
        double vol;
        mybox.height = 10;
        mybox.depth = 20;
        mybox.width = 15;
        vol = mybox.depth * mybox.height * mybox.width;
        System.out.println( "Vol is " + vol );

    }
}
