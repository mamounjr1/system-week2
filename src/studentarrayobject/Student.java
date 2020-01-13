/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentarrayobject;

/**
 *
 * @author Mamou
 */
public class Student {
    
    private int id;
    private String name;
    private String programName;
    private String address;
    
    //create default constructor
    public Student(){
        
    }
    
    public Student(int id, String name, String programName){
        this.id = id;
        this.name = name;
        this.programName = programName;
       
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the programName
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * @param programName the programName to set
     */
    public void setProgramName(String programName) {
        this.programName = programName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    
    
    
    
}
