package javaapplication15;

import java.util.Date;

public class Collage {

    public boolean trash;
    public long time;

    public void Collage(Photo[] p, int n) {
        
        Date date = new Date();
        this.time = date.getTime();

        for (int i = 0; i < n; i++) {

            // Collage = Collage + P[i] The photos stick together and eventually form a collage
        }

    }

    public void show(Animation a) {

        //show Collage
    }
    
     public void delet(Collage c) {
        Date date = new Date();
        long t = date.getTime();
        trash = true;

        //add collage to trash
        while (t - time < 1296000000) {//15 day

            t = date.getTime(); //Time at any moment

        }

        //delete collage from trash
    }

}
