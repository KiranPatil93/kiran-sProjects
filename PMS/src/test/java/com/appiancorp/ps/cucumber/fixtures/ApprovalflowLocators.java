package com.appiancorp.ps.cucumber.fixtures;

public class ApprovalflowLocators {
    public static String menuTasks = "div[data-testid='VirtualNavigationHeaderLayout-tabs-wrapper'] li[title='Tasks'] a[class='VirtualNavigationMenuTab_HELIUM---nav_tab_clickable_container elements---global_a']";
public static String homepage ="div[data-testid='VirtualNavigationHeaderLayout-tabs-wrapper'] li[title='Home Page'] a[class='VirtualNavigationMenuTab_HELIUM---nav_tab_clickable_container elements---global_a']";
    public static String searchfield = "//input[contains(@class,'TextInput---text TextInput---align_start')]";
    public static String titleLink = "//a[contains(text(),'Project Creation')]";

    public static String actionBtn = "//table[@class='PagingGridLayout---table PagingGridLayout---scrollable PagingGridLayout---striped PagingGridLayout---distribute']/tbody/tr[1]//td[14]//button";
public static String cancelprojectBtn = "//span[contains(text(),'Cancel Project')]//parent::li";
public static String statusOfProject = "//tbody/tr[1]/td[13]/div[1]/p[1]";
public static String updateprojBtn = "//ul[@class='MenuWidget---listbox MenuWidget---relative MenuWidget---default_direction MenuWidget---inMenuLayout MenuWidget---inRecordActionWidget']//child::li[1]";

public static String removePM = "//a[@class='PickerTokenWidget---remove elements---global_a']";
public static String txtPM ="//input[@class='PickerWidget---picker_input PickerWidget---placeholder']";
public static String linkProjectID = "//table[@class='PagingGridLayout---table PagingGridLayout---scrollable PagingGridLayout---striped PagingGridLayout---distribute']/tbody/tr[1]//td[2]//a";
    public static String btnUpdateProject = "//button[@class='Button---btn Button---default_direction Button---small appian-context-first-in-list Button---icon_start']";
public static  String dropProjectFunctionality = "//span[contains(text(),'Technology')]//preceding::span[contains(text(),'Project Functionality')]//following::div[1]";
    public static  String dropProjectTechnology = "//span[contains(text(),'Technology')]//following::div[2]";
    public static  String actionUpdateDemandStatus = "//table[@class='PagingGridLayout---table PagingGridLayout---scrollable PagingGridLayout---striped']/tbody/tr[1]/td[16]//button";
    public static  String UpdateDemandStatus ="//span[contains(text(),'Update Demand')]//ancestor::li";
    public static  String changeStatus ="//table[@class='EditableGridLayout---table EditableGridLayout---striped EditableGridLayout---distribute EditableGridLayout---scrollable']/tbody/tr[1]/td[11]//div[1]";
    public static  String tooltipstatus ="//table[@class='PagingGridLayout---table PagingGridLayout---scrollable PagingGridLayout---striped']/tbody/tr[1]/td[15]//span";



}
