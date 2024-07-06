public class TV {
    private Channel[] channels;

    public TV(Channel... channels) {

        this.channels = channels;
    }

    public Channel[] getChannels() {
        return channels;
    }

    public void setChannels(Channel... channels) {
        this.channels = channels;
    }
}
