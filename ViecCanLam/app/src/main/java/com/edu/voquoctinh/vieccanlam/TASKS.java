package com.edu.voquoctinh.vieccanlam;

import java.io.Serializable;
import java.util.HashMap;

public class TASKS implements Serializable {
    String name;
    String message;
    String priority;
    String date;

    public TASKS(String name, String message, String priority, String date) {
        this.name = name;
        this.message = message;
        this.priority = priority;
        this.date = date;
    }

    public TASKS() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    //
    public HashMap <String, String> toFirebaseObject(){
        HashMap <String, String> taskObject = new HashMap<String, String>();
        taskObject.put("name", name);
        taskObject.put("date", date);
        taskObject.put("message", message);
        taskObject.put("priority", priority);
        return taskObject;

    }
}
