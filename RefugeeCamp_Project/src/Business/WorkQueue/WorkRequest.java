/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private int count;
    private String refugeeIds;
    private ArrayList<String> subscribedEmails;

    public String getRefugeeIds() {
        return refugeeIds;
    }

    public void setRefugeeIds(String refugeeIds) {
        this.refugeeIds = refugeeIds;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public WorkRequest(){
        requestDate = new Date();
        subscribedEmails = new ArrayList<>();
    }

    public ArrayList<String> getSubscribedEmails() {
        return subscribedEmails;
    }

    public void setSubscribedEmails(ArrayList<String> subscribedEmails) {
        this.subscribedEmails = subscribedEmails;
    }

    
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    @Override
    public String toString(){
        return this.message;
    }
}
