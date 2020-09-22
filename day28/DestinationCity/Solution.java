import java.util.*;
class Solution {
    public String destCity(List<List<String>> paths) {
        String answer = "";
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < paths.size(); i++) {
            set.add(paths.get(i).get(0));
        }
        for (int i = 0; i < paths.size(); i++) {
            if (!set.contains(paths.get(i).get(1))) {
                answer = paths.get(i).get(1);
                //return paths.get(i).get(1);
                return answer;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<List<String>> paths = new ArrayList<>();
        List<String> path1 = new ArrayList<>();
        path1.add("B");
        path1.add("C");
        List<String> path2 = new ArrayList<>();
        path2.add("D");
        path2.add("B");
        List<String> path3 = new ArrayList<>();
        path3.add("C");
        path3.add("A");
        paths.add(path1);
        paths.add(path2);
        paths.add(path3);        
        System.out.println(paths);
        String ans1 = sol.destCity(paths);
        System.out.println(ans1);
    }
}