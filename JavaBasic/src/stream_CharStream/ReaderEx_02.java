package stream_CharStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx_02 {
	public static void main(String[] args) {
		
		Reader rd = new InputStreamReader(System.in);
		Writer wt = new OutputStreamWriter(System.out);
		
		char[] cbuf = new char[1024];
		int len = -1; 
		try {
			while((len=rd.read(cbuf))!=-1) {
				wt.write(cbuf,0,len);
			}
			wt.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(wt!=null)	wt.close();
				if(rd!=null)	rd.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
