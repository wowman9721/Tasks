package com.epam.lab27.tasks;

public class QueenService {

    private static int[] horizontal = {0, 0, 0, 0, 0, 0, 0, 0,};
    private static int verticalNumber = 0;
    private static int version = 0;

    private static boolean checkQueenLocation() {
        int i;

        if (verticalNumber == 0) {
            return true;
        }

        if (horizontal[verticalNumber] > 7) {
            horizontal[verticalNumber] = 0;
            verticalNumber--;
            return false;
        }

        for (i = 0; i < verticalNumber; i++) {
            if ((horizontal[verticalNumber] == horizontal[i]) | ((Math.abs(horizontal[verticalNumber] - horizontal[i])) == (verticalNumber - i))) {
                return false;
            }
        }

        return true;
    }

    public void execute() {

        do {
            if (checkQueenLocation()) {
                if (verticalNumber == 7) {
                    System.out.println(version++ + " [0]=" + horizontal[0] + " [1]=" + horizontal[1] + " [2]=" + horizontal[2] + " [3]=" + horizontal[3] + " [4]=" + horizontal[4] + " [5]=" + horizontal[5] + " [6]=" + horizontal[6] + " [7]=" + horizontal[7]);
                    horizontal[verticalNumber]++;
                } else {
                    verticalNumber++;
                }
            } else {
                horizontal[verticalNumber]++;
            }
        } while (horizontal[0] < 8);
    }
}





