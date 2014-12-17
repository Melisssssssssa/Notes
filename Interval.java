import java.util.*;
import java.io.*;

public class Interval implements Comparable{
    private int low, high;
    private staticRandom rnd = new Random();
    private static int numIntervals = 0;
    

    public Interval(int l, int h){
	low = l;
	high = h;
	numIntervals = numIntervals + 1;
    }
    
    public Interval (){
	int l = rnd.nextInt(100);
	int h = l + 1 + rnd.nextInt(100);
	low = l;
	high= h;
	numIntervals = numIntervals + 1;
	
    }
    public int compareto(Object other){
	Interval o = (Interval)other;
	
	if(this.low==other.low){
	    return this.high - o.high;
	}else {
	    return this.low - o.low;
	}

    }
    public String toString(){
	String s = "[" +low +","+high+ "]";
	return s;
	

    }
    public static void printstuff(){
	System.out.println("Stuff");
    }
}
    
    public static void main(String[] args){
	Interval ival = new Interval();
	ival.printstuff();
	printstuff();
	Interval.printstuff();

	Interval[] a = new Interval[10];
	for(int i = 0; i < a.length; i++){
	    a[i] = new Interval;
	}

	
	System.out.prtintln(Arrays.toString(a));

	String[] sa = "hello", "frog", "zoo","absolute", "bagel"};
	Array.sort(sa)
	System.out.println(Arrays.toString(sa));

       
    }
    
    
	
