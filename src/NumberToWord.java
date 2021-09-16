
public class NumberToWord {
	int res[] = new int[4];
	int temp[] = new int[4];
	int t;
	int a = 3;
	String s = "";
	String sn = "";
	int tn;

	String word[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
public static void main(String[] args) {
			NumberToWord n = new NumberToWord();
		n.convert(6702);
	}

	public void convert(int number) {

		tn = number;

		while (number > 0) {
			int rem = number % 10;
			res[t] = rem;
			t++;
			number = number / 10;
			}

		for (int j = 0; j < res.length; j++) {
			temp[a] = res[j];
			a--;
		}
		for (int j = 0; j < temp.length; j++) {
			s = s + word[temp[j]] + "-";
		}
		System.out.println(tn);
		int l=s.length();
		s=s.substring(0, l-1);
		System.out.println("converted ==> " + s);
	}

}
