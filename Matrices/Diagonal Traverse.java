import java.util.*;

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int m = mat.length;
        int n = mat[0].length;

        // Group elements by their diagonal index (i + j)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map.putIfAbsent(i + j, new ArrayList<>());
                map.get(i + j).add(mat[i][j]);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < m + n - 1; i++) { // Iterate over the diagonals
            List<Integer> diagonal = map.get(i);
            if (i % 2 == 0) {
                Collections.reverse(diagonal); // Reverse even-indexed diagonals
            }
            result.addAll(diagonal); // Add diagonal elements to the result
        }

        // Convert result list to an array
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
