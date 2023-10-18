package homework_66;

public class RegularClark extends AbstractClerk {
    private int count = 0;

    public RegularClark(String name, int minTime, int maxTime, int creditsNum) {
        super(name, minTime, maxTime, creditsNum);
    }

    public void run() {
        for (int i = 0; i < creditsNum; i++) {
            int randomTime = random.nextInt(maxTime - minTime);

            try {
                Thread.sleep(randomTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            count++;
            System.out.println(name + " gave credit: " + count);
        }

        finishTime = System.currentTimeMillis();
    }
}