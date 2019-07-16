/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjsf.httpreq;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author grios
 */
@ManagedBean
@ViewScoped
public class HttpReqBean {

    private static HttpURLConnection connection;
    private String urlUsr = "https://jsonplaceholder.typicode.com/users";
    private ArrayList<Users> usersList;

    public HttpReqBean() {
    }

    public void doGetUsers() {
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        try {
            URL url = new URL(urlUsr);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            connection.setRequestProperty("Accept", "application/json");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();
            //  System.out.println("status:" + status);

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }
            // System.out.println("console: " + responseContent.toString());
            parseContetnt(responseContent.toString());
        //  parseAdress(responseContent.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            connection.disconnect();
        }
    }

    public String parseContetnt(String responseContent) {
      
        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Users>>() {
        }.getType();
        ArrayList<Users> ul = gson.fromJson(responseContent, listType);
        usersList = new ArrayList<>();

        for (int i = 0; i < ul.size(); i++) {
            usersList.add(ul.get(i));
        }
        return null;


//Gson gson = new Gson();
//        Users tvi = gson.fromJson(responseContent, Users.class);
//        usersList = new ArrayList<Users>();
//        usersList.add(tvi);
//        return null;

//        Gson gson = new Gson();
//
//        Users ul = gson.fromJson(responseContent, Users.class);
//        usersList = new ArrayList<Users>();
//        usersList.add(ul);
// return null;

//        Gson gson = new Gson();
//        Type collectionType = new TypeToken<ArrayList<Users>>() {
//        }.getType();
//        ArrayList<Users> lcs = (ArrayList<Users>) new Gson()
//                .fromJson(responseContent, collectionType);
//        
//                usersList = new ArrayList<>();
//
//        for (int i = 0; i < lcs.size(); i++) {
//            usersList.add(lcs.get(i));
//        }
//        return null;
   }

    public ArrayList<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(ArrayList<Users> usersList) {
        this.usersList = usersList;
    }


  

}
