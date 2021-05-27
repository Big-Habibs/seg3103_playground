import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class DateNextDateOkTest
{
    private int year;
    private int month;
    private int day;

    public DateNextDateOkTest(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Parameterized.Parameters
    public static Collection input( )
    {
        List<Integer[]> dateList = new LinkedList<>( );
        dateList.add( new Integer[] {1700, 6, 20} );
        dateList.add( new Integer[]{2005, 4, 15});
        dateList.add( new Integer[] {1901, 7, 20});
        dateList.add(new Integer[] {3456, 3, 27});
        dateList.add(new Integer[] {1500, 2, 17});
        dateList.add(new Integer[] {1700, 6, 29});
        dateList.add(new Integer[] {1800, 11, 29});
        dateList.add(new Integer[] {3453, 01, 29});
        dateList.add(new Integer[] {2005, 04, 30 });
        dateList.add(new Integer[] {2005, 04, 30});
        dateList.add(new Integer[] {3453, 01, 30});
        dateList.add(new Integer[] {3456, 03, 30});
        dateList.add(new Integer[]{1901, 07, 31});
        dateList.add(new Integer[] {3453, 01, 31});
        dateList.add(new Integer[] {3456, 12, 31});
        return dateList;
    }

    @Test
    public void testOkParameterized(){
        Date date = new Date(year, month, day);
        Date expected = date.nextDate();
        Date actual = new Date(year,month,day);
        assertEquals(expected,actual.nextDate());
    }


}