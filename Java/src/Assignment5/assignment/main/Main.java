package Assignment5.assignment.main;

import Assignment5.assignment.data.TempClass1;
import Assignment5.assignment.singleton.TempClass2;

public class Main {
    public static void main(String[] args){
        TempClass1 tempClass1 = new TempClass1();
        tempClass1.printVariables();
//        tempClass1.printLocalVaribles(); Doesnt work as it uses uninitialized variables

        TempClass2 tempClass2 = TempClass2.initializeMember("Hello World");
        tempClass2.printMember();
    }
}
