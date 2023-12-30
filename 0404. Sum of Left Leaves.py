# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right


class Solution(object):
    def sumOfLeftLeaves(self, root):
        if root is None:
             return 0
        if root.left is None and root.right is None:
             return 0

        leftValue = self.sumOfLeftLeaves(root.left) #左
        if root.left and not root.left.left and not root.left.right: #左子樹是右葉子的情況
            leftValue = root.left.val

        rightValue = self.sumOfLeftLeaves(root.right)

        sum_val = leftValue + rightValue #中
        return sum_val