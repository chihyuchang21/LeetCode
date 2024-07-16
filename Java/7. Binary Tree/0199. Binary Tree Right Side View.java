class Solution {
    public  List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> que = new LinkedList<>();

        if (root == null) return list;
        que.offerLast(root);

        while (!que.isEmpty()) {
            int levelSize = que.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode poll = que.pollFirst();

                if (poll.left != null) que.addLast(poll.left);
                if (poll.right != null) que.addLast(poll.right);
                if (i == levelSize - 1) list.add(poll.val);
            }
        }
        return list;
    }
}