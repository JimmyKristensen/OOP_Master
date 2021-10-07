public class Concert {
    public static void main(String[] args) {
        Band manWithAMission = new Band(1,"Man with a Mission","J-rock");
        Contract mwamContract = new Contract(1, 1500,"They have to perform", manWithAMission);
        Arrangement concert = new Arrangement(17.00, 23.00,"Time Square", "legitConcert@gmail.com", 33667788, mwamContract);
        System.out.println(concert);

    }
}
