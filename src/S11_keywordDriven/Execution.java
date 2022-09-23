package S11_keywordDriven;

public class Execution {
    public static void main(String[] args) {
        String path="D:\\software_selenium\\KDF.xlsx";
        ReadXL.setexecel(path, 0);
        for(int i=1;i<=5;i++) {
            String keywords=ReadXL.readdata(i, 3);

            if(keywords.equals("Open_browser")) {
                Action_keywords.Open_bowser();

            }
            else if(keywords.equals("Open_URL")) {
                Action_keywords.Open_URL();
            }
            else if(keywords.equals("Enter_data")) {
                Action_keywords.Enter_data();
            }
            else if(keywords.equals("Click_login")) {
                Action_keywords.Click_login();
            }
            else if(keywords.equals("Homepage")) {
                Action_keywords.Homepage();
            }
        }
    }
}
