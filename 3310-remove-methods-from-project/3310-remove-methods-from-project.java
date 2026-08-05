class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invo) {
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for (int[] edge : invo) graph[edge[0]].add(edge[1]);
        boolean[] sus = new boolean[n];
        dfs(k, graph, sus);
        // If an outside method invokes a suspicious method, nothing can be removed.
        for (int[] edge : invo) {
            int u = edge[0];
            int v = edge[1];
            if (!sus[u] && sus[v]) {
                List<Integer> ans = new ArrayList<>();
                for (int i = 0; i < n; i++) ans.add(i);
                return ans;
            }
        }
        List<Integer> rem = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!sus[i]) rem.add(i);
        }
        return rem;
    }

    private void dfs(int node, List<Integer>[] graph, boolean[] sus) {
        sus[node] = true;
        for (int next : graph[node]) {
            if (!sus[next]) dfs(next, graph, sus);
        }
    }
}