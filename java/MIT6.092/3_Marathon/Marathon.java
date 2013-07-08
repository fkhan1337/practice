/*************************************************************

Program to fint the fastest two runners in a MArathon
Author: Farhan Khan
Email: fkhan.1337@gmail.com
Source: MIT 6.092

**************************************************************/


class Marathon {

    private static int getFastestRunnerIndex(int[] times) {
	/*
	  Requires an array with atleast one element.
	 */
	int runnerIndex = 0;
	int runnerTime = times[runnerIndex];
	
	for (int i=0; i<times.length; i++) {
	    if (runnerTime > times[i]) {
		runnerTime = times[i];
		runnerIndex = i;
	    }
	}
	return runnerIndex;
    }

    private static int getSecondFastestRunnerIndex(int[] times, int except) {
	int runnerIndex = -1;
	int runnerTime = 10000;
	for (int i=0; i<times.length; i++) {
	    if (runnerTime > times[i] && i != except) {
		runnerTime = times[i];
		runnerIndex = i;
	    }
	}
	return runnerIndex;
    }

    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }

	int fastestRunnerIndex = getFastestRunnerIndex(times);
	System.out.println("The fastest Runner is: " + names[fastestRunnerIndex] + "with " + times[fastestRunnerIndex]);
	System.out.println("Second fastest runner is: " + names[getSecondFastestRunnerIndex(times,fastestRunnerIndex)] + " with " + fastestRunnerIndex);
    }
} 
