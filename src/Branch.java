import java.util.ArrayList;
import java.util.List;

public class Branch {
    private List<Branch> branches;

    public Branch(){
        this.branches = new ArrayList<>();
    }
    public void addBranch(Branch branch){
        this.branches.add(branch);
    }
    public void removeChild(Branch branch){
        this.branches.remove(branch);
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }
}