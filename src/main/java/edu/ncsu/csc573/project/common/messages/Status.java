/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ncsu.csc573.project.common.messages;

/**
 *
 * @author krishna
 */
public class Status implements IStatus{
    private int errorid;
    
    public Status(int id) {
        errorid = id;
    }
    
    public int getErrorId() {
            return errorid;
    }
}
