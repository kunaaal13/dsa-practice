package com.kunaaal.BinarySearch;

public class SearchTwoDMatrix {
    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int end = row * col -1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            int element = matrix[mid/col][mid%col];

            if (element == target)
                return true;
            else if (element < target) {
                start = mid + 1;
            } else
                end =  mid - 1;
        }


        return false;
    }
}
