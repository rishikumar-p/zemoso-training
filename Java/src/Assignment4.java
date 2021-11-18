import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.util.Calendar;

public class Assignment4 {
    public static void printKycDateRange(Date signUpDate, Date currentDate){
        if(currentDate.compareTo(signUpDate)>0) {
            Date kycStartDate, kycEndDate;
            signUpDate.setYear(currentDate.getYear());
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(signUpDate);
            calendar.add(Calendar.DATE,-30);
            kycStartDate = calendar.getTime();
            calendar.add(Calendar.DATE, +60);
            kycEndDate = calendar.getTime();
            if(kycEndDate.compareTo(currentDate)>0)
                kycEndDate = currentDate;
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
            System.out.println(outputFormat.format(kycStartDate)+"  "+outputFormat.format(kycEndDate));
        }
        else {
            System.out.println("No range");
        }
    }

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        while(inputCount-->0) {
            String input1 = scanner.next();
            String input2 = scanner.next();
            Date signUpDate = new SimpleDateFormat("dd-MM-yyyy").parse(input1);
            Date currentDate = new SimpleDateFormat("dd-MM-yyyy").parse(input2);
            printKycDateRange(signUpDate, currentDate);
        }
    }
}