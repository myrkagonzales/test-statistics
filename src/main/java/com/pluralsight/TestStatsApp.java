package com.pluralsight;

public class TestStatsApp {

    public static void main(String[] args) {


        // create an array with 10 test scores
        int[] testScores = {88, 92, 75, 100, 67, 84, 95, 73, 89, 91};

        // call method and print the result
        double aveage = findAverage(testScores);
        int highest = findHighest(testScores);
        int lowest = findLowest(testScores);

        System.out.println(" The average score is: " + aveage);
        System.out.println("The highest score is: " + highest);
        System.out.println("The lowest score is: " + lowest);
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
            return (double) total / testScores.length; }
            /**
             *  Find the highest score
             */
            public static int findHighest(int[] testScores) {
                // first score is the highest
                int highest = testScores[0];

                // compare all scores
                for (int testScore : testScores) {
                    // update the highest if necessary
                    if (testScore > highest) {
                        highest = testScore;
                    }
                }

                return highest;
            }
          /**
          * find the lowest score
          */
          public static int findLowest(int[]testScores) {
              // first score is the lowest
              int lowest = testScores[0];
              // compare all scores
              for (int testScore : testScores) {
                  // update lowest if necessary
                  if (testScore < lowest) {
                      lowest = testScore;

                  }
              }
              // return
              return lowest;


}





    }



