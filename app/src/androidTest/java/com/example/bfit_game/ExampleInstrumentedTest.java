package com.example.bfit_game;

import android.content.Context;
import android.os.Bundle;

//import androidx.test.InstrumentationRegistry;
import androidx.test.core.app.*;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Bundle appContext = InstrumentationRegistry.getArguments();

        assertEquals("com.example.bfit_game", appContext.getString("STOPPED"));
    }
}