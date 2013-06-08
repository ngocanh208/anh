/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

/**
 *
 * @author NgocAnh
 */
@Entity
public class bangmoi extends Model{
    
    public String address;
    public int age;
}
