package com.example.jisupark.firebaseloginapp;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by JisuPark on 2018-07-19.
 */

@IgnoreExtraProperties
public class FirebasePost {
    public String ID;
    public String name;

    public FirebasePost(){
        // Default constructor required for calls to DataSnapshot.getValue(FirebasePost.class)
    }

    public FirebasePost(String CarLicense, String name) {
        this.ID = CarLicense;
        this.name = name;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("Car License", ID);
        result.put("name", name);
        return result;
    }
}