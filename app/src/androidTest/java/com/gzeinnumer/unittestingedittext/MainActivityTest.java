package com.gzeinnumer.unittestingedittext;

import android.view.View;
import android.widget.EditText;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    private MainActivity mainActivity = null;

    private EditText edNama;

    @Before
    public void setUp() throws Exception {
        mainActivity = mainActivityActivityTestRule.getActivity();
    }

    @Test
    public void testEditText() {
        edNama = mainActivity.findViewById(R.id.ed_nama);

        assertNotNull(edNama);
        mainActivity.runOnUiThread(new Runnable() {
            public void run() {
                edNama.setText("hello zein");
                assertEquals("hello zein", edNama.getText().toString()); // true
//                assertEquals("hello zein1", edNama.getText().toString()); // false

            }
        });

    }

    @After
    public void tearDown() throws Exception {
        mainActivity = null;
    }
}