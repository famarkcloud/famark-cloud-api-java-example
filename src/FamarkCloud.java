import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class FamarkCloud {
    public Reader postData(String urlSuffix, String body, String sessionID) throws IOException {
        URL url = new URL("https://www.famark.com/host/api.svc/api" + urlSuffix);
        URLConnection con = url.openConnection();
        HttpURLConnection http = (HttpURLConnection) con;
        http.setRequestMethod("POST");
        http.setDoOutput(true);
        byte[] out = body.getBytes(StandardCharsets.UTF_8);
        http.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        http.setRequestProperty("Content-Length", Integer.toString(out.length));
        if (sessionID != null && sessionID.length() > 0) {
            http.setRequestProperty("SessionId", sessionID);
        }
        try (DataOutputStream os = new DataOutputStream(http.getOutputStream())) {
            os.write(out);
        }
        String errorMessage = http.getHeaderField("ErrorMessage");
        if (errorMessage != null && errorMessage.length() > 0) {
            System.err.println(errorMessage);
            return null;
        }
        return new BufferedReader(new InputStreamReader(http.getInputStream(), "UTF-8"));
    }
}
