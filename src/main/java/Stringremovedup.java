import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Stringremovedup {

	public static void main(String[] args) {
		String[] name = { "A","A","B","B","C" };
		String []name1= {"A,B,C,D,D,E,E"};
		Set<String> setname = new TreeSet<>(Arrays.asList(name1));

		System.out.println(setname);

	}

}
