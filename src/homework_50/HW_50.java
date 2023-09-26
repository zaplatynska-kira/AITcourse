package homework_50;
import java.util.*;
public class HW_50 {



        public int[] countOrdersNumber(long[] orderTimes, int minutes) {
            Deque<Long> orderQueue = new ArrayDeque<>();
            int[] result = new int[orderTimes.length];
            long millis = (long) minutes * 60 * 1000;

            for (int i = 0; i < orderTimes.length; i++) {
                long currentTime = orderTimes[i];

                while (!orderQueue.isEmpty() && currentTime - orderQueue.getFirst() > millis) {
                    orderQueue.removeFirst();
                }

                result[i] = orderQueue.size();


                orderQueue.addLast(currentTime);
            }

            return result;
        }

        public static void main(String[] args) {
            HW_50 hw50 = new HW_50();
            long[] orderTimes = {1_000_000, 1_200_000, 1_250_000, 1_300_000, 1_600_000, 1_700_000, 1_800_000, 1_850_000, 1_890_000};
            int minutes = 5;
            int[] results = hw50.countOrdersNumber(orderTimes, minutes);

            for (int i = 0; i < orderTimes.length; i++) {
                System.out.println("Order Time: " + orderTimes[i] + ", Count: " + results[i]);
            }
        }
    }


