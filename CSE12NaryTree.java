/**
 * TODO: Add file header
 * Name: Joshua Yang
 * ID: A16667394
 * Email: jwyang@ucsd.edu
 * File description: 
 */

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * TODO: Add class header
 */
public class CSE12NaryTree<E extends Comparable<E>> {
    
    /**
     * This inner class encapsulates the data and children for a Node.
     * Do NOT edit this inner class.
     */
    protected class Node{
        E data;
        List<Node> children;
    
        /**
         * Initializes the node with the data passed in
         * 
         * @param data The data to initialize the node with
         */
        public Node(E data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
    
        /**
         * Getter for data
         * 
         * @return Return a reference to data
         */
        public E getData() {
            return data;
        }

        /**
         * Setter for the data
         * 
         * @param data Data that this node is set to
         */
        public void setData(E data) {
            this.data = data;
        }

        /**
         * Getter for children
         * 
         * @return reference to the list of children
         */
        public List<Node> getChildren() {
            return children;
        }

        /**
         * Returns the number of children
         * 
         * @return number of children
         */
        public int getNumChildren() {
            // assume there are no nulls in list
            return children.size();
        }

        /**
         * Add the given node to this node's list of children
         * 
         * @param node The node to add
         */
        public void addChild(Node node) {
            children.add(node);
        }
    
    }
    
    Node root;
    int size;
    int N;

    /**
     * Constructor that initializes an empty N-ary tree, with the given N
     * 
     * @param N The N the N-tree should be initialized with
     */
    public CSE12NaryTree(int N) {
        if (N <= 0) {
            throw new IllegalArgumentException();
        }
        this.root = null;
        this.size = 0;
        this.N = N;
    }

    /**
     * This method adds a node to the n-ary tree in level order and updates size
     * Use a queue for the level order traversal.
     * @param element element of the node to be added  
     */
    public void add(E element) {
        // create the queue
        if (element == null) {
            throw new NullPointerException();
        }
        Queue<Node> Q = new LinkedList<>();
        Q.offer(this.root);
        while (!Q.isEmpty()) {
            // int QSize = Q.size();
            List<E> level = new ArrayList<>();
            for (int i = 0; i < Q.size(); i++) {
                Node curr = Q.poll();
                level.add(curr.getData());

                for (int j = 0; j < curr.getNumChildren(); j++) {
                    Node child = curr.getChildren().get(j);
                    Q.add(child);
                }
            }
        }
        for (int i = 0; i < Q.size(); i++) {
            Node curr = Q.poll();
            if (curr.getNumChildren() < this.N) {
                curr.addChild(new Node(element));
                return;
            }
        }
        

    }

    /**
     * TODO: Add method header
     */
    public boolean contains(E element) {
        //TODO
        if (element == null) {
            throw new NullPointerException();
        }
        return false;
    }

    /**
     * TODO: Add method header
     */
    public ArrayList<E> sortTree(){
        //TODO
        return null;
    }
}
