public class Channel {
    private String nameCannal;
    private TVTransmission[] Transmission;
    private int nomer;

    public Channel(int nomer, String nameCannal, TVTransmission... transmission) {
        this.nomer = nomer;
        setNameCannal(nameCannal);
        setTransmission(transmission);

    }

    public String getNameCannal() {

        return nameCannal;
    }

    public void setNameCannal(String nameCannal) {
        this.nameCannal = nameCannal;
    }

    public TVTransmission[] getTransmission() {
        return Transmission;
    }

    public void setTransmission(TVTransmission... transmission) {
        Transmission = transmission;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }
}
