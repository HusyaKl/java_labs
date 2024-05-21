public class Robot {

    private static Object lock = new Object();
    private static boolean isLeftLegTurn = true;

    public static void main(String[] args) {
        Thread leftLeg = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (isLeftLegTurn) {
                        System.out.println("LEFT");
                        isLeftLegTurn = false;
                    }
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread rightLeg = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (!isLeftLegTurn) {
                        System.out.println("RIGHT");
                        isLeftLegTurn = true;
                    }
                }

                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        leftLeg.start();
        rightLeg.start();
    }
}