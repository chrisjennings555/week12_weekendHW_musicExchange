public enum InstrumentType {

    GUITAR("Guitar"),
    PIANO("Piano"),
    TROMBONE("Trombone");

    private final String name;

    InstrumentType(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
