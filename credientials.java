/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package landing;

/**
 *
 * @author Track Computers
 */
public class credientials {
 private String name;
    private String Email;
    private String Password;
    private int phoneNumber;
    private String sign;
    public String getname()
  {
      return name;
  }
  public void setname(String n)
  {
      this.name=n;
  }   
  public String getPassword()
  {
     //Password="nida";
      return Password;
  }
  public void setPassword(String p)
  {
      this.Password=p;
  }   
  public String getEmail()
  {
      return Email;
  }
  public void setEmail(String e)
  {
      this.Email=e;
  }   
   public int getphoneNumber()
  {
      return phoneNumber;
  }
  public void setphoneNumber(String pn)
  {
      this.Email=pn;
  }   
   public String getsign()
  {
      return sign;
  }
  public void setsign(String s)
  {
      this.sign=s;
  }   
}
