package com.example.dilkhushmihirsen.pillzapp7;

/**
 * Created by dilkhushmihirsen on 18/05/19.
 */

public class Med {
      private int id;
      private String med,desc,status,create,start,end;

    public Med(){}

    public Med(int id, String med, String desc, String status, String create, String start, String end){
        this.id=id;
        this.create=create;
        this.med=med;
        this.desc=desc;
        this.status=status;
        this.start=start;
        this.end=end;
    }

    public  int getId() { return id; }
    public void setId(int id) {
        this.id= id;
    }

    public  String getMed() {
        return med;
    }
    public void setMed(String med) {
        this.med = med;
    }

    public  String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public  String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public  String getCreate() {
        return create;
    }
    public void setCreate(String create) {
        this.create = create;
    }

    public  String getStart() {
        return start;
    }
    public void setStart(String start) {
        this.start = start;
    }

    public  String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end = end;
    }
}
