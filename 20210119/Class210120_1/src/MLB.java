
public class MLB {

	public static void main(String[] args) {
		Team1 s = new Team1();
		s.setTeam("BOSTON REDSOX");
		s.setYear1(1901);
		s.setYear2("1903, 1912, 1915, 1916, 1918, 2004, 2007, 2013, 2018");
		s.setDivision("AL EAST DIVISION");
		
		System.out.println(Team1.category);
		System.out.println("���� : " + s.getTeam());
		System.out.println("â�ܳ⵵ : " + s.getYear1());
		System.out.println("��³⵵ : " + s.getYear2());
		System.out.println("�Ҽ� ����/���� : " + s.getDivision());
		System.out.println("---------------------------------------------------------------------------");
		
		Team1 ss = new Team1();
		ss.setTeam("SAINT LOUIS CARDINALS");
		ss.setYear1(1882);
		ss.setYear2("1926, 1931, 1934, 1942, 1944, 1946, 1964, 1967, 1982, 2006, 2011");
		ss.setDivision("NL CENTRAL DIVISION");
		
		System.out.println(Team1.category);
		System.out.println("���� : " + ss.getTeam());
		System.out.println("â�ܳ⵵ : " + ss.getYear1());
		System.out.println("��³⵵ : " + ss.getYear2());
		System.out.println("�Ҽ� ����/���� : " + ss.getDivision());
		System.out.println("---------------------------------------------------------------------------");

	}

}

class Team1 {
	static String category = "2013 ����ø��� ������";
	
	private String team;
	private int year1;
	private String year2;
	private String division;
	public static String getCategory() {
		return category;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getYear1() {
		return year1;
	}
	public void setYear1(int year1) {
		this.year1 = year1;
	}
	public String getYear2() {
		return year2;
	}
	public void setYear2(String year2) {
		this.year2 = year2;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public static void setCategory(String category) {
		Team1.category = category;
	}
	
	
}
