package reversestring;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Codoid Innovations";
	    StringBuilder sb = new StringBuilder();
	    sb.append(str);
	    System.out.println( "String is : "+sb);
	    sb.reverse();
	   System.out.println("Reversed string is : "+sb);
	}

	}

