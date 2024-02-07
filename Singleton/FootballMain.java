
public class FootballMain {
    public static void main(String[] args) {

        TeamDatabase database = TeamDatabase.getInstance();


        TeamData teamData = new TeamData();
        teamData.setTeamName("Real Madrid");
        teamData.setCoach("Carlo Ancelotti");

        database.saveTeamData(teamData);

        TeamData retrievedData = database.getTeamData();
        System.out.println("Team Name: " + retrievedData.getTeamName());
        System.out.println("Coach: " + retrievedData.getCoach());
    }
}