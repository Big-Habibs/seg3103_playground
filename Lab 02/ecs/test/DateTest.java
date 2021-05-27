import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDateTC1() {
    Date date = new Date(1700, 06, 20);
    Date expected = date.nextDate();
    Date actual = new Date(1700, 06, 21);
    assertEquals(expected, actual);
  }

  @Test
  void nextDateTC2(){
    Date date = new Date(2005, 04, 15);
    Date expected = date.nextDate();
    Date actual = new Date(2005, 04, 16);
    assertEquals(expected, actual);
  }

  @Test
  void nextDateTC3(){
    Date date = new Date(1991, 07, 20);
    Date expected = date.nextDate();
    Date actual = new Date(1991, 07, 21);
    assertEquals(expected, actual);
  }

  @Test
  void nextDateTC4(){
    Date date = new Date(3456, 03, 27);
    Date expected = date.nextDate();
    Date actual = new Date(3456, 03, 28);
    assertEquals(expected, actual);
  }

  @Test
  void nextDateTC5(){
    Date date = new Date(1500, 02, 17);
    Date expected = date.nextDate();
    Date actual = new Date(1500, 02, 18);
    assertEquals(expected, actual);
  }

  @Test
  void nextDateTC6(){
    Date date = new Date(1700, 06, 29);
    Date expected = date.nextDate();
    Date actual = new Date(1700, 06, 30);
    assertEquals(expected, actual);
  }

  @Test
  void nextDateTC7(){
    Date date = new Date(1800, 11, 29);
    Date expected = date.nextDate();
    Date actual = new Date(1800, 11, 30);
    assertEquals(expected, actual);
  }

  @Test
  void nextDateTC8(){
    Date date = new Date(3453, 01, 29);
    Date expected = date.nextDate();
    Date actual = new Date(3453, 01, 30);
    assertEquals(expected, actual);
  }

  @Test
  void nextDateTC9(){
    Date date = new Date(444, 02, 29);
    Date expected = date.nextDate();
    Date actual = new Date(444, 03, 1);
    assertEquals(expected, actual);
  }

  @Test
  void nextDateTC10(){
    Date date = new Date(2005, 04, 30);
    Date expected = date.nextDate();
    Date actual = new Date(2005, 05, 1);
    assertEquals(expected, actual);
  }

  @Test
  void nextDateTC11(){
    Date date = new Date(3453, 01, 30);
    Date expected = date.nextDate();
    Date actual = new Date(3453, 01, 31);
    assertEquals(expected, actual);
  }

  @Test
  void nextDateTC12(){
    Date date = new Date(3456, 03, 30);
    Date expected = date.nextDate();
    Date actual = new Date(3456, 03, 31);
    assertEquals(expected, actual);
  }

  @Test
  void nextDateTC13(){
    Date date = new Date(1901, 07, 31);
    Date expected = date.nextDate();
    Date actual = new Date(1901, 8, 1);
    assertEquals(expected, actual);
  }

  @Test
  void nextDateTC14(){
    Date date = new Date(3453, 01, 31);
    Date expected = date.nextDate();
    Date actual = new Date(3453, 02, 1);
    assertEquals(expected, actual);
  }

  @Test
  void nextDateTC15(){
    Date date = new Date(3456, 12, 31);
    Date expected = date.nextDate();
    Date actual = new Date(3457, 01, 1);
    assertEquals(expected, actual);
  }

  @Test
  void nextDateTC16(){
    assertThrows(IllegalArgumentException.class, () -> {
      Date date = new Date(1500, 02, 31);
      date.setDay(31);
    });
  }

  @Test
  void nextDateTC17(){
    assertThrows(IllegalArgumentException.class, () -> {
      Date date = new Date(1500, 02, 29);
      date.setDay(29);
    });
  }

  @Test
  void nextDateTC18(){
    assertThrows(IllegalArgumentException.class, () -> {
      Date date = new Date(-1, 10, 20);
      date.setYear(-1);
    });
  }
}