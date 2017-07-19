package work.model.service;

public class TeamService {
	public static TeamService instance = new TeamService();

	private TeamService() {

	}

	public static TeamService getInstance() {
		return instance;
	}
}