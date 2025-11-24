public class BackgroundJob {
    public static void main(String[] args) {
        Runnable job = () -> {
            System.out.println("Background job running...");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println("Job completed.");
        };

        Thread t = new Thread(job);
        t.start();
    }
}

