/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package landing;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

/**
 *
 * @author Track Computers
 */
public class accessoryManager extends credientials{
     List<String> Employee = new ArrayList<String>();
    
     List <String>Accessory=new ArrayList<String>(); 
 public  String showData()
 {
  System.out.print("here"+getname());
  return getname();
 }
 public static List fillData(List<String> Employee)
 {
      Employee.add(0,"ali,ali1,+123456788");
      return Employee;
 }
  public static List fillaData(List<String> Accessory)
 {
     Accessory.add(0,"car,laptop,stationery,");
     return Accessory;
 }
}
