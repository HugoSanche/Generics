interface Player{}
record BaseBallPlayer(String name, String Position) {}
record FootBallPlayer(String name, String Position) implements Player{}
public class Main {
    public static void main(String[] args) {
        BaseBallTeam lakers= new BaseBallTeam("Los Angeles Lakers");
        BaseBallTeam chicago=new BaseBallTeam("Chicago Bulls");
        scoresResults(lakers,3,chicago,5);

        var hugo=new BaseBallPlayer("Hugo S","Right");
        var daniel=new BaseBallPlayer("Daniel C","Left");
        lakers.addTeamMember(hugo);
        lakers.addTeamMember(daniel);
        lakers.listTeamMembers();

        SportsTeam cruzAzul= new SportsTeam("Cruz Azul FC");
        SportsTeam america=new SportsTeam("America");
        scoresResults(cruzAzul,5,america,2);

        var victor=new FootBallPlayer("Victor Sanchez","Right");
        var pedro=new FootBallPlayer("Pedro Paramo","Left");
        cruzAzul.addTeamMember(victor);
        cruzAzul.addTeamMember(pedro);
        cruzAzul.listTeamMembers();
    }
    public static void scoresResults(BaseBallTeam team1, int score_t1, BaseBallTeam team2, int score_t2){
        String message=team1.setScore(score_t1,score_t2);
        team2.setScore(score_t2,score_t1);
        System.out.printf("%s %s %s %n",team1, message,team2);
    }
    public static void scoresResults(SportsTeam team1, int score_t1, SportsTeam team2, int score_t2){
        String message=team1.setScore(score_t1,score_t2);
        team2.setScore(score_t2,score_t1);
        System.out.printf("%s %s %s %n",team1, message,team2);
    }
}