import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest
{
    private int year;
    private int month;
    private int day;

    public DateNextDateExceptionTest(int year, int month, int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    @Parameterized.Parameters
    public static Collection input( ){
        List<Integer[]> dateList = new LinkedList<>( );
        dateList.add(new Integer[] {1500, 2, 31});
        dateList.add(new Integer[] {1500, 2, 29});
        dateList.add(new Integer[] {-1, 10, 20});
        return dateList;
    }

    @Test
    public void TestExcepetionParameterized() {
        assertThrows(IllegalArgumentException.class, () -> {
            Date date = new Date(year, month, day);
            date.setYear(year);
            date.setDay(day);
        });
    }
}