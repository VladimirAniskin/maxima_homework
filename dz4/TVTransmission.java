package dz4;

public class TVTransmission {
    private String programName;

    public TVTransmission(String programName) {
        this.programName = programName;
    }

    public String getName() {
        return programName;
    }

    public void setName(String programName) {
        this.programName = programName;
    }
}
