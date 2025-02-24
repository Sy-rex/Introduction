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
        if (array == null) {
            throw new IllegalArgumentException("null");
        }
        int sum = 0;
        for (int i : array) {
            sum += i;
        }

        return sum;
    }

    public int mul(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("null");
        }
        int mul = 1;
        for (int i : array) {
            if (i == 0) {
                mul = 0;
                break;
            }
            mul *= i;
        }

        return mul;
    }

    public int min(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("null");
        }
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < min) min = i;
        }

        return min;
    }

    public int max(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("null");
        }
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) max = i;
        }

        return max;
    }

    public double average(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("null");
        }
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }

        return average / array.length;
    }

    public boolean isSortedDescendant(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("null");
        }
        boolean sorted = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                sorted = false;
                break;
            }
        }

        return sorted;
    }

    public void cube(int[]array){
        if (array == null) {
            throw new IllegalArgumentException("null");
        }
        for (int i : array) {
            i*=i*i;
        }
    }

    public boolean find(int[]array, int value){
        if (array == null) {
            throw new IllegalArgumentException("null");
        }
        for(int i : array){
            if(i == value) return true;
        }

        return false;
    }

    public void reverse(int[]array){
        if (array == null) {
            throw new IllegalArgumentException("null");
        }
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
        if (array == null) {
            throw new IllegalArgumentException("null");
        }
        int left = 0;
        int right = array.length - 1;

        while(left < right){
            if(array[left] != array[right]){
                return false;
            }else {
                left++;
                right--;
            }
        }

        return true;
    }

    public int sum(int[][] matrix){
        if (matrix == null) {
            throw new IllegalArgumentException("null");
        }
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    public int max(int[][] matrix){
        if (matrix == null) {
            throw new IllegalArgumentException("null");
        }
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] > max) max = matrix[i][j];
            }
        }

        return max;
    }

    public int diagonalMax(int[][] matrix){
        if (matrix == null) {
            throw new IllegalArgumentException("null");
        }
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][i] > max) max = matrix[i][i];
        }

        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        if (matrix == null) {
            throw new IllegalArgumentException("null");
        }
        for (int i = 0; i < matrix.length; i++) {
            if(!isSortedDescendant(matrix[i])) return false;
        }
        return true;
    }
}
