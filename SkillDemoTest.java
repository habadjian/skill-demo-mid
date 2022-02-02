import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    //tests go here 
    @Test
    public void addAllTester (){
        int[] arr = {1,2,3,4};//should be 10
        assertEquals(20, SkillDemo.addAll(arr));//this is a failed test
    }
}
