package com.github.ttickle.queue;

public class QueueQuestion2 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        boolean finished = false;
        while (!finished) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] == 0) {
                    continue;
                }

                tickets[i] -= 1;
                time += 1;

                if (tickets[k] == 0) {
                    finished = true;
                    break;
                }
            }
        }
        return time;
    }
}
