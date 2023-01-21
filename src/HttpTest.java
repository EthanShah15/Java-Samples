import javax.net.ssl.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.X509Certificate;
import java.io.IOException;
import org.json.*;


public class HttpTest {

    public static void main(String[] args) throws Exception {
        String zipCode = readInputString("Please enter your zip code");
        String output = readURL("https://ziptasticapi.com/" + zipCode);
        System.out.println(output);
        String city = queryJSON(output , "city");
        System.out.println(city);
    }

    public static String readURL(String urlInput) throws Exception {
        TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        }};
        // Install the all-trusting trust manager
        final SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        // Create all-trusting host name verifier
        HostnameVerifier allHostsValid = new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };

        // Install the all-trusting host verifier
        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);

        URL url = new URL(urlInput);
        URLConnection con = url.openConnection();
        final Reader reader = new InputStreamReader(con.getInputStream());
        final BufferedReader br = new BufferedReader(reader);
        String line = "";
        String content = "";
        while ((line = br.readLine()) != null) {
            content = content + line;
        }
        br.close();
        return content;
    }

    public static String readInputString(String prompt) throws IOException {
        System.out.println(prompt);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String input = reader.readLine();
        return input;
    }

    public static String queryJSON(String jsonString , String path){
        JSONObject obj = new JSONObject(jsonString);
        //String pageName = obj.getJSONObject("pageInfo").getString("pageName");
        return obj.getString(path);
    }
}
