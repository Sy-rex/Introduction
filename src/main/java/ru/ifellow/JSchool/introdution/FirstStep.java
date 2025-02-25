package ru.ifellow.JSchool.introdution;

public class FirstStep {

    public int sum (int x, int y){
        return x + y;
    }

    public int mul (int x, int y){
        return x * y;
    }

    public int div (int x, int y){
        return x / y;
    }

    public int mod (int x, int y){
        return x % y;
    }

    public boolean isEqual (int x, int y){
        return x == y;
    }

    public boolean isGreater (int x, int y){
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        return (x >= xLeft && x <= xRight && y >= yTop && y <= yBottom);
    }

    public int sum(int[] array){
        int sumValue = 0;
        for (int i : array) {
            sumValue += i;
        }

        return sumValue;
    }

    public int mul(int[] array){
        if (array.length == 0) {
            return 0;
        }
        int result = 1;
        for (int i : array) {
            result *= i;
        }

        return result;
    }

    public int min(int[] array){
        int minValue = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < minValue) minValue = i;
        }

        return minValue;
    }

    public int max(int[] array){
        int maxValue = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > maxValue) maxValue = i;
        }

        return maxValue;
    }

    public double average(int[] array){
        return sum(array) / array.length;
    }

    public boolean isSortedDescendant(int[] array){
        if(array.length <= 1) return true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public void cube(int[]array){
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[]array, int value){
        for(int i : array){
            if(i == value) return true;
        }

        return false;
    }

    public void reverse(int[]array){
        int left = 0;
        int right = array.length - 1;

        while(left < right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public boolean isPalindrome(int[]array){
        int left = 0;
        int right = array.length - 1;

        while(left < right){
            if(array[left] != array[right]){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public int sum(int[][] matrix){
        int sumMatrix = 0;

        for (int i = 0; i < matrix.length; i++) {
            sumMatrix += sum(matrix[i]);
        }

        return sumMatrix;
    }

    public int max(int[][] matrix){
        int maxMatrix = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] > maxMatrix) maxMatrix = matrix[i][j];
            }
        }

        return maxMatrix;
    }

    public int diagonalMax(int[][] matrix){
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][i] > maxValue) maxValue = matrix[i][i];
        }

        return maxValue;
    }

    public boolean isSortedDescendant(int[][] matrix){
        if (matrix.length <= 1) return true;

        for (int i = 0; i < matrix.length; i++) {
            if(!isSortedDescendant(matrix[i])) return false;
        }
        
        return true;
    }
}
