package threadraces;

public class Counter {
        private int count1 = 0;
        private int count2 = 0;

        public synchronized void incrementCount1() {
            count1++;
        }

        public synchronized void incrementCount2() {
            count2++;
        }
}
