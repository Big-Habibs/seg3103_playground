import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TicTest {

    @Test
    void emptyBoardTest(){
        Tic obj = new Tic();
        assertEquals(" ", obj.emptyBoard());
    }
}
