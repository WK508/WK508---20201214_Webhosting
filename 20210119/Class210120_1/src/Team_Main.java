
public class Team_Main {

	public static void main(String[] args) {
		Team s = new Team();
		s.setTeam("LA DODGERS");
		s.setYear1(1884);
		s.setYear2("1955, 1959, 1963, 1965, 1981, 1988, 2020");
		s.setDivision("NL WEST DIVISION");
		s.showTeamInfo();
		
		Team s2 = new Team();
		s.setTeam("OAKLAND ATHLETICS");
		s.setYear1(1901);
		s.setYear2("1910, 1911, 1913, 1929, 1930, 1972, 1973, 1974, 1989");
		s.setDivision("AL WEST DIVISION");
		s.showTeamInfo();

	}

}
