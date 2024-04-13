package exception;

import java.io.IOException;

public class ThrowsEx 
{
	public void display() throws IOException 
	{
		throw new IOException("Exception detected");
	}

	public static void main(String[] args) throws IOException {
		ThrowsEx obj = new ThrowsEx();
		obj.display();
		System.out.println("hello");
	}

}
