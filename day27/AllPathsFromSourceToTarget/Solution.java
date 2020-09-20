import java.util.*;
class Solution {
    // bfs aprroach
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> queue = new LinkedList<>();
        int goal = graph.length - 1;
        queue.add(Arrays.asList(0));

        while (!queue.isEmpty()) {
            List<Integer> path = queue.poll();
            //System.out.println("Path" + path);
            int lastNode = path.get(path.size() - 1);
            if (lastNode == goal) {
                result.add(path);
            }
            // first loop, 1,2
            int[] neighbors = graph[lastNode];
            
            for (int neighbor : neighbors) {
                // add previous path
                List<Integer> list = new ArrayList<>(path);
                list.add(neighbor);
                queue.add(list);
            }
            //System.out.println(queue);
        }
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int input1[][] = {
            {1,2}
        ,   {3}
        ,   {3}
        ,   {}
        };
        
        //List<List<Integer>> sol1 = sol.allPathsSourceTarget(input1);
    }
}