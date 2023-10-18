package homework_66;

public class LazyInspiredClerk extends AbstractClerk {
    private static int INSPIRATION_PROBABILITY = 20;
    private static int INSPIRATION_TIMES = 3;

    private double inspirationCoef;

    private int count = 0;

    public LazyInspiredClerk(String name, int minTime, int maxTime, int creditsNum, double inspirationCoef) {
        super(name, minTime, maxTime, creditsNum);
        this.inspirationCoef = inspirationCoef;
    }

    public void run() {
        for (int i = 0; i < creditsNum; i++) {
            int randomTime = random.nextInt(maxTime - minTime);

            if (random.nextInt(100) < INSPIRATION_PROBABILITY) {
                randomTime /= inspirationCoef;

            }
            try {
                Thread.sleep(randomTime);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            count++;
            System.out.println(name + " gave credit:  " + count);
        }
        finishTime = System.currentTimeMillis();
    }
}

