package com.brainacad.prj2.Commands;

import java.util.HashMap;

public class CommandFactory{

    public static ICommandExec create(String type, String data)throws IllegalArgumentException{
        CommandNames command = CommandNames.valueOf(type);
        command.incCounter();
        switch (command){
            case REVERSE:
                return new CommandReverse(data);
            case REPLACE:
                return new CommandReplace(data);
            case REMOVE:
                return new CommandRemove(data);
            case EXIT:
                return new CommandExit();
            default:
                return null;
        }

    }
}
