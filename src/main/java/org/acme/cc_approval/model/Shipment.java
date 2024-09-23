package org.acme.cc_approval.model;


public class Shipment {
    private Customer sender; 
    private Customer receiver;
    private Item item;
    private Boolean approved;
    
    public Shipment(Customer sender, Customer receiver, Item item, Boolean approved) {
        this.sender = sender;
        this.receiver = receiver;
        this.item = item;
        this.approved = approved;
    }
    public Customer getSender() {
        return sender;
    }
    public void setSender(Customer sender) {
        this.sender = sender;
    }
    public Customer getReceiver() {
        return receiver;
    }
    public void setReceiver(Customer receiver) {
        this.receiver = receiver;
    }
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public Boolean isApproved() {
        return approved;
    }
    public void setApproved(Boolean approved) {
        this.approved = approved;
    }
    @Override
    public String toString() {
        return "Shipment [sender=" + sender + ", receiver=" + receiver + ", item=" + item + ", approved=" + approved + "]";
    }
    
}
    
