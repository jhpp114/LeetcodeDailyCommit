import java.util.*;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> _treeMap = new TreeMap<Integer, Integer>();
        int soliderFrequency = 0;
        // treemap set up
        for (int i = 0; i < mat.length; i++) {
            _treeMap.put(i, soliderFrequency);
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    soliderFrequency++;
                    _treeMap.put(i, soliderFrequency);
                }
            }
            soliderFrequency = 0;
        }
        
        System.out.println(sortByValues(_treeMap));
        Map<Integer,Integer> _sortedMap = sortByValues(_treeMap);
        Object toArray[] = _sortedMap.keySet().toArray();
        int solution[] = new int[k];
        for (int i = 0; i < solution.length; i++) {
            solution[i] = (Integer)toArray[i];
        }
        
        return solution;
    }

    public static Map<Integer, Integer> sortByValues(Map<Integer, Integer> _map) {
        Comparator valueComparator = 
        new Comparator<Integer>() {
            @Override public int compare(Integer e1, Integer e2) {
                int compare = _map.get(e1).compareTo(_map.get(e2));
                if (compare == 0) {
                    return 1;
                } else {
                    return compare;
                }
            }
        };
   
        Map<Integer, Integer> sortedEntries = new TreeMap<Integer, Integer>(valueComparator);
        sortedEntries.putAll(_map);
        return sortedEntries;
    }

    private void PrintArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr1[][] = {
            {1,1,0,0,0}
        ,   {1,1,1,1,0}
        ,   {1,0,0,0,0}
        ,   {1,1,0,0,0}
        ,   {1,1,1,1,1}
        };
        int sol1[] = sol.kWeakestRows(arr1, 3);
        sol.PrintArray(sol1);
    }
}