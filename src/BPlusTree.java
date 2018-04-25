/*
Complete your details...
Name and Surname: 
Student/staff Number:
 */

 /*You must complete this class to create a fully functional B+-Tree containing
Integer objects which incorporates a key sharing strategy.  Additional instructions are
provided in comments throughout the class*/
public class BPlusTree {

    /*
	1. You may not change the signatures of any of the given methods.  You may 
	however add any additional methods and/or field which you may require to aid 
	you in the completion of this assignment.
	
	2. You will have to design and implement a your own node class.  The BPlusNode 
	should house Integer or int objects. You are given a partial BPlusNode class.
	
	3. You will notice that there are some overloaded methods, some of which work 
	for Integer objects and some with primitive type int.  Your tree should handle
	both types.
     */

    public BPlusTree(int m) {
        /*
		The constructor.  You must create a BPlusTree object of order m,
		where m is passed as a parameter to the constructor.
		You may assume that m will always be valid.
         */
    }

    public BPlusTree(BPlusTree other) {
        /*
		The copy constructor.
         */
    }

    public BPlusTree clone() {
        /*
		This method should return a copy of your tree.  If the cloning
		operation is unsuccessful for whatever reason, return null.
         */

        return null;
    }

    public String insertElement(int element) {
        /*
		The int element passed as a parameter should be inserted in
		your B+-Tree.  The method should return a string representation
		of the path followed through the tree to find a node
		to insert into.  If the tree was empty, return the string 
		representation of the new root.
         */

        return "";
    }

    public String insertElement(Integer element) {
        /*
		The int element passed as a parameter should be inserted in
		your B+-Tree.  The method should return a string representation
		of the path followed through the tree to find a node
		to insert into.  If the tree was empty, return the string 
		representation of the new root.
         */

        return "";
    }

    public String deleteElement(int element) {
        /*
		The int element passed as a parameter should be deleted from
		your B+-Tree.  The method should return a string representation
		of the path followed through the tree to find the node to delete
		from. If the tree was empty, return the string representation
		of the NULL node.
         */

        return "";
    }

    public String deleteElement(Integer element) {
        /*
		The int element passed as a parameter should be deleted from
		your B+-Tree.  The method should return a string representation
		of the path followed through the tree to find the node to delete
		from. If the tree was empty, return the string representation
		of the NULL node.
         */

        return "";
    }

    public String search(int element) {
        /*
		A String should be returned representing the search path
		for the element sent in as a parameter.  Refer to the
		specification for more details.
         */
        return "";
    }

    public String search(Integer element) {
        /*
		A String should be returned representing the search path
		for the element sent in as a parameter.  Refer to the
		specification for more details.
         */
        return "";
    }

    public int height() {
        /*
		This method should return the height of the tree.
         */
        return 0;
    }

    public int countInternalNodes() {
        /*
		This method should count and return the number of internal nodes.
         */
        return 0;
    }

    public int countLeafNodes() {
        /*
		This method should count and return the number of leaf nodes.
         */
        return 0;
    }

    public int fullness() {
        /*
		This method should return as a percentage the fullness of the tree.
		The percentage is out of 100 and if, for example, 70 is returned,
		it means that the tree is 70% full. A tree containing no keys is 0% 
		full.  Round your answer up to the nearest integer.
         */

        return 0;
    }

    public String breadthFirst() {
        /*
		This method returns a String containing the nodes in breath-first
		order.  You should not include null nodes in the string.  The string
		for an empty tree is simply an empty string.
         */
        return "";
    }

    public BPlusNode getFirstLeaf() {
        /*
		This method should return the left-most leaf node in the tree.
		If the tree is empty, return null.
         */

        return null;
    }

}
