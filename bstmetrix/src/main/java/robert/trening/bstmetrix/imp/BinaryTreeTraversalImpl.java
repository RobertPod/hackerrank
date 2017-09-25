package robert.trening.bstmetrix.imp;

import robert.trening.bstmetrix.api.BinaryTreeTraversal;
import robert.trening.bstmetrix.model.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTraversalImpl implements BinaryTreeTraversal {
    @Override
    public int[] preorderTraversal(BinaryTree binaryTree) {
        if (binaryTree == null)
            return new int[0];

        List<Integer> traverse = new ArrayList<Integer>();

        traverse.add(binaryTree.getValue());
        BinaryTree locRoot = binaryTree;
        while (locRoot.getLeft() != )

        int[] traversePreOrder = new int[traverse.size()];
        int i = 0;
        for (Integer value : traverse) traversePreOrder[i++] = value;
        return traversePreOrder;
    }

    @Override
    public int[] inorderTraversal(BinaryTree binaryTree) {
        return new int[0];
    }

    @Override
    public int[] postorderTraversal(BinaryTree binaryTree) {
        return new int[0];
    }
}
