/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func preorderTraversal(root *TreeNode) []int {
    res:=[]int{}
    inOrder(root,&res)
    return res;
}

func inOrder(root *TreeNode,res *[]int) {
    if root == nil {
        return
    }
    *res = append(*res,root.Val)
    inOrder(root.Left,res);
    inOrder(root.Right,res)
} 
