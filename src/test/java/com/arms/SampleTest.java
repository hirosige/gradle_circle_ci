package com.arms;

import com.arms.app.project.Sample;
import org.junit.Test;
import static org.junit.Assert.*;

public class SampleTest {
    @Test
    public void testAdd() {
        assertEquals(2, Sample.add(1, 2));
    }
}