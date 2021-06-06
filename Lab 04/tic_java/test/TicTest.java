import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TicTest {

    @Test
    void emptyBoardTest1(){ //Test 1
        Tic actual = new Tic();
        String[][] expected = {{" "}, {" "}};
        assertTrue(Arrays.deepEquals(expected, actual.theBoard(2, 1)));
    }

    @Test
    void emptyBoardTest2(){ //Test 2
        Tic actual = new Tic();
        String[][] expected = {{" "," "}, {" ", " "}};
        assertTrue(Arrays.deepEquals(expected, actual.theBoard(2, 2)));
    }

    @Test
    void emptyBoardTest3(){ //Test 3
        Tic actual = new Tic();
        String[][] expected = {{" ", " ", " "}, {" ", " ", " "}};
        assertTrue(Arrays.deepEquals(expected, actual.theBoard(2, 3)));
    }

}
