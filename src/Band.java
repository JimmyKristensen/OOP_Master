public class Band {
    private int bandId;
    private String bandName;
    private String genre;

    public Band(int bandId,String bandName, String genre) {
        this.bandId = bandId;
        this.bandName = bandName;
        this.genre = genre;
    }

    public int getBandId() {
        return bandId;
    }

    public String getBandName(){
        return this.bandName;
    }

    public String getGenre(){
        return this.genre;
    }

    @Override
    public String toString() {
        return "Band{" +
                "bandId=" + bandId +
                ", bandName='" + bandName + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
