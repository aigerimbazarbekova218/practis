public enum OperationSystem {
    IOS("Iphone,Windows Phone, Tizen, Google Play, WebOS, HarmonyOs, Chrome OS, ICloud "),
    ANDROID("Android Cupcake, Samsung, Motorola");
    private String use;

    OperationSystem(String use) {
        this.use = use;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
