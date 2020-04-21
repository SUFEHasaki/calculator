package utils;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.util.regex.*;

public class Weather {
    private static final String PATTERN="\"ip\":\"(.*?)\"";
    private WebClient webClient = new WebClient(BrowserVersion.CHROME);
    public static void main(String[] args) {
        System.out.println(getIP());
    }
    public static String getIP(){
        try{
            WebClient webClient = new WebClient(BrowserVersion.CHROME);
            webClient.getOptions().setCssEnabled(false); // 取消 CSS 支持
            webClient.getOptions().setJavaScriptEnabled(false); // 取消 JavaScript支持
            HtmlPage page = webClient.getPage("http://vv.video.qq.com/checktime?otype=json");
            Pattern pattern=Pattern.compile(PATTERN);
            Matcher m = pattern.matcher(page.asText());
            page=webClient.getPage(String.format("https://restapi.amap.com/v4/ip?ip=%s&key=0113a13c88697dcea6a445584d535837", m.group(1)));
            if (m.find()){
                return m.group(1);
            }
        }catch (IOException ignored){

        }
        return "";

    }
}
//https://restapi.amap.com/v4/ip?ip=112.36.235.55&key=0113a13c88697dcea6a445584d535837
//https://free-api.heweather.net/s6/weather/now?location=%E4%B9%8C%E9%B2%81%E6%9C%A8%E9%BD%90&key=2289d83e1f26405392712a2d136ce95b