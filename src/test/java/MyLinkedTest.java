import org.example.Linked;
import org.example.MyLinked;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedTest {
    @Test
    public void addLastTest(){
        Linked<Integer> list = new MyLinked<>();
        list.addLast(5);
        Assertions.assertEquals(5, list.getElementByIndex(0));
    }
    @Test
    public void addNegativeLastTest(){
        Linked<Integer> list = new MyLinked<>();
        list.addLast(5);
        Assertions.assertNotEquals(null, list.getElementByIndex(0));
    }
    @Test
    public void addFirstTest(){
        Linked<Integer> list = new MyLinked<>();
        list.addFirst(5);
        Assertions.assertEquals(5, list.getElementByIndex(0));
    }
    @Test
    public void addNegativeFirstTest(){
        Linked<Integer> list = new MyLinked<>();
        list.addLast(5);
        Assertions.assertNotEquals(null, list.getElementByIndex(0));
    }
    @Test
    public void sizeTest(){
        Linked<Integer> list = new MyLinked<>();
        list.addFirst(5);
        Assertions.assertEquals(1, list.size());
    }@Test
    public void addNegativeSizeTest(){
        Linked<Integer> list = new MyLinked<>();
        list.addLast(5);
        Assertions.assertNotEquals(0, list.size());
    }

}
