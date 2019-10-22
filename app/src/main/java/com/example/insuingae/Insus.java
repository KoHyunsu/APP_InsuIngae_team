package com.example.insuingae;

import com.google.android.material.chip.Chip;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Insus {
    private String title;
    private String publisher;
    private ArrayList<String> contents;
    private Date createdAt;
    private boolean iscompleted;
    private ArrayList<String> tags;

    public Insus(String title, String publisher, ArrayList<String> contents, ArrayList<String> tags, Date createdAt) {
        this.title = title;
        this.publisher = publisher;
        this.contents = contents;
        this.createdAt = createdAt;
        this.tags = tags;
        this.iscompleted = false;
    }

    public Insus(String title, String publisher, ArrayList<String> contents, Date createdAt, ArrayList<String> tags, boolean iscompleted) {
        this.title = title;
        this.publisher = publisher;
        this.contents = contents;
        this.tags = tags;
        this.createdAt = createdAt;
        this.iscompleted = iscompleted;
    }
    public Map<String, Object> getInsus(){
        Map<String, Object> docData = new HashMap<>();
        docData.put("title",title);
        docData.put("contents",contents);
        docData.put("publisher",publisher);
        docData.put("createdAt",createdAt);
        docData.put("iscompleted", iscompleted);
        docData.put("tags", tags);
        return  docData;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isIscompleted() {
        return iscompleted;
    }

    public void setIscompleted(boolean iscompleted) {
        this.iscompleted = iscompleted;
    }
}