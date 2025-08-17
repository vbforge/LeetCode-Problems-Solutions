package com.vladproduction.island_perimeter;

/**
 * Created by vladproduction on 20-Apr-24
 */

public class IslandPerimeter {

    public int islandPerimeter(int[][] grid){
        int per = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(grid[i][j] == 1){
                    per += cellPerimeter(grid, i, j, rows, cols);
                }
            }
        }
        return per;
    }

    private int cellPerimeter(int[][] grid, int row, int col, int rows, int cols) {
        int per = 0;
        //going to check sides neighbors
        if(row == 0 || grid [row - 1][col] == 0){
            per++; //top
        }
        if(row == rows - 1 || grid [row + 1][col] == 0){
            per++; //bottom
        }
        if(col == 0 || grid[row][col - 1] ==0){
            per++; //left
        }
        if(col == cols - 1 || grid[row][col + 1] == 0){
            per++; //right
        }
        return per;
    }


}
