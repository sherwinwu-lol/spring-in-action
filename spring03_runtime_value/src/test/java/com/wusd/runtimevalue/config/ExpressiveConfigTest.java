package com.wusd.runtimevalue.config;

import com.wusd.runtimevalue.BlankDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ExpressiveConfig.class})
public class ExpressiveConfigTest {
    @Autowired
    BlankDisc blankDisc;

    @Test
    public void disc() {
        blankDisc.play();
    }
}