/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelparser;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import model.League;
import java.util.ArrayList;

/**
 *
 * @author Jeff
 */
public class DAO {
    
    public DAO() {        
    }
    
    private final String USER_AGENT = "Mozilla/5.0";
    
    public String uploadLeagueData(String username, String password, ArrayList<League> leagues) throws Exception {
        String url = "http://localhost:8080/LigaSystem/Admin/Upload";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        String urlParameters = "leagues="+this.getJson(leagues)+"&season=2014&username="+username+"&password="+password;
        
        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();
    }
    
    private String getJson(ArrayList<League> leagues) {
        Gson gson = new Gson();
        Type collectionType = new TypeToken<ArrayList<League>>(){}.getType();
        return gson.toJson(leagues, collectionType);
    }
}
