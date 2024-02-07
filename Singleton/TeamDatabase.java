
public class TeamDatabase {
    private static TeamDatabase instance;
    private TeamData teamData;

    private TeamDatabase() {
    }

    public static synchronized TeamDatabase getInstance() {
        if (instance == null) {
            instance = new TeamDatabase();
        }
        return instance;
    }

    public void saveTeamData(TeamData data) {
        this.teamData = data;
    }

    public TeamData getTeamData() {
        return teamData;
    }
}