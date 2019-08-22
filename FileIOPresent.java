import java.io.*;
import java.util.Scanner;


class FileIOPresent {
    public static void main (String[] args) throws IOException {

	//creates file or uses existing one
	File outFile = new File("Data.txt");
	FileOutputStream fOStream = new FileOutputStream(outFile);
	PrintWriter outStream = new PrintWriter(fOStream);

	//writes data to file
	outStream.println("On that day, mankind received a grim reminder of me! Dio!");
	outStream.println(64209);
    outStream.println(true);
    outStream.close();
    
    //This section reads the file
	File inFile = new File("Data.txt");
	BufferedReader bReader = new BufferedReader(new FileReader(inFile));
	String s, n, b;

	s = bReader.readLine();
	n = bReader.readLine();
	b = bReader.readLine();

	String str = s;
	int num = Integer.parseInt(n);
	boolean bool = Boolean.parseBoolean(b);

    
	System.out.println("Contents of File:\n");
	System.out.println(str);
	System.out.println(num);
	System.out.println(bool);
	bReader.close();
/*
	Scanner scanner = new Scanner(new File("Data.txt"));

	
	str = scanner.nextLine();
	num = scanner.nextInt();
	bool = scanner.hasNextBoolean();

	System.out.println(str);
	System.out.println(num);
	System.out.println(bool);

	scanner.close();*/

	
   }
}
