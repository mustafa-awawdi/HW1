public class Assignment01Q05 {
public static int findShortestPath(int[][] m, int i, int j) {
    if (i == j) {
        return 0;
    }

    int[] stack = new int[m.length];
    int first = 0, last = 0;
    boolean[] visited = new boolean[m.length];
    int[] distance = new int[m.length];

    visited[i] = true;
    distance[i] = 0;
    stack[last++] = i;

    while (first < last) {
        int curr = stack[first++];
        for (int next = 0; next < m.length; next++) {
            if (m[curr][next] == 1 && !visited[next]) {
                distance[next] = distance[curr] + 1;
                if (next == j) {
                    return distance[next];
                }
                visited[next] = true;
                stack[last++] = next;
            }
        }
    }

    return -1;
}

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}