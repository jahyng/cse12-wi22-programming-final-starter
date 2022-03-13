/**
 * TODO: Add file header
 * Name:
 * ID:
 * Email:
 * File description: 
 */
 
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

/**
 * TODO: Add class header
 */
public class CSE12NaryTreeTester {
    /**
     * Test add method on 5-ary tree with the rot and its 5 children
     */
    @Test
    public void testAdd(){
        CSE12NaryTree<Integer> fiveNaryTree = new CSE12NaryTree<>(5);
        fiveNaryTree.root.setData((Integer)1);
        List<Integer> childList = Arrays.asList((Integer)2,(Integer)3,(Integer)4,(Integer)5,(Integer)6);
        CSE12NaryTree.Node<Integer> child1 = new Node((Integer)2){    
        };
        fiveNaryTree.root. = childList;
    }

    /**
     * TODO: Add test case description
     */
    @Test
    public void testContains(){
        
    }

    /**
     * TODO: Add test case description
     */
    @Test
    public void testSortTree(){
        
    }

    /**
     * TODO: Add test case description
     */
    @Test
    public void testCustom(){
        
    }
}
