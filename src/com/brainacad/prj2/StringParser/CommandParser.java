package com.brainacad.prj2.StringParser;

public class CommandParser implements ICommandParser {
    private String data;
    private String command;
    private static String separator = " ";

    public CommandParser(String input) {
        parse(input);
    }

    @Override
    public void parse(String userInput) {
        if (null == userInput) {
            return;
        }
        String[] stringArray = userInput.split(separator);
        this.command = new String(stringArray[0]);
        if (stringArray.length > 1) {
            this.data = new String(stringArray[1]);
        }
    }

    @Override
    public String getCommand() {
        return this.command;
    }

    @Override
    public String getData() {
        return this.data;
    }
}
