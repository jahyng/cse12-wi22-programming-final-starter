/**
 * Name: Josh Yang
 * ID: A16667394
 * Email: jwyang@ucsd.edu
 * File description: This file contains the tester for CSE12NaryTree.java file.
 */
 
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
/**
 * This class contains tests for the implementation of add, contains, and 
 * sortTree methods for the CSE12NaryTree. 
 */
public class CSE12NaryTreeTester {

    /**
     * Test add method on 5-ary tree with the rot and its 5 children
     */
    @Test
    public void testAdd(){
        CSE12NaryTree<Integer> fiveNaryTree = new CSE12NaryTree<Integer>(5);
        // create the nodes
        CSE12NaryTree<Integer>.Node rootNode = fiveNaryTree. new Node(0);
        CSE12NaryTree<Integer>.Node child1 = fiveNaryTree. new Node(1);
        CSE12NaryTree<Integer>.Node child2 = fiveNaryTree. new Node(2);
        CSE12NaryTree<Integer>.Node child3 = fiveNaryTree. new Node(3);
        CSE12NaryTree<Integer>.Node child4 = fiveNaryTree. new Node(4);
        CSE12NaryTree<Integer>.Node child5 = fiveNaryTree. new Node(5);
        // put nodes into tree
        fiveNaryTree.root = rootNode;
        fiveNaryTree.root.addChild(child1);;
        fiveNaryTree.root.addChild(child2);
        fiveNaryTree.root.addChild(child3);
        fiveNaryTree.root.addChild(child4);
        fiveNaryTree.root.addChild(child5);
        fiveNaryTree.size = 6;
        // check that nodes have been added properly
        assertEquals((Integer)0, fiveNaryTree.root.getData());
        assertEquals((Integer)1, fiveNaryTree.root.getChildren().get(0).
            getData());
        assertEquals((Integer)2, fiveNaryTree.root.getChildren().get(1).
            getData());
        assertEquals((Integer)3, fiveNaryTree.root.getChildren().get(2).
            getData());
        assertEquals((Integer)4, fiveNaryTree.root.getChildren().get(3).
            getData());
        assertEquals((Integer)5, fiveNaryTree.root.getChildren().get(4).
            getData());
            
        fiveNaryTree.add(99);
        assertEquals(7, fiveNaryTree.size);
        assertEquals((Integer)99, child1.getChildren().get(0).getData());
        fiveNaryTree.add(100);
        assertEquals(8, fiveNaryTree.size);
        assertEquals((Integer)100, child1.getChildren().get(1).getData());
        fiveNaryTree.add(200);
        assertEquals(9, fiveNaryTree.size);
        assertEquals((Integer)200,child1.getChildren().get(2).getData());
    }

    /**
     * Tests contains method on 5-ary tree with root and all children when
     * element is not there
     */
    @Test
    public void testContains(){
        CSE12NaryTree<Integer> fiveNaryTree = new CSE12NaryTree<Integer>(5);
        // create the nodes
        CSE12NaryTree<Integer>.Node rootNode = fiveNaryTree. new Node(0);
        CSE12NaryTree<Integer>.Node child1 = fiveNaryTree. new Node(1);
        CSE12NaryTree<Integer>.Node child2 = fiveNaryTree. new Node(2);
        CSE12NaryTree<Integer>.Node child3 = fiveNaryTree. new Node(3);
        CSE12NaryTree<Integer>.Node child4 = fiveNaryTree. new Node(4);
        CSE12NaryTree<Integer>.Node child5 = fiveNaryTree. new Node(5);
        // put nodes into tree
        fiveNaryTree.root = rootNode;
        fiveNaryTree.root.addChild(child1);;
        fiveNaryTree.root.addChild(child2);
        fiveNaryTree.root.addChild(child3);
        fiveNaryTree.root.addChild(child4);
        fiveNaryTree.root.addChild(child5);
        fiveNaryTree.size = 6;
        // check that nodes have been added properly
        assertEquals((Integer)0, fiveNaryTree.root.getData());
        assertEquals((Integer)1, fiveNaryTree.root.getChildren().get(0).
            getData());
        assertEquals((Integer)2, fiveNaryTree.root.getChildren().get(1).
            getData());
        assertEquals((Integer)3, fiveNaryTree.root.getChildren().get(2).
            getData());
        assertEquals((Integer)4, fiveNaryTree.root.getChildren().get(3).
            getData());
        assertEquals((Integer)5, fiveNaryTree.root.getChildren().get(4).
            getData());

        // 80 is not in the tree
        assertFalse(fiveNaryTree.contains(80));
        

    }

