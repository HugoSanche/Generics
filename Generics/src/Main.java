record BaseBallPlayer(String name, String Position){}
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
    }
    public static void scoresResults(BaseBallTeam team1, int score_t1, BaseBallTeam team2, int score_t2){
        String message=team1.setScore(score_t1,score_t2);
        team2.setScore(score_t2,score_t1);
        System.out.printf("%s %s %s %n",team1, message,team2);
    }

}