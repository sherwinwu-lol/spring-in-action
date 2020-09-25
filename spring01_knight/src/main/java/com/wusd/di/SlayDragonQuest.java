package com.wusd.di;

import java.io.PrintStream;

/**
 * 杀死怪龙工会
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embark on quest to slay the dragon");
    }
}
