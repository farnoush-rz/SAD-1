package javaapplication15;

import java.util.Date;

public class Animation {

    public boolean trash;
    public long time;

    public void Animation(Photo[] p, int n) {

        Date date = new Date();
        this.time = date.getTime();

        for (int i = 0; i < n; i++) {

            // Animation = Animation + P[i] The photos are connected one by one
        }

    }

    public void show(Animation a) {

        //show Animation
    }

    public void delet(Animation animation) {
        Date date = new Date();
        long t = date.getTime();
        trash = true;

        //add animation to trash
        while (t - time < 1296000000) {//15 day

            t = date.getTime(); //Time at any moment

        }

        //delete animation from trash
    }
}
