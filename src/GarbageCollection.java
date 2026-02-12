class GarbageCollection {

    @Override
    protected void finalize() {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) throws Exception {

        GarbageCollection obj = new GarbageCollection();
        obj = null;

        System.gc();

        // Give JVM time to call finalize()
        Thread.sleep(1000);
    }
}

