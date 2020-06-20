import  java.util.*;
class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> citiesSet = new HashSet<String>();
        for (List<String> fromCity : paths) {
            citiesSet.add(fromCity.get(0));
        }
        for (List<String> destCity: paths) {
            if (!citiesSet.contains(destCity.get(1))) {
                return destCity.get(1);
            }
        }
        // else
        return "";
    }
    public static void main(String[] args) {
        List<List<String>> cities = new ArrayList<List<String>>();
        List<String> city1 = new ArrayList<String>();
        city1.add("London");
        city1.add("New York");
        cities.add(0, city1);
        List<String> city2 = new ArrayList<String>();
        city2.add("New York");
        city2.add("Lima");
        cities.add(1, city2);
        List<String> city3 = new ArrayList<String>();
        city3.add("Lima");
        city3.add("Saint");
        cities.add(1, city3);

        Solution sol = new Solution();
        String destination = sol.destCity(cities);
        System.out.println(destination);

    }
}