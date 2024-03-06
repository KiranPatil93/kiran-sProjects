package PageObjects;

import Utility.DriverFactory;
import Utility.ExcelReader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class excelFilePage {
    public static String Excelpath = "C:\\Users\\KiranPatil\\IdeaProjects\\ConnectedOnboarding\\src\\test\\resources\\ExcelData\\customerSummary.xlsx";
    public static String customerName;
    public static String name;
    public static String domicile;
    public static String IncoroporateDate;
    public static String endDate;
    public static String launchDate;
    public static String seedingDate;
    public static String appointmentDate;
    public static String authorisationDate;
    public static String investmentDate;
    public static String notificationDate;
    public static String firstClosingDate;
    public static String filingDate;
    public static String regulatedFunds;
    public static String approvalDate;
    public static String acknowledgementDate;
    public static String cCode;
    public static String clientApprovalDate;
    public static String InterimApprovalDate;
    public static String finalApprovalDate;
    public static String generalPartnerDate;
    public static String passportingDate;
    public static String cnBoardApprovalDate;
    public static String finalcnBoardApprovalDate;
    public static String preMarketingApprovalDate;
    public static String contactType;
    public static String position;
    public static String delegate;
    public static String relation;
    public static String delegateType;

    public excelFilePage(){

        PageFactory.initElements(DriverFactory.driver, this);
    }


    public void readExcelFile (String sheetname, Integer rownumber) throws IOException, InvalidFormatException {
        ExcelReader reader = new ExcelReader();
        List<Map<String, String>> testdata = reader.getData(Excelpath, sheetname);
        customerName = testdata.get(rownumber).get("customerName");
        name = testdata.get(rownumber).get("name");
        domicile = testdata.get(rownumber).get("domicile");
        IncoroporateDate =testdata.get(rownumber).get("IncoroporateDate");
        endDate = testdata.get(rownumber).get("endDate");
        launchDate = testdata.get(rownumber).get("launchDate");
        seedingDate = testdata.get(rownumber).get("seedingDate");
        appointmentDate = testdata.get(rownumber).get("appointmentDate");
        authorisationDate = testdata.get(rownumber).get("authorisationDate");
        investmentDate = testdata.get(rownumber).get("investmentDate");
        notificationDate = testdata.get(rownumber).get("notificationDate");
        firstClosingDate = testdata.get(rownumber).get("firstClosingDate");
        filingDate = testdata.get(rownumber).get("filingDate");
        regulatedFunds = testdata.get(rownumber).get("regulatedFunds");
        approvalDate = testdata.get(rownumber).get("approvalDate");
        acknowledgementDate = testdata.get(rownumber).get("acknowledgementDate");
        cCode = testdata.get(rownumber).get("cCode");
        clientApprovalDate = testdata.get(rownumber).get("clientApprovalDate");
        InterimApprovalDate = testdata.get(rownumber).get("InterimApprovalDate");
        finalApprovalDate = testdata.get(rownumber).get("finalApprovalDate");
        generalPartnerDate = testdata.get(rownumber).get("generalPartnerDate");
        passportingDate = testdata.get(rownumber).get("passportingDate");
        cnBoardApprovalDate = testdata.get(rownumber).get("cnBoardApprovalDate");
        finalcnBoardApprovalDate = testdata.get(rownumber).get("finalcnBoardApprovalDate");
        preMarketingApprovalDate = testdata.get(rownumber).get("preMarketingApprovalDate");
        contactType = testdata.get(rownumber).get("contactType");
        position = testdata.get(rownumber).get("position");
        delegate = testdata.get(rownumber).get("delegate");
        relation = testdata.get(rownumber).get("relation");
        delegateType = testdata.get(rownumber).get("delegateType");

    }

























































}
