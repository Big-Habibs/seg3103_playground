import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TicTest {

    @Test
    void emptyBoardTest1(){
        Tic actual = new Tic();
        String[][] expected = {{" "}, {" "}};
        assertTrue(Arrays.deepEquals(expected, actual.theBoard(2, 1)));
    }

    @Test
    void emptyBoardTest2(){
        Tic actual = new Tic();
        String[][] expected = {{"_"," _"}, {"_", "_"}};
        assertTrue(Arrays.deepEquals(expected, actual.theBoard(2, 2)));
    }

}
