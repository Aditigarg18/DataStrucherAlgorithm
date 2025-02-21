
class FindElements {
Set <Integer>st=new HashSet<>();
public void dfs(TreeNode root,int x){
    if(root==null)
    return;
    root.val=x;
    st.add(x);
    dfs(root.left,2*x+1);
    dfs(root.right,2*x+2);
}
    public FindElements(TreeNode root) {
        st.clear();
        dfs(root,0);
    }
    
    public boolean find(int target) {
      return st.contains(target);  
    }
}
