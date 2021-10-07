class Arrangement {
    private double startTime;
    private double endTime;
    private String location;
    private String email;
    private int phoneNumber;
    private Contract contract;

    public Arrangement(double startTime, double endTime, String location, String email, int phoneNumber, Contract contract) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Arrangement{" +
                "startTime= " + startTime +
                ", endTime= " + endTime +
                ", location= '" + location + '\'' +
                ", email= '" + email + '\'' +
                ", phoneNumber= " + phoneNumber +
                ", contract= " + contract +
                '}';
    }
}
