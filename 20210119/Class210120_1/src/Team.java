public class Team {
   
	private String team;
	private int year1;
	private String year2;
	private String division;
	
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
	 public void showTeamInfo() {
		 System.out.println("���� : " + team);
		 System.out.println("â�ܳ⵵ : " + year1);
		 System.out.println("��³⵵ : " + year2);
		 System.out.println("�Ҽ� ����/���� : " + division);
		 System.out.println("----------------------------------------------------------------");
	
   }
}
