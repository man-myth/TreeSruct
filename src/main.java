public class main {

    public static int getDepth(Branch branch){

        //base case
        if (branch == null) {
            return 0;
        }

        int maxChildDepth = 0;
        if (branch.getBranches() != null) {
            for (Branch child : branch.getBranches()) {
                int childDepth = getDepth(child);       //recursion
                maxChildDepth = Math.max(maxChildDepth, childDepth);
            }
        }
        return maxChildDepth + 1;
    }

        // tester
    public static void main(String[] args) {
        Branch root = new Branch();
        Branch d21 = new Branch();
        Branch d22 = new Branch();
        Branch d23 = new Branch();
        Branch d31 = new Branch();
        Branch d41 = new Branch();
        Branch d42 = new Branch();
        Branch d51 = new Branch();

        root.addBranch(d21);
        root.addBranch(d22);
        root.addBranch(d23);
        d22.addBranch(d31);
        d31.addBranch(d41);
        d31.addBranch(d42);
        d41.addBranch(d51);

        // Calculate the depth of the tree
        int depth = getDepth(root);

        System.out.println("Depth of the tree: " + depth);
    }
}
