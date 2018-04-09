package com.brainacad.prj2.Commands;

public class CommandExit implements ICommandExec {

            @Override
            public String exec () {

                StringBuilder result = new StringBuilder("");
                for (CommandNames names : CommandNames.values()){
                    result.append(names.toString() + " ");
                }
                return result.toString();
//            return CommandNames.REVERSE.toString() + " "
//                    + CommandNames.REMOVE.toString() + " "
//                    + CommandNames.REPLACE.toString();
        }

}