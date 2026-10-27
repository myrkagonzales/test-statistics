package com.pluralsight;

public class TestStatsApp {

    public static void main(String[] args) {


        // create an array with 10 test scores
        int[] testScores = {88, 92, 75, 100, 67, 84, 95, 73, 89, 91};

        // call method and print the result
        double aveage = findAverage(testScores);
        System.out.println(" The average score is: " + aveage);
    }

        /**
         * Calculates the average score
         */
        public static double findAverage(int[]testScores)  {
            // keeps tracks of all scores added together
            int total = 0;

            // loop through each score in the array
            for (int testScore : testScores) {
                //add current score to total
                total += testScore;

            }
            // return the average
            return (double) total / testScores.length;

        }





    }



