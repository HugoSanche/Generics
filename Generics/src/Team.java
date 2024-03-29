import java.util.ArrayList;
import java.util.List;
//This it's a example of a generic class

//NOTA.- Generic type Parameters.-
//you can have more than one type parameter, so we could do T1, T2, T3
//like public class Team<T1, T2, T3>
//but convention says to use S,U,V in that order like
//public class Team<T,S,U>{

//A few letters are reserved for special use cases.
//The most commonly used type parameter identifiers are:
// * E for Element (used extensively by the java Collection Framework)
// * K for key (used for mapped types)
// * N for number
// * T for type
// * V for Value
// * S,U,V etc for 2nd, 3rd, 4th types

//****************************************************************************
//This extends keyword doesn't have the same meaning as extends, when it's used in a class declaration
//Nota.- This isn't saying our type T extends Player, although it could
//this is saying the parameterized type T, has to be a Player, or a subtype of Player

record Affiliation(String name, String type, String countryCode){
    @Override
    public String toString() {
        return name +"( "+type+" in "+countryCode+")";
    }
}
public class Team<T extends Player, S> {
    private String teamName;
    List<T> teamMembers= new ArrayList<>();
    private int totalWins=0;
    private int totalLosses=0;
    private int totalTies=0;
    private S affiliation;

    public Team(String teamName) {
        this.teamName = teamName;
    }
    public Team(String teamName, S affiliation) {
        this.teamName = teamName;
        this.affiliation=affiliation;
    }


    public void addTeamMember(T t) {
        if (!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }
    public void listTeamMembers(){
            System.out.println(teamName+" Lista:");
            System.out.println(affiliation==null ? "":" AFFILIATION: "+affiliation);
            //System.out.println(teamMembers);
            for(T t:teamMembers){
                System.out.println(t.name());
            }
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
