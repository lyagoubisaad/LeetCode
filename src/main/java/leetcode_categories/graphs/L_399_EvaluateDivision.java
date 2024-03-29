package leetcode_categories.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class L_399_EvaluateDivision {


    class Fraction {
        String denom;
        double value;

        public Fraction(String denom, double value) {
            this.denom = denom;
            this.value = value;
        }
    }
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String, List<Fraction>> map = new HashMap<>();
        int cpt = 0;
        for (List<String> equation : equations) {
            map.computeIfAbsent(equation.get(0), val -> new ArrayList<>()).add(new Fraction(equation.get(1), values[cpt]));
            map.computeIfAbsent(equation.get(1), val -> new ArrayList<>()).add(new Fraction(equation.get(0), 1/values[cpt]));
            cpt++;
        }
        double[] result = new double[queries.size()];
        for (int i=0;i<queries.size();i++) {
            if(map.containsKey(queries.get(i).get(0)) && queries.get(i).get(0).equals(queries.get(i).get(1))) result[i] = 1;
            else if(map.containsKey(queries.get(i).get(0)) && map.containsKey(queries.get(i).get(1))) {
                result[i] = bfs(queries.get(i).get(0),queries.get(i).get(1), map, new HashSet<>());
            }
            else result[i] = -1;
        }
        return result;
    }

    private double bfs(String numerator, String denominator, HashMap<String, List<Fraction>> map, HashSet<String> seen) {
        if(numerator.equals(denominator)) return 1;
        if(!seen.add(numerator)) return -1;
        double result = -1;
        for (Fraction fraction: map.get(numerator)) {
            result = bfs(fraction.denom, denominator, map, seen);
            if(result != -1) return fraction.value*result;
        }
        return result;
    }
}
