package com.example.mediaescolar;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void calcularMediaDosBimestres() {
        MainActivity mainActivity = new MainActivity();
        assertEquals((Float)9F, mainActivity.calcularMedia(10F, 8.5F, 10F, 7.5F));
    }
}