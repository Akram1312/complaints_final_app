package com.example.akramkhan.complaint_trial;


import android.os.Parcel;
import android.os.Parcelable;

import java.util.Comparator;

/**
 * Created by Akram Khan on 27-03-2016.
 */
public class complaint{
    private String colorcode;   /*this is to set the color code so as to get the difference among complaints esaily*/
    private int id;

    public String getColorcode() {
        return colorcode;
    }

    public void setColorcode(String colorcode) {
        this.colorcode = colorcode;
    }

    private String complaintid;
    private String complaintTitle;
    private String time;
    private int upvotes;
    private int downvotes;

    public int getUpVotes() {
        return upvotes;
    }

    public void setUpvotes(int votes) {
        this.upvotes = votes;
    }


    public int getDownVotes() {
        return downvotes;
    }

    public void setDownVotes(int votes) {
        this.downvotes = votes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public complaint(int id,String complaintid,String complaintTitle,String time,int upvotes,int downvotes,String colorcode){
        this.id=id;
        this.upvotes = upvotes;
        this.downvotes = downvotes;
        this.complaintid=complaintid;
        this.complaintTitle=complaintTitle;
        this.time=time;
        this.colorcode=colorcode;
    }

    public String getComplaintid() {
        return complaintid;
    }

    public void setComplaintid(String complaintid) {
        this.complaintid = complaintid;
    }

    public String getComplaintTitle() {
        return complaintTitle;
    }

    public void setComplaintTitle(String complaintTitle) {
        this.complaintTitle = complaintTitle;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
/*customized comparator to use during sorting of the complaints votes comparator takes
* the total count of upvotes and downvotes to sort*/
class VotesComparator implements Comparator<complaint>{
    @Override
    public int compare(complaint lhs, complaint rhs) {
        return rhs.getUpVotes()+rhs.getDownVotes()-lhs.getUpVotes()-lhs.getDownVotes();
    }
}
/*uses the time variable part of the complaint type to sort*/
class TimeComparator implements Comparator<complaint>{
    @Override
    public int compare(complaint lhs, complaint rhs) {
        return rhs.getTime().compareToIgnoreCase(lhs.getTime());
    }
}


