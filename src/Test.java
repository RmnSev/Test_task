import java.io.*;

public class Test {

	public static void main(String[] args) throws Exception {

		BufferedReader file = new BufferedReader(new FileReader("string.txt"));
		String  line = file.readLine();
		int size = line.length();
    	file.close();
    	
        FileReader file2 = new FileReader("string.txt");
        int count = 0;
        char[] c = new char[size];
        file2.read(c);
        
        	for(int i = 1; i < size; i++) {
        		if((!Character.isWhitespace(c[i-1])) && (Character.isWhitespace(c[i]))) {
        			count++;
        		}
        	}
        	if(!Character.isWhitespace(c[size-1])) {
        		count++;
        	}
        
        file2.close();
        System.out.println(count);
	}
}
