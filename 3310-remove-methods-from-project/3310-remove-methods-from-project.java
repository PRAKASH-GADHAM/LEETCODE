class Solution {
    private List<Integer>[] graph;
    private boolean[] suspicious;
    private boolean[] visited;

    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] invocation : invocations) {
            graph[invocation[0]].add(invocation[1]);
        }

        suspicious = new boolean[n];
        visited = new boolean[n];
        
        dfs(k, true);

        Arrays.fill(visited, false);
        boolean externalInvocation = false;
        for (int i = 0; i < n; i++) {
            if (!suspicious[i] && !visited[i]) {
                if (checkExternal(i)) {
                    externalInvocation = true;
                    break;
                }
            }
        }

        if (externalInvocation) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                result.add(i);
            }
            return result;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!suspicious[i]) {
                result.add(i);
            }
        }
        return result;
    }

    private void dfs(int node, boolean markSuspicious) {
        if (visited[node]) return;
        visited[node] = true;
        if (markSuspicious) {
            suspicious[node] = true;
        }
        for (int neighbor : graph[node]) {
            dfs(neighbor, markSuspicious);
        }
    }

    private boolean checkExternal(int node) {
        if (visited[node]) return false;
        visited[node] = true;
        for (int neighbor : graph[node]) {
            if (suspicious[neighbor]) {
                return true;
            }
            if (checkExternal(neighbor)) {
                return true;
            }
        }
        return false;
    }
}   