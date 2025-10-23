package cTCS_CodeVita;

import java.util.*;

public class The_Brick_Wall {
    static class Point {
        int x, y;
        Point(int x, int y) { this.x = x; this.y = y; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        // Step 1: Parse each line into block symbols
        List<List<Character>> wall = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            List<Character> row = new ArrayList<>();
            int num = 0;
            for (char c : line.toCharArray()) {
                if (Character.isDigit(c)) {
                    num = num * 10 + (c - '0');
                } else {
                    // Each num + letter is ONE BLOCK (regardless of num value)
                    row.add(c);
                    num = 0;
                }
            }
            wall.add(row);
        }

        int rows = wall.size();
        int cols = 0;
        for (List<Character> r : wall)
            cols = Math.max(cols, r.size());

        // Step 2: Normalize grid
        char[][] grid = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            List<Character> row = wall.get(i);
            for (int j = 0; j < cols; j++) {
                if (j < row.size()) grid[i][j] = row.get(j);
                else grid[i][j] = 'R'; // fill missing with Red brick
            }
        }

        // Step 3: Find S and D
        int sx = -1, sy = -1, dx = -1, dy = -1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 'S') { sx = i; sy = j; }
                if (grid[i][j] == 'D') { dx = i; dy = j; }
            }
        }

        if (sx == -1 || dx == -1) {
            System.out.println("Invalid input (S or D missing)");
            return;
        }

        // Optional: print logical grid for checking
        System.out.println("Logical Grid:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < wall.get(i).size(); j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        // Step 4: BFS (0-1 BFS)
        int[][] cost = new int[rows][cols];
        for (int[] c : cost) Arrays.fill(c, Integer.MAX_VALUE);
        Deque<Point> dq = new ArrayDeque<>();
        dq.addFirst(new Point(sx, sy));
        cost[sx][sy] = 0;

        int[] dxArr = {0, 0, 1, -1};
        int[] dyArr = {1, -1, 0, 0};

        while (!dq.isEmpty()) {
            Point p = dq.pollFirst();
            for (int d = 0; d < 4; d++) {
                int nx = p.x + dxArr[d];
                int ny = p.y + dyArr[d];
                // validate boundaries for that row length
                if (nx < 0 || nx >= rows) continue;
                if (ny < 0 || ny >= wall.get(nx).size()) continue;

                if (grid[nx][ny] == 'R') continue; // can't break red

                int weight = (grid[nx][ny] == 'G') ? 1 : 0;
                int newCost = cost[p.x][p.y] + weight;

                if (newCost < cost[nx][ny]) {
                    cost[nx][ny] = newCost;
                    if (weight == 0)
                        dq.addFirst(new Point(nx, ny));
                    else
                        dq.addLast(new Point(nx, ny));
                }
            }
        }

        // Step 5: Print result
        if (cost[dx][dy] == Integer.MAX_VALUE)
            System.out.println("Not Possible");
        else
            System.out.println("Minimum green bricks to break: " + cost[dx][dy]);
    }
}
