/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func postorderTraversal(root *TreeNode) []int {
    res:=[]int{}
    po(root,&res)
    return res
}
func po(root *TreeNode,res *[]int) {
    if root == nil {
        return
    }
    po(root.Left,res)
    po(root.Right,res)
    *res = append(*res,root.Val)
}
