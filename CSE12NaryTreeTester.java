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
    CSE12NaryTree<Integer> fiveNaryTree;
    /**
     * Test add method on 5-ary tree with the rot and its 5 children
     */
    @Test
    public void testAdd(){
        fiveNaryTree = new CSE12NaryTree<>(5);
        fiveNaryTree.root.setData(1);
        List<Integer> childList = Arrays.asList(2,3,4,5,6);
        // CSE12NaryTree<Integer>.Node child1 = new CSE12NaryTree.Node(2);
        // CSE12NaryTree<Integer>.Node child2 = new CSE12NaryTree.Node(3);
        // CSE12NaryTree<Integer>.Node child3 = new CSE12NaryTree.Node(4);
        // CSE12NaryTree<Integer>.Node child4 = new CSE12NaryTree.Node(5);
        // CSE12NaryTree<Integer>.Node child5 = new CSE12NaryTree.Node(6);
        // fiveNaryTree.root.children.set(0, CSE12NaryTree<Integer>.Node((Integer) 2));
        // fiveNaryTree.root.addChild(CSE12NaryTree.Node(2));
        // fiveNaryTree.root.addChild(new CSE12NaryTree.Node(3));
        // fiveNaryTree.root.addChild(new CSE12NaryTree.Node(4));
        // fiveNaryTree.root.addChild(new CSE12NaryTree.Node(5));
        // fiveNaryTree.root.addChild(new CSE12NaryTree.Node(6));
        System.out.println(fiveNaryTree.root.data);
        assertEquals((Integer)1, fiveNaryTree.root.getData());


    }

    /**
     * Tests contains method on 5-ary tree with root and all children when \
     * element is not there
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
