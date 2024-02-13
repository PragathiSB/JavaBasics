package Trial;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrow extends Exception{
	public TestThrow(String str)
	{
		super(str);
}
}
