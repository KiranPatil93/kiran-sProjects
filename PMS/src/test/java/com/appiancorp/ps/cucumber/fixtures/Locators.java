package com.appiancorp.ps.cucumber.fixtures;

import com.appiancorp.ps.automatedtest.fixture.BaseFixture;

public class Locators extends BaseFixture {

    public static String dropOpportunity = "(//div[@class='DropdownWidget---dropdown_value DropdownWidget---placeholder'])[1]";
public static String dropServiceType = "(//div[@class='DropdownWidget---dropdown_value DropdownWidget---placeholder'])[1]";
public static String pmname ="input[class='PickerWidget---picker_input PickerWidget---placeholder']";
public static String suggetionPMname = "div[class='SideBySideGroup---side_by_side SideBySideGroup---default_direction SideBySideGroup---middle'] div[class='SideBySideItem---flex_item SideBySideItem---default_direction appian-context-last-in-list']";
public static String dropprojFeature = "//span[contains(text(),'Project Functionality')]//following::div[2]";
public static String dropTechnology = "//span[contains(text(),'Technology')]//following::div[2]";
public static String sowCheckbox = "//td[@role='cell']//div[@class='CheckboxGroup---choice_pair']//input";
public static String dropDemandType = "//span[text()='Investment']//parent::div";
public static String dropdemand ="//table[@class='EditableGridLayout---table EditableGridLayout---striped EditableGridLayout---distribute EditableGridLayout---scrollable']/tbody/tr[2]/th[1]/div[1]/div";
public static String dropShore = "//table[@class='EditableGridLayout---table EditableGridLayout---striped EditableGridLayout---distribute EditableGridLayout---scrollable']/tbody/tr/td[1]/div";
public static String dropLocation = "//table[@class='EditableGridLayout---table EditableGridLayout---striped EditableGridLayout---distribute EditableGridLayout---scrollable']/tbody/tr/td[2]/div";
public static String droptechnology = "//table[@class='EditableGridLayout---table EditableGridLayout---striped EditableGridLayout---distribute EditableGridLayout---scrollable']/tbody/tr/td[3]/div";
public static String dropRole = "//table[@class='EditableGridLayout---table EditableGridLayout---striped EditableGridLayout---distribute EditableGridLayout---scrollable']/tbody/tr/td[4]/div";
public static String txtdemandpercentage = "//table[@class='EditableGridLayout---table EditableGridLayout---striped EditableGridLayout---distribute EditableGridLayout---scrollable']/tbody/tr/td[7]/div/input[@type='text']";
public static String documentLink = "//a[@class='LinkedItem---standalone_richtext_link LinkedItem---inLightBackground LinkedItem---inRecordActionWidget elements---global_a elements---inLightBackground Tooltip---tooltip-target Tooltip---tooltip-pinned Tooltip---tooltip-pinned-right Tooltip---tooltip-out-of-bounds Tooltip---tooltip-out-of-bounds-bottom Tooltip---tooltip-element-attached-top Tooltip---tooltip-target-attached-bottom']";
public static String btnCloseDocLink = "//button[@class='RecordActionModalWidget---modal_close_control']";
public static String txtprojectID = "//table[@class='PagingGridLayout---table PagingGridLayout---scrollable PagingGridLayout---striped PagingGridLayout---distribute']/tbody/tr[1]/td[2]//p";
public static String txtprojectName = "//table[@class='PagingGridLayout---table PagingGridLayout---scrollable PagingGridLayout---striped PagingGridLayout---distribute']/tbody/tr[1]/td[3]//p";
public static String dropSelectProject ="//div[contains(@class,'DropdownWidget---dropdown_value DropdownWidget---placeholder')]";
public static String employeeCheckbox ="(//input[@type='checkbox'])[2]";
public static String demandRole ="//table[@class='PagingGridLayout---table PagingGridLayout---scrollable PagingGridLayout---striped']/tbody/tr/td[4]";
public static String projDetails = "//div[@class='TagItem---tag appian-context-first-in-list appian-context-last-in-list']";

    public static String agreeChbox = "//input[@type='checkbox']";
    public static String updatefunction = "(//span[contains(text(),'Project Functionality')]//following::div[2])[2]";

public static String deliveryLocation = "//div[@class='DropdownWidget---dropdown_value DropdownWidget---placeholder']";

public static String verify_StartDate = "//label[text()='End Date']//preceding::input[@class='DatePickerWidget---text DatePickerWidget---align_start DatePickerWidget---input_width DatePickerWidget---inSideBySideItem']";

public static String verify_EndDate ="//label[text()='End Date']//following::input[@class='DatePickerWidget---text DatePickerWidget---align_start DatePickerWidget---input_width DatePickerWidget---inSideBySideItem']";

public static String sow = "//span[contains(text(),'NEXT')]//ancestor::button";
public static String sfsdemands = "//a[contains(text(),'Add New Demand')]";
public static String opportunity ="//label[contains(text(),'Opportunity Name')]//following::input";
public static String contractingChannel = "(//div[@class='DropdownWidget---dropdown_value DropdownWidget---placeholder'])[2]";
public static String entityAddress = "//span[contains(text(),'Contracting Entity Address ')]//following::div[2]";
public static String selectDomain = "(//div[@class='DropdownWidget---dropdown_value DropdownWidget---placeholder'])[2]";
public static String selectLeadType = "//span[contains(text(),'Lead Type')]//following::div[4]";
public static String confidientiallyCoverage = "//span[contains(text(),'Confidentiality Coverage')]//following::div[4]";
public static String demandStartDate = "//label[contains(text(),'Tentative End Date')]//preceding::input[1]";
    public static String demandEndDate = "//label[contains(text(),'Tentative End Date')]//following::input[1]";
    public static String selectCurrency = "//span[contains(text(),'Currency')]//following::div[4]";
    public static String contractValues = "//input[@class='TextInput---text TextInput---align_start']";
    public static String selectShore = "(//div[@class='DropdownWidget---dropdown_value DropdownWidget---placeholder'])[2]";
    public static String selectLocation = "(//div[@class='DropdownWidget---dropdown_value DropdownWidget---placeholder'])[2]";
    public static String StartDate = "(//input[@placeholder='dd/mm/yyyy'])[3]";
    public static String endClient ="(//div[@class='DropdownWidget---dropdown_value DropdownWidget---placeholder DropdownWidget---inSideBySideItem'])[1]";
    public static String enterDays = "//label[text()='Days']//following::input[1]";
    public static String enterDailyRate = "//label[text()='Days']//following::input[3]";
    public static String demandCurrency = "(//div[@class='DropdownWidget---dropdown_value DropdownWidget---placeholder'])[2]";
public static String addDemandLink = "//a[@class='LinkedItem---standalone_richtext_link elements---global_a Tooltip---tooltip-target Tooltip---tooltip-element-attached-top Tooltip---tooltip-target-attached-bottom Tooltip---tooltip-element-attached-center Tooltip---tooltip-target-attached-center']";
}
