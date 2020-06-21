package com.example.dilkhushmihirsen.pillzapp6; /**
 * Created by dilkhushmihirsen on 18/05/19.
 */
import java.text.SimpleDateFormat;
import java.util.Date;


public class Medicine {
    private String medname, desc, status;
    private int sno;
    private String pattern = "dd-MM-yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    String Sdate = simpleDateFormat.format(new Date());
    String Cdate = simpleDateFormat.format(new Date());
    String Edate = simpleDateFormat.format(new Date());


    public Medicine() {
    }

    public Medicine(int sno,String medname, String desc, String Cdate, String Sdate, String Edate, String status) {
        this.sno = sno;
        this.medname = medname;
        this.desc = desc;
        this.Cdate = Cdate;
        this.Sdate = Sdate;
        this.Edate = Edate;
        this.status = status;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getMedname() {
        return medname;
    }

    public void setMedname(String medname) {
        this.medname = medname;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String Cdate() {
        return Cdate;
    }

    public void setCdate(String Cdate) {
        this.Cdate = Cdate;
    }

    public String Sdate() {
        return Sdate;
    }

    public void setSdate(String Sdate) {
        this.Sdate = Sdate;
    }

    public String Edate() {
        return Edate;
    }

    public void setEdate(String Edate) {
        this.Edate = Edate;
    }


}
