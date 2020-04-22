package utils;

import com.alibaba.fastjson.JSONObject;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.util.Arrays;
import java.util.regex.*;

public class Weather extends Thread{
    private static final String IP="\"ip\":\"(.*?)\"";
    private static final String DISTRICT="\"lng\":(.*?),.*\"lat\":(.*?)}";
    private static final String WEATHER="\"location\":\"(.*?)\".*?:\"(.*?)\".*\"loc\":\"(\\d{4}-\\d{2}-\\d{2}).*\"comf\".*?txt\":\"(.*?)\".*\"sport\".*?txt\":\"(.*?)\".*\"uv\".*?txt\":\"(.*?)\"";
//    private WebClient webClient = new WebClient(BrowserVersion.CHROME);
//    public static void main(String[] args) {
//        getWeather();
//    }
    public static JSONObject getWeather(){
        try{
            WebClient webClient = new WebClient(BrowserVersion.CHROME);
            webClient.getOptions().setCssEnabled(false); // 取消 CSS 支持
            webClient.getOptions().setJavaScriptEnabled(false); // 取消 JavaScript支持
            webClient.getOptions().setThrowExceptionOnScriptError(false);
//            webClient
            String content = webClient.getPage("http://vv.video.qq.com/checktime?otype=json").getWebResponse().getContentAsString();
            Matcher matcher = Pattern.compile(IP).matcher(content);
            if (matcher.find()){
                content=webClient.getPage(String.format("http://restapi.amap.com/v4/ip?ip=%s&key=0113a13c88697dcea6a445584d535837", matcher.group(1))).getWebResponse().getContentAsString();
                matcher = Pattern.compile(DISTRICT).matcher(content);
                if(matcher.find()){
                    content=webClient.getPage(String.format("https://free-api.heweather.net/s6/weather/lifestyle?location=%s,%s&key=2289d83e1f26405392712a2d136ce95b", matcher.group(1), matcher.group(2))).getWebResponse().getContentAsString();
                    matcher = Pattern.compile(WEATHER).matcher(content);
                    if (matcher.find()){
                        JSONObject weather=new JSONObject();
                        weather.put("location",matcher.group(1));
                        weather.put("city",matcher.group(2));
                        weather.put("date",matcher.group(3));
                        weather.put("comf",matcher.group(4));
                        weather.put("sport",matcher.group(5));
                        weather.put("uv",matcher.group(6));
//                        System.out.println(weather);
                        return weather;
                    }
                }
            }
        }catch (IOException e){
           return null;
        }
     return null;
    }
}
//https://restapi.amap.com/v4/ip?ip=112.36.235.55&key=0113a13c88697dcea6a445584d535837
//https://free-api.heweather.net/s6/weather/now?location=%E4%B9%8C%E9%B2%81%E6%9C%A8%E9%BD%90&key=2289d83e1f26405392712a2d136ce95b