package com.techline.rydeshare.entities;

public class transaction {
    private String tran_id;
    private String driver_nme;
    private String pass_name;
    private String tran_date;
    private String source;
    private String destintion;
    private String amount_due;
    private String amount_paid;
    private String amount_deducted;
    private String payment_type;

    public transaction() {
    }

    public transaction(String tran_id, String driver_nme, String pass_name,
                       String tran_date, String source, String destintion,
                       String amount_due, String amount_paid, String
                               amount_deducted, String payment_type) {
        this.tran_id = tran_id;
        this.driver_nme = driver_nme;
        this.pass_name = pass_name;
        this.tran_date = tran_date;
        this.source = source;
        this.destintion = destintion;
        this.amount_due = amount_due;
        this.amount_paid = amount_paid;
        this.amount_deducted = amount_deducted;
        this.payment_type = payment_type;
    }

    public String getTran_id() {
        return tran_id;
    }

    public void setTran_id(String tran_id) {
        this.tran_id = tran_id;
    }

    public String getDriver_nme() {
        return driver_nme;
    }

    public void setDriver_nme(String driver_nme) {
        this.driver_nme = driver_nme;
    }

    public String getPass_name() {
        return pass_name;
    }

    public void setPass_name(String pass_name) {
        this.pass_name = pass_name;
    }

    public String getTran_date() {
        return tran_date;
    }

    public void setTran_date(String tran_date) {
        this.tran_date = tran_date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestintion() {
        return destintion;
    }

    public void setDestintion(String destintion) {
        this.destintion = destintion;
    }

    public String getAmount_due() {
        return amount_due;
    }

    public void setAmount_due(String amount_due) {
        this.amount_due = amount_due;
    }

    public String getAmount_paid() {
        return amount_paid;
    }

    public void setAmount_paid(String amount_paid) {
        this.amount_paid = amount_paid;
    }

    public String getAmount_deducted() {
        return amount_deducted;
    }

    public void setAmount_deducted(String amount_deducted) {
        this.amount_deducted = amount_deducted;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }
}
