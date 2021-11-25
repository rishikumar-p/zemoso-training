import java.util.*;

public class Assignment6 {
    static ArrayList<String> list = new ArrayList<>();

    public Assignment6() {
        this("John");
    }
    public Assignment6(String s) {
        System.out.println(s);
    }

    static void permute(String str, int l, int r) {
        if (l == r)
            list.add(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    static String swap(String string, int source, int destination) {
        char[] charArray = string.toCharArray();
        char temp = charArray[source];
        charArray[source] = charArray[destination];
        charArray[destination] = temp;
        return String.valueOf(charArray);
    }

    public void printVampireNumbers(){
        int n=1200,count=0;
        while(count<100) {
            String num=String.valueOf(n);
            if(num.length()%2!=0) {
                n++;
                continue;
            }
            permute(num,0,num.length()-1);
            for(int i=0;i<list.size();i++) {
                String first=list.get(i).substring(0,num.length()/2);
                String second=list.get(i).substring(num.length()/2,num.length());
                if(first.charAt(first.length()-1)=='0'&&second.charAt(second.length()-1)=='0')
                    continue;
                else {
                    if(Integer.parseInt(first) * Integer.parseInt(second) == n) {
                        System.out.println(num);
                        count++;
                        break;
                    }
                }
            }
            n++;
            list.clear();
        }
    }


    public static void main(String[] args) {
        Assignment6 assignment6 = new Assignment6();
        Assignment6 objectArray[] = new Assignment6[2];

        assignment6.printVampireNumbers();

        objectArray[0] = new Assignment6("Hello");
        objectArray[1] = new Assignment6("World");

    }
}