class test {
    public static void main(String[] args) {
        int[] setA = new int[]{1,2,3};
        int[] setB = new int[]{1,2};
        int[][] Arr = new int[2][6];
        for(int k = 0; k < 6; k++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j ++) {
                    Arr[k][0] = setA[i];
                    Arr[k][1] = setB[j];
                    break;
                }
                break;
            }
        }
        for (int i = 0; i < 2; i++) {
            for(int j = 0; j < 6; j++)
                System.out.println(Arr[i][j]);
            System.out.println("");
        }
    }
}

