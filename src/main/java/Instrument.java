public class Instrument implements IPlay, ISell{

    String material;
    String colour;
    FamilyType family;
    InstrumentType instrumentType;
    int costPrice;
    int sellPrice;

    public Instrument(String material, String colour, FamilyType family, InstrumentType instrumentType, int costPrice, int sellPrice) {
        this.material = material;
        this.colour = colour;
        this.family = family;
        this.instrumentType = instrumentType;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
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

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public int getCostPrice(){
        return this.costPrice;
    }

    public int getSellPrice(){
        return this.sellPrice;
    }

    @Override
    public String playMusic() {
        return "I am playing the " + instrumentType.getName() + "!";
    }

    @Override
    public void calculateMarkup() {

    }
}
