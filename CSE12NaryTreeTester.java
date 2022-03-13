/**
 * TODO: Add file header
 * Name: Josh Yang
 * ID: A16667394
 * Email: jwyang@ucsd.edu
 * File description: 
 */
 
import static org.junit.Assert.*;
import org.junit.*;

import java.lang.module.FindException;
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
     * 
     */
    @Test
    public void testCustom(){
        CSE12NaryTree<Integer> fiveNaryTree = new CSE12NaryTree<Integer>(5);
        // create the nodes
        CSE12NaryTree<Integer>.Node rootNode = fiveNaryTree. new Node(6);
        CSE12NaryTree<Integer>.Node child1 = fiveNaryTree. new Node(14);
        CSE12NaryTree<Integer>.Node child2 = fiveNaryTree. new Node(4);
        CSE12NaryTree<Integer>.Node child3 = fiveNaryTree. new Node(3);
        CSE12NaryTree<Integer>.Node child4 = fiveNaryTree. new Node(90);
        CSE12NaryTree<Integer>.Node child5 = fiveNaryTree. new Node(64);
        // put nodes into tree
        fiveNaryTree.root = rootNode;
        fiveNaryTree.root.addChild(child1);;
        fiveNaryTree.root.addChild(child2);
        fiveNaryTree.root.addChild(child3);
        fiveNaryTree.root.addChild(child4);
        fiveNaryTree.root.addChild(child5);
        fiveNaryTree.size = 6;
        assertEquals(6, fiveNaryTree.size);
        // check that nodes have been added properly
        ArrayList<Integer> l = fiveNaryTree.sortTree();
        for (int i = 0; i < 6; i++) {
            System.out.println(l.get(i));
        }
    }
}
