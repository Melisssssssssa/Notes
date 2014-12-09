import java.util.*;
import java.io.*;

public class Interval{
    private int low, high;
    private Random rnd = new Random();
    

    public Interval(int l, int h){
	low = l;
	high = h;
    }
    
    public Interval (){
	int l = rnd.nextInt(100);
	int h = l + 1 + rnd.nextInt(100);
    }
    public String toString(){
	String s = "[" +low +","+high+ "]";
	return s;
	

    }

    public static void main(String[] args){
	
