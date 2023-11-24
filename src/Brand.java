public enum Brand {
    APPLE("Apple"){
        @Override
        public void country() {
            System.out.println("USA");
        }
    },
    SAMSUNG("Samsung"){
        @Override
        public void country() {
            System.out.println(" South Korea");
        }
    },
    XIAOMI("Xiaomi"){
        @Override
        public void country() {
            System.out.println("Сhina");
        }
    };

    private String name;

    Brand(String name) {
        this.name = name;
    }

    public abstract void country();


}