    /**
     * Test sortTree method on 5-ary tree with only the root node
     */
    @Test
    public void testSortTree(){
        CSE12NaryTree<Integer> fiveNaryTree = new CSE12NaryTree<Integer>(5);
        CSE12NaryTree<Integer>.Node rootNode = fiveNaryTree. new Node(77);
        fiveNaryTree.root = rootNode;
        fiveNaryTree.size = 1;
        assertEquals((Integer)77, fiveNaryTree.sortTree().get(0));
    }

    /**
     * This custom test is different because the other trees had n of 5 and had 
     * only one level. This tree's N value is 3 and has levesl 0, 1, and 2. The 
     * other sort tester only had one node, so the sorting aspect of the method
     * was not tested. The values on this tree are also scrambled, so the 
     * sorting aspect of the method will also be tested. 
     */
    @Test
    public void testCustom(){
        CSE12NaryTree<Integer> threeNaryTree = new CSE12NaryTree<Integer>(3);
        // create the nodes
        CSE12NaryTree<Integer>.Node rootNode = threeNaryTree. new Node(6);
        CSE12NaryTree<Integer>.Node child1 = threeNaryTree. new Node(14);
        CSE12NaryTree<Integer>.Node child2 = threeNaryTree. new Node(4);
        CSE12NaryTree<Integer>.Node child3 = threeNaryTree. new Node(3);
        CSE12NaryTree<Integer>.Node child4 = threeNaryTree. new Node(90);
        CSE12NaryTree<Integer>.Node child5 = threeNaryTree. new Node(64);
        // put nodes into tree
        threeNaryTree.root = rootNode;
        threeNaryTree.root.addChild(child1);;
        threeNaryTree.root.addChild(child2);
        threeNaryTree.root.addChild(child3);
        threeNaryTree.root.addChild(child4);
        threeNaryTree.root.addChild(child5);
        threeNaryTree.size = 6;
        // check that nodes have been added properly
        ArrayList<Integer> output = threeNaryTree.sortTree();
        ArrayList<Integer> expectedOutput = new ArrayList<>(6);
        expectedOutput.add(3);
        expectedOutput.add(4);
        expectedOutput.add(6);
        expectedOutput.add(14);
        expectedOutput.add(64);
        expectedOutput.add(90);
        for (int i = 0; i < 6; i++) {
            assertEquals(expectedOutput.get(i), output.get(i));
        }
    }

    /**
     * Tests contains method when there are multiple levels and element we're 
     * looking for exists and doesn't exist
     */
    @Test
    public void testContainsCustom() {
        CSE12NaryTree<Integer> threeNaryTree = new CSE12NaryTree<Integer>(3);
        // create the nodes
        CSE12NaryTree<Integer>.Node rootNode = threeNaryTree. new Node(6);
        CSE12NaryTree<Integer>.Node child1 = threeNaryTree. new Node(14);
        CSE12NaryTree<Integer>.Node child2 = threeNaryTree. new Node(4);
        CSE12NaryTree<Integer>.Node child3 = threeNaryTree. new Node(3);
        CSE12NaryTree<Integer>.Node child4 = threeNaryTree. new Node(90);
        CSE12NaryTree<Integer>.Node child5 = threeNaryTree. new Node(64);
        // put nodes into tree
        threeNaryTree.root = rootNode;
        threeNaryTree.root.addChild(child1);;
        threeNaryTree.root.addChild(child2);
        threeNaryTree.root.addChild(child3);
        threeNaryTree.root.addChild(child4);
        threeNaryTree.root.addChild(child5);
        assertTrue(threeNaryTree.contains(90));
        assertFalse(threeNaryTree.contains(100));
        assertTrue(threeNaryTree.contains(64));
        assertTrue(threeNaryTree.contains(6));
        assertTrue(threeNaryTree.contains(14));
        assertTrue(threeNaryTree.contains(4));
        assertTrue(threeNaryTree.contains(3));
    }
}
