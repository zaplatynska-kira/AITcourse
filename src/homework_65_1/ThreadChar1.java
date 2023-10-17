package homework_65_1;

    public class ThreadChar1 extends Thread {
        char aChar;

        public ThreadChar1(char ch) {
            this.aChar = ch;
        }

        public void run() {

            for (char i = 0; i < 100; i++) {
                System.out.println(aChar);
                try {
                    sleep(3);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

