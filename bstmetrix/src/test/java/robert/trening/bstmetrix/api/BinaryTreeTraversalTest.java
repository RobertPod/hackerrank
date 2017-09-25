package robert.trening.bstmetrix.api;

import org.junit.jupiter.api.Test;
import robert.trening.bstmetrix.imp.BinaryTreeTraversalImpl;
import robert.trening.bstmetrix.imp.BuildBstImpl;
import robert.trening.bstmetrix.model.BinaryTree;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTraversalTest {
    @Test
    void preorderTraversalNull() {
        BuildBst buildTree = new BuildBstImpl();
        BinaryTree root = buildTree.buildBst(null);

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversalImpl();

        assertEquals(0, binaryTreeTraversal.preorderTraversal(root).length);
    }

    @Test
    void preorderTraversalEmpty() {
        BuildBst buildTree = new BuildBstImpl();
        int[] values = new int[0];
        BinaryTree root = buildTree.buildBst(values);

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversalImpl();

        assertEquals(0, binaryTreeTraversal.preorderTraversal(root).length);
    }

    @Test
    void preorderTraversalOneNode() {
        BuildBst buildTree = new BuildBstImpl();
        int[] values = {22};
        BinaryTree root = buildTree.buildBst(values);

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversalImpl();

        assertEquals(1, binaryTreeTraversal.preorderTraversal(root).length);
    }

    @Test
    void preorderTraversal() {
        BuildBst buildTree = new BuildBstImpl();
        int[] values = {20, 15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
        BinaryTree root = buildTree.buildBst(values);

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversalImpl();

        assertEquals(12, binaryTreeTraversal.preorderTraversal(root).length);
    }

    @Test
    void inorderTraversal() {
    }

    @Test
    void postorderTraversal() {
    }

}