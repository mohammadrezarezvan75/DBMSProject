/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rezvan.entity.Student;

/**
 *
 * @author MRZR
 */
public class Student {

        
    private int id;
    private String name;
    private String Lastname;
    private String Address;
    private int Age; 
    private int PassedUnits; 
    private int UnPassedUnits; 
    

    public Student() {
    }

    
    public Student(String name, String Lastname,String Address) {
        this.name = name;
        this.Lastname = Lastname;
    }

    public Student(int id, int Age, int PassedUnits,int UnPassedUnits ) {
        this.id = id;
        this.Age = Age;
        this.PassedUnits = PassedUnits;
        this.UnPassedUnits = UnPassedUnits;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getlastname() {
        return Lastname;
    }

    public void setlastname(String lastname) {
        this.Lastname=lastname;
    }
    
      public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address=Address;
    }
    
      public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age=Age;
    }
    
     public int getPaasedUnits() {
        return PassedUnits;
    }

    public void setPassedUnits(int PassedUnits) {
        this.PassedUnits=PassedUnits;
    }
    
     public int getUnPaasedUnits() {
        return UnPassedUnits;
    }

    public void setUnPassedUnits(int UnPassedUnits) {
        this.UnPassedUnits=UnPassedUnits;
    }
    
    
    
 }

