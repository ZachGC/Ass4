/*
Complete your details...
Name and Surname: 
Student/staff Number:
 */

 /*
You must design and implement this class to be used as a node in your B+ tree. You may
choose to implement this class to double up for both internal and leaf nodes or you
could create a separate class to represent the internal nodes.  In choosing the latter
strategy of having separate leaf and internal node classes, it would be a good idea
to create a super class for your two node types.

You may add any additional members that you need but you may not remove or modify
the members already contained in the class.
 */
public class BPlusNode {

    public String toString() {
        /*
		This method should return a string representation of the node.
         */

        return "";
    }

    /*
	This is the "next" node in the leaf level.  
	The right-most leaf node's next is set to null.
     */
    protected BPlusNode next;
}
