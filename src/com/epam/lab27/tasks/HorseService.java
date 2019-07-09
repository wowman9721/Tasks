package com.epam.lab27.tasks;

public class HorseService {
    private static final int SIZE_OF_DESK = 8;
    private static int[][] desk = new int[SIZE_OF_DESK][SIZE_OF_DESK];
    private static int[] horizontalStep = {2, 2, -2, -2, 1, -1, 1, -1};
    private static int[] verticalStep = {1, -1, -1, 1, -2, -2, 2, 2};

    public void printHorseSteps() {
        int i = 0;
        int j = 0;
        int k;
        int count = 1;
        int[] minStep = {8, 0, 0};
        desk[i][j] = 1;
        for (count = 2; count <= Math.pow(SIZE_OF_DESK, 2); count++) {
            minStep[0] = 8;
            int temp;
            for (k = 0; k < 8; k++) {
                temp = countHorseSteps(i + horizontalStep[k], j + verticalStep[k]);
                if (0 <= (i + horizontalStep[k]) && (i + horizontalStep[k]) < SIZE_OF_DESK &&
                        0 <= (j + verticalStep[k]) && (j + verticalStep[k]) < SIZE_OF_DESK &&
                        desk[i + horizontalStep[k]][j + verticalStep[k]] == 0 &&
                        temp <= minStep[0]) {
                    minStep[0] = temp;
                    minStep[1] = i + horizontalStep[k];
                    minStep[2] = j + verticalStep[k];
                }
            }
            i = minStep[1];
            j = minStep[2];
            desk[i][j] = count;
        }

        for (i = 0; i < SIZE_OF_DESK; i++) {
            for (j = 0; j < SIZE_OF_DESK; j++) {
                if (desk[i][j] == 0) {
                    System.out.print("   X");
                } else {
                    System.out.printf("%4d", desk[i][j]);
                }
            }
            System.out.println();
        }
    }

    private static int countHorseSteps(int i, int j) {
        int steps = 0;
        for (int n = 0; n < 8; n++) {
            if (0 <= (i + horizontalStep[n]) && (i + horizontalStep[n]) < SIZE_OF_DESK && 0 <= (j + verticalStep[n]) &&
                    (j + verticalStep[n]) < SIZE_OF_DESK && desk[i + horizontalStep[n]][j + verticalStep[n]] == 0) {
                steps++;
            }
        }
        return steps;

    }
}


