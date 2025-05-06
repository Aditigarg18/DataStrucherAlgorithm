// Given a square matrix mat[][] of size n x n. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space. 

// Examples:

// Input: mat[][] = [[1, 2, 3],
//                 [4, 5, 6]
//                 [7, 8, 9]]
// Output: Rotated Matrix:
// [3, 6, 9]
// [2, 5, 8]
// [1, 4, 7]
class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][]) {
        // code here
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<mat[0].length;j++){
               int  temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int j=0;j<n;j++){
            for(int i=0;i<mat[0].length/2;i++){
                int temp=mat[i][j];
                 mat[i][j]=mat[n-1-i][j];
                 mat[n-1-i][j]=temp;
            }
        }
    }
}
