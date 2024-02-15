import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.*;

public class DateDemo {
    public static void main(String[] args) {
        //old class decrypted
        Date d=new Date();
        // System.out.println(d); //Thu Feb 08 15:40:34 IST 2024
        // System.out.println(d.getTime());    //return time in milliseconds from 1jan 1970

        //New class

         LocalDate dt=LocalDate.now();
        //  System.out.println(dt); //2024-02-08

        LocalTime lt=LocalTime.now();
        // System.out.println(lt); //17:05:59.195687600

        LocalDateTime ltd=LocalDateTime.now();
        // System.out.println(ltd);    //2024-02-08T17:06:59.953818

        ZonedDateTime z=ZonedDateTime.now();
        // System.out.println(z);  //2024-02-08T17:04:26.583750+05:30[Asia/Calcutta]

        OffsetDateTime ot=OffsetDateTime.now();
        // System.out.println(ot); //2024-02-08T17:05:25.357451100+05:30

        MonthDay md=MonthDay.now();
        // System.out.println(md); //--02-08

        //Date time formmater

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z Z");

        System.out.println(df.format((z)));

        System.out.println(ltd.get(ChronoField.DAY_OF_YEAR));

    }
}
