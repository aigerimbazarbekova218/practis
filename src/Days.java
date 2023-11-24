public enum Days {
    MONDAY("понедельник"),
    TUESDAY("вторник"),
    WEDNESDAY("среда"),
    THURSDAY("четверг"),

    FRIDAY("пятница"),
    SATURDAY("суббота"),
    SUNDAY("воскресение");
    private String nameInRussion;

    Days(String nameInRussion) {
        this.nameInRussion = nameInRussion;
    }

    public String getNameInRussion() {
        return nameInRussion;
    }

    public void setNameInRussion(String nameInRussion) {
        this.nameInRussion = nameInRussion;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
