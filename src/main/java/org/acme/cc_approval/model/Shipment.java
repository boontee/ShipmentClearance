package org.acme.cc_approval.model;


public class Shipment {
    private Customer sender; 
    private Customer receiver;
    private Item item;
    String status;
    
    public Shipment(Customer sender, Customer receiver, Item item, String status) {
        this.sender = sender;
        this.receiver = receiver;
        this.item = item;
        this.status = status;
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
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Shipment [sender=" + sender + ", receiver=" + receiver + ", item=" + item + ", status=" + status + "]";
    }
    
}
    
