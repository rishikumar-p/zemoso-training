/*
* Question: Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.
*
*/

import java.io.*;
import java.util.*;

public class Assignment3 {

    public float getMedianOfList(List<Float> list ){
        float median;
        Collections.sort(list);
        int size = list.size();
        if(size % 2 == 0)
             median = (list.get((size-1)/2) + list.get(size/2))/2;
        else
             median = list.get(size/2);
        return median;
    }

    public List<Float> getPingTimes(String ipAddress, int count) {
        List<Float> pingTimes = new ArrayList<>();
        String command = "ping -c "+ count +" "+ ipAddress;
        try {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String string = "";
            while ((string = inputStream.readLine()) != null) {
                System.out.println(string);
                int index = string.indexOf("time=");
                if(index != -1)
                    pingTimes.add(Float.parseFloat(string.substring(index+5,string.indexOf("ms"))));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pingTimes;
    }

    public static void main(String[] args) {
        Assignment3 assignment3 = new Assignment3();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the IP Address: ");
        String ipAddress = scanner.next();
        System.out.print("Enter the number of times to ping: ");
        int count = scanner.nextInt();
        List<Float> pingTimes = assignment3.getPingTimes(ipAddress, count);
        double medianPingTime = assignment3.getMedianOfList(pingTimes);
        System.out.println("Ping times: " + pingTimes);
        System.out.println("Median if the pings: " + medianPingTime);
    }
}