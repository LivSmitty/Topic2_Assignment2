/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

/**
 *
 * @author scott_000
 */
public class VideoBean {
    

    long startTime;
    long endTime;
    double quality;


    public VideoBean(){

    }

    public VideoBean(double x, long y) {
        quality = x;
        startTime = y;
        endTime = System.nanoTime();

    }
    
    public double GetElapsedTime(){
        double elapsedTime = (endTime - startTime)/1000000000.0;
        return elapsedTime;
    }

}
