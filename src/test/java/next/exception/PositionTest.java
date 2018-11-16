package next.exception;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PositionTest {
    @Test
    public void create_00() throws InValidPositionException {
        Position p = new Position("a1");
        assertThat(p.getX()).isEqualTo(0);
        assertThat(p.getY()).isEqualTo(0);
    }
    
    @Test
    public void create_77() throws InValidPositionException {
        Position p = new Position("h8");
        assertThat(p.getX()).isEqualTo(7);
        assertThat(p.getY()).isEqualTo(7);
    }

    @Test (expected = InValidPositionException.class)
    public void 길이가_2가_아닌_경우() throws InValidPositionException {
        new Position("a");
    }
    
    @Test (expected = InValidPositionException.class)
    public void notValid_0보다_작은_X() throws InValidPositionException {
        new Position("Z1");
    }
    
    @Test (expected = InValidPositionException.class)
    public void notValid_7보다_큰_X() throws InValidPositionException {
        new Position("i1");
    }
    
    @Test (expected = InValidPositionException.class)
    public void notValid_0보다_작은_Y() throws InValidPositionException {
        new Position("a0");
    }
    
    @Test (expected = InValidPositionException.class)
    public void notValid_7보다_큰_Y() throws InValidPositionException {
        new Position("a9");
    }

}
