package com.rick.cput;

import junit.framework.Assert;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rick on 06-Mar-16.
 */
public class floatPracTest {

    @Test
    public void testAddFloat() throws Exception {

        float a = 3.2f;
        float b = 2.2f;


        float actual =   floatPrac.addFloat(a,b);

        //float expected = 5.4f;
        assertThat(actual, Is.is(5.4f));

    }
}