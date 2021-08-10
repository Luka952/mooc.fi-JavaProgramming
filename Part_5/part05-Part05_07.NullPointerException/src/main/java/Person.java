/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukab
 */
public class Person {
    private String name;
    private int y;
    
    public Person(String name){
        this.name=name;
    }
    
    public int growOlder(){
        return this.y+1;
    }
}
