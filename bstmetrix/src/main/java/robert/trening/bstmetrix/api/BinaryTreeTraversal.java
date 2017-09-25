package robert.trening.bstmetrix.api;

import robert.trening.bstmetrix.model.BinaryTree;

public interface BinaryTreeTraversal {
    public int[] preorderTraversal(BinaryTree binaryTree);

    public int[] inorderTraversal(BinaryTree binaryTree);

    public int[] postorderTraversal(BinaryTree binaryTree);

}
