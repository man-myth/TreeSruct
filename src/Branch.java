import java.util.ArrayList;
import java.util.List;

public class Branch {
    private List<Branch> branches; //list of child nodes

    //constructor
    public Branch(){
        this.branches = new ArrayList<>();
    }
    //add a branch to the tree
    public void addBranch(Branch branch){
        this.branches.add(branch);
    }
    //remove a branch from the tree
    public void removeChild(Branch branch){
        this.branches.remove(branch);
    }
    // return child branches
    public List<Branch> getBranches() {
        return branches;
    }
    // set branches of the tree
    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }
}