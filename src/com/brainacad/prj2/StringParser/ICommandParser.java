package com.brainacad.prj2.StringParser;

public interface ICommandParser {
    boolean tryParse() throws ValidationExaption;
    String getCommand();
    String getData();
}
