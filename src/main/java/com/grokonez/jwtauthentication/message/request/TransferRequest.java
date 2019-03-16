/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grokonez.jwtauthentication.message.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 *
 * @author smile
 */
public class TransferRequest {
    @NotBlank
    @Size(min=3, max = 60)
    private String senderAccountNo;
    
    @NotBlank
    @Size(min=3, max = 60)
    private String receiverAccountNo;

    private double amount;

    public String getSenderaccountno() {
        return senderAccountNo;
    }

    public void setSenderaccountno(String senderaccountno) {
        this.senderAccountNo = senderAccountNo;
    }

    public String getReceiveraccountno() {
        return receiverAccountNo;
    }

    public void setReceiveraccountno(String receiverAccountNo) {
        this.receiverAccountNo = receiverAccountNo;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
    
}
