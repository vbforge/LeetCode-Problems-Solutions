package com.vladproduction.island_perimeter;

/**
 * Created by vladproduction on 20-Apr-24
 */

public class Main {
    public static void main(String[] args) {
        int[][] grid1 = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        int[][] grid2 = {
                {1}
        };
        int[][] grid3 = {
                {1, 0}
        };
        IslandPerimeter island1 = new IslandPerimeter();
        System.out.println("Island Perimeter: " + island1.islandPerimeter(grid1));

        IslandPerimeter island2 = new IslandPerimeter();
        System.out.println("Island Perimeter: " + island2.islandPerimeter(grid2));

        IslandPerimeter island3 = new IslandPerimeter();
        System.out.println("Island Perimeter: " + island3.islandPerimeter(grid3));

    }
}
