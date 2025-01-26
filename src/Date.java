import java.time.LocalDate;

public class Date {
    int year;
    int month;
    int day;
    LocalDate date;
    Date(){
         date = LocalDate.now();
    }
    Date(int fullYear, int monthWithoutZero,int dayWithoutZero){
        year = fullYear;
        month = monthWithoutZero;
        day = dayWithoutZero;
        date = LocalDate.of(year, month, day);
    }
    public void findDayBefore(){
        System.out.println(date.minusDays(1));
    }
}
