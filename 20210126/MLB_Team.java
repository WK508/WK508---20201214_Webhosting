
public class MLB_Team {

	public static void main(String[] args) {
		Team t = new Team();
		t.setName("LA ������");
		t.setYear1("1884");
		t.setYear2("1955, 1959, 1963, 1965, 1981, 1988, 2020");
		t.setDivision("NL WEST DIVISION");
		
		System.out.println(Team.category);
		System.out.println("���� : " + t.getName());
		System.out.println("â�ܳ⵵ : " + t.getYear1());
		System.out.println("��³⵵ : " + t.getYear2());
		System.out.println("�Ҽ� ����/���� : " + t.getDivision());
		System.out.println("--------------------------------------------------------------------");
		
		Team tt = new Team();
		tt.setName("�������ý��� ���̾���");
		tt.setYear1("1883");
		tt.setYear2("1905, 1921, 1922, 1933, 1954, 2010, 2012, 2014");
		tt.setDivision("NL WEST DIVISION");
		
		System.out.println(Team.category);
		System.out.println("���� : " + tt.getName());
		System.out.println("â�ܳ⵵ : " + tt.getYear1());
		System.out.println("��³⵵ : " + tt.getYear2());
		System.out.println("�Ҽ� ����/���� : " + tt.getDivision());
		System.out.println("--------------------------------------------------------------------");
	}

}

class Team {
	static String category = "���ųθ��� �������� ���̹�";
	
	private String name;
	private String year1;
	private String year2;
	private String division;
	public static String getCategory() {
		return category;
	}
	public static void setCategory(String category) {
		Team.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear1() {
		return year1;
	}
	public void setYear1(String year1) {
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
	
	
}
