class Solution {
    public int findCenter(int[][] edges) {
        // check which number is common in every pair or edges
        int a = edges[0][0];
        int b = edges[0][1];
        int c = edges[1][0];
        int d = edges[1][1];
        if (a==c) return a;
        if (a==d) return a;
        if (b==c) return c;
        if (b==d) return b;
        return 0;
    }
}