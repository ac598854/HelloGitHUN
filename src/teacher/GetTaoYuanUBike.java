package teacher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GetTaoYuanUBike {
	public static final String UBIKE_URL = "https://data.tycg.gov.tw/api/v1/rest/datastore/a1b4714b-3b75-4ff8-a8f2-cc377e4eaa0f?format=json";
	
	
	public static void main(String[] args) throws IOException {
		URL url = new URL(UBIKE_URL);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
			InputStream is = con.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String data;
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}
			
			br.close();
			isr.close();
			is.close();
		} else {
			System.out.println("Failed...");
		}
	
	}
}
