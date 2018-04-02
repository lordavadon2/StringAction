package com.brainacad.prj2.Commands;

import java.util.HashMap;

public class CommandFactory{

    static HashMap<String, Integer> countExecution = new HashMap<String, Integer>();
    static {
        countExecution.put(CommandNames.reverse,0);
        countExecution.put(CommandNames.replace,0);
        countExecution.put(CommandNames.remove,0);
    }
    static void incrimentCount(String type){
       if (countExecution.containsKey(type)){
        countExecution.put(type, countExecution.get(type).intValue() + 1);
       }
    }

    public static int geetCountExec(String type){
        return countExecution.get(type).intValue();
    }

    public static ICommandExec create(String type, String data){
        incrimentCount(type);
        if (CommandNames.reverse.equals(type)){

            return new CommandReverse(data);
        }
        if (CommandNames.replace.equals(type)){
            return new CommandReplace(data);
        }
        if (CommandNames.remove.equals(type)){
            return new CommandRemove(data);
        }
        if (CommandNames.exit.equals(type)){
            return new CommandExit(countExecution);
        }
        throw new UnsupportedOperationException();
    }
}
