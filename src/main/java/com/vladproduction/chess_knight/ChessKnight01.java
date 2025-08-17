package com.vladproduction.chess_knight;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class ChessKnight01 {
    public static void main(String[] args) {
        ChessKnight01 chessKnight01 = new ChessKnight01();
        chessKnight01.run();
    }

    int[][] table;
    int[] whereToGo = {
            -1, 2,
            -1,-2,
            1,-2,
            1, 2,
            -2,-1,
            -2, 1,
            2,-1,
            2, 1
    };
    private void run() {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        table = new int[n][n];
        int startX = scanner.nextInt() - 1;
        int startY = scanner.nextInt() - 1;
        int endX = scanner.nextInt() - 1;
        int endY = scanner.nextInt() - 1;

        if (startX == endX && startY == endY) {
            System.out.println(0);
        } else {
            Cell start = new Cell(startX, startY);
            Cell end = new Cell(endX, endY);
            System.out.println(bfs(start, end) - 1);
        }
    }

    private int bfs(Cell start, Cell end) {
        int count = 1;
        int n = table.length;
        Queue<Cell> queue = new ArrayDeque<>();
        queue.add(start);
        table[start.x()][start.y()] = 1;
        while (!queue.isEmpty()) {
            Cell cell = queue.poll();
            count = table[cell.x()][cell.y()];
            for (int t = 0; t < 8; t++) {
                int i = cell.x() + whereToGo[t * 2];
                int j = cell.y() + whereToGo[t * 2 + 1];
                if (test(n, i, j)) {
                    queue.offer(new Cell(i, j));
                    table[i][j] = count + 1;
                }
            }
        }
        return table[end.x()][end.y()];
    }
    private boolean test(int n, int i, int j) {
        return i >= 0 && j >= 0 && i < n && j < n && table[i][j] == 0;
    }

    record Cell(int x, int y) {
    }


}


