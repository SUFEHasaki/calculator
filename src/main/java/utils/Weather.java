package utils;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.util.Arrays;
import java.util.regex.*;

public class Weather {
    private static final String IPPATTERN="\"ip\":\"(.*?)\"";
    private static final String DISTRICT="\"city\":\"(.*?)市?\".*\"county\":\"(.*?)区?\"";
//    private WebClient webClient = new WebClient(BrowserVersion.CHROME);
    public static void main(String[] args) {
        getIP();
    }
    public static void getIP(){
        try{
            WebClient webClient = new WebClient(BrowserVersion.CHROME);
            webClient.getOptions().setCssEnabled(false); // 取消 CSS 支持
            webClient.getOptions().setJavaScriptEnabled(false); // 取消 JavaScript支持
            webClient.getOptions().setThrowExceptionOnScriptError(false);
//            webClient
            String content = webClient.getPage("http://vv.video.qq.com/checktime?otype=json").getWebResponse().getContentAsString();
//            System.out.println(page.asText());
            Matcher matcher = Pattern.compile(IPPATTERN).matcher(content);
            if (matcher.find()){
                content=webClient.getPage(String.format("http://restapi.amap.com/v4/ip?ip=%s&key=0113a13c88697dcea6a445584d535837", matcher.group(1))).getWebResponse().getContentAsString();
                matcher = Pattern.compile(DISTRICT).matcher(content);
                if(matcher.find()){
//                    System.out.println(matcher.group(1)+ matcher.group(2));
//                    System.out.println(new String (String.format("https://free-api.heweather.net/s6/weather/now?location=%s,%s&key=2289d83e1f26405392712a2d136ce95b", matcher.group(2), matcher.group(1)).getBytes("unicode"),"unicode"));
                    content=webClient.getPage(new String (String.format("https://free-api.heweather.net/s6/weather/now?location=%s,%s&key=2289d83e1f26405392712a2d136ce95b", matcher.group(2), matcher.group(1)).getBytes(),"utf-8")).getUrl().toString();
                    System.out.println(content);
                }
            }
        }catch (IOException ignored){

        }


    }
}
//https://restapi.amap.com/v4/ip?ip=112.36.235.55&key=0113a13c88697dcea6a445584d535837
//https://free-api.heweather.net/s6/weather/now?location=%E4%B9%8C%E9%B2%81%E6%9C%A8%E9%BD%90&key=2289d83e1f26405392712a2d136ce95b