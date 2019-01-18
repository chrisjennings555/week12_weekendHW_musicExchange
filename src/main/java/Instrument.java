public class Instrument implements IPlay, ISell{

    String material;
    String colour;
    FamilyType family;
    InstrumentType instrument;

    public Instrument(String material, String colour, FamilyType family, InstrumentType instrument) {
        this.material = material;
        this.colour = colour;
        this.family = family;
        this.instrument = instrument;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public FamilyType getFamily() {
        return family;
    }

    public InstrumentType getInstrument() {
        return instrument;
    }

    @Override
    public String playMusic(Instrument instrument) {
        return "I am playing the " + instrument + "!";
    }

    @Override
    public void calculateMarkup() {

    }
}
