package Assignment5.assignment.singleton;

public class TempClass2 {
    String string;

    public static TempClass2 initializeMember(String string) {
        TempClass2 tempClass2 = new TempClass2();
        tempClass2.string = string;
        return tempClass2;
    }
    public void printMember() {
        System.out.println(this.string);
    }
}