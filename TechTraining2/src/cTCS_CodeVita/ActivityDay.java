package cTCS_CodeVita;

import java.util.*;

public class ActivityDay {

    static class Box implements Comparable<Box> {
        int x1, y1, x2, y2;
        int area;
        int index;

        Box(int x1, int y1, int x2, int y2, int index) {
            this.x1 = x1; this.y1 = y1; this.x2 = x2; this.y2 = y2;
            this.area = (x2 - x1) * (y2 - y1);
            this.index = index;
        }

        @Override
        public int compareTo(Box o) {
            if (o.area != this.area) return o.area - this.area;
            if (this.x1 != o.x1) return this.x1 - o.x1; 
            return this.y1 - o.y1; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        int L = sc.nextInt();
        sc.nextLine();

        Set<Integer> verticalLines = new TreeSet<>();
        Set<Integer> horizontalLines = new TreeSet<>();

        verticalLines.add(0); verticalLines.add(N); 
        horizontalLines.add(0); horizontalLines.add(M);

        for (int i = 0; i < L; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            sc.nextLine();

            if (x1 == x2) verticalLines.add(x1);
            if (y1 == y2) horizontalLines.add(y1);
        }

        int R = sc.nextInt();
        sc.nextLine();

        String[] strings = sc.nextLine().split(" ");

        
        List<Integer> xList = new ArrayList<>(verticalLines);
        List<Integer> yList = new ArrayList<>(horizontalLines);
        Collections.sort(xList);
        Collections.sort(yList);

        List<Box> boxes = new ArrayList<>();
        int index = 0; // for string assignment order
        for (int j = 0; j < yList.size() - 1; j++) {       // y: bottom to top
            for (int i = 0; i < xList.size() - 1; i++) {   // x: left to right
                boxes.add(new Box(xList.get(i), yList.get(j), xList.get(i + 1), yList.get(j + 1), index));
                index++;
            }
        }

        
        Collections.sort(boxes);

        Box raghuBox = boxes.get(R - 1);
        String assignedString = strings[raghuBox.index];

        
        int sum = 0;
        for (char c : assignedString.toCharArray()) sum += c;

        System.out.println(sum);
        sc.close();
    }
}

