package com.brainacad.prj2.StringParser;

public class CommandParser implements ICommandParser {
    private String data;
    private String command;
    private String userInput;
    private IInputValidator validator;
    private static String separator = " ";

    public CommandParser(String userInput,IInputValidator validator) {
//        tryParse(input);
        this.validator = validator;
        this.userInput = userInput;
        this.data = "";
        this.command = "";
    }

    @Override
    public boolean tryParse() throws ValidationExaption {
            validator.validate();
            String[] stringArray = userInput.split(separator);
            this.command = new String(stringArray[0]);
            if (stringArray.length > 1) {
                this.data = new String(stringArray[1]);
            }
            return true;
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
