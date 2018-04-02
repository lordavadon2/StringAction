package com.brainacad.prj2.Commands;

import java.util.HashMap;

public class CommandExit implements ICommandExec {
    HashMap<String, Integer> executionInfo;

    public CommandExit(HashMap<String, Integer> executionInfo) {
        this.executionInfo = executionInfo;
    }

    @Override
    public String exec() {
        return CommandNames.reverse + ": " + this.executionInfo.get(CommandNames.reverse)
                + CommandNames.reverse +  ": " + this.executionInfo.get(CommandNames.remove)
                + CommandNames.reverse +  ": " + this.executionInfo.get(CommandNames.replace);
    }
}
