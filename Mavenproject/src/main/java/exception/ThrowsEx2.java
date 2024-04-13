package exception;

import java.io.IOException;

public class ThrowsEx2 
{
	
		public void display() throws IOException
		{
			throw new IOException("Exception detected");
		}
		public void show()throws IOException
		{
			display();
		}
		public void prin()
		{
			try
			{
				show();
				
			}
			catch (IOException e)
			{
				System.out.println("hai exception");
			}
		}

		public static void main(String[] args) throws IOException {
			ThrowsEx2 obj = new ThrowsEx2();
			obj.prin();
			
			System.out.println("hello");
		}

	
	}


