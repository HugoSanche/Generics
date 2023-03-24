import java.util.ArrayList;
import java.util.List;

public class SportsTeam {
    private String teamName;
    List<Player> teamMembers= new ArrayList<>();
    private int totalWins=0;
    private int totalLosses=0;
    private int totalTies=0;

    public SportsTeam(String teamName) {
        this.teamName = teamName;
    }
    public void addTeamMember(Player player) {
        if (!teamMembers.contains(player)) {
            teamMembers.add(player);
        }
    }
    public void listTeamMembers(){
            System.out.println(teamName+" Lista:");
            System.out.println(teamMembers);
        }
        public int raiting(){
            return (totalLosses*2)+totalTies+1;
        }
    public String setScore(int ourScore, int theirScore) {
        String message = "Lost to";
        if (ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            message = "Tied";
            totalTies++;
        } else {
            totalLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return  teamName+"(Ranked "+raiting()+")";
    }
}
