package com.appiancorp.ps.cucumber.fixtures;

import com.appiancorp.ps.automatedtest.fixture.BaseFixture;

public class Locators extends BaseFixture {

    public static String uploadButton = "button[class='Button---btn Button---default_direction Button---secondary Button---small appian-context-first-in-list appian-context-last-in-list Button---icon_start']";
public static String dropDocumentType = "//span[contains(text(),'--Select Document Type--')]//parent::div";
public static String dropEmployee ="//span[contains(text(),'--Select an Employee--')]//parent::div";
public static String inputEmployee = "//input[@class='TextInput---text TextInput---align_start']";
public static String dropYear = "//span[contains(text(),'--Select a year--')]//parent::div";
public static String dropMonth = "//span[contains(text(),'--Select a Month--')]//parent::div";
public static String btnUpload = "//input[@type='file']";
public static String txtComment = "//textarea[@class='ParagraphWidget---textarea ParagraphWidget---align_start ParagraphWidget---height_medium ParagraphWidget---hasCharacterCount ParagraphWidget---inEditableGridLayout ParagraphWidget---inModalDialogLayout ParagraphWidget---popped_out ParagraphWidget---non-scrolling']";
}
