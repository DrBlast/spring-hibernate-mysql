package org.krams.tutorial.controller;

import org.junit.Test;

import java.util.Random;

/**
 * Created by DrBlast on 30.05.2016.
 */
public class tes {

    @Test
    public void tst(){
        Random rnd = new Random();
        System.out.println(rnd.nextInt(36)+1);
    }
}
