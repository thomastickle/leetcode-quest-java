package com.github.ttickle.queue;

public class QueueQuestion1 {
    public int countStudents(int[] students, int[] sandwiches) {
        int sandwichPointer = 0;
        int noSandwichTaken = students.length;
        while (sandwichPointer < sandwiches.length) {
            boolean sandwichTaken = false;
            for (int i = 0; i < students.length && sandwichPointer < sandwiches.length; i++) {
                if (students[i] == -1) {
                    continue;
                }

                if (students[i] == sandwiches[sandwichPointer]) {
                    sandwichTaken = true;
                    students[i] = -1;
                    sandwichPointer++;
                    noSandwichTaken--;
                }
            }
            if (!sandwichTaken) {
                break;
            }
        }
        return noSandwichTaken;
    }

}
