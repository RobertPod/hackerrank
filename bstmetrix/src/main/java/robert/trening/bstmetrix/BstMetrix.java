package robert.trening.bstmetrix;

import robert.trening.bstmetrix.api.BuildBst;
import robert.trening.bstmetrix.imp.BuildBstImpl;
import robert.trening.bstmetrix.model.BinaryTree;

public class BstMetrix {

    public static void main(String[] args) {
        int[] values = {20, 15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};

        BinaryTree bt;
        BuildBst buildBst = new BuildBstImpl();
        bt = buildBst.buildBst(values);

        System.out.println(bt);
    }

}
