package com.tj.urbanplanning.tree.Util;

import io.swagger.models.auth.In;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.io.*;
import java.net.*;
import java.util.Random;

public class HttpUtil {

    /**
     * 根据字符串解析当前风向
     * @param str 风向文字字符串
     * @return 当前风向代表的数字
     */
    private String getWindDirection(String str){
        Integer windD = 0;
        if(str.equals("北风")){
            windD = 0;
        }
        else if(str.equals("东北风")){
            windD = 2;
        }
        else if (str.equals("东风")) {
            windD = 4;
        }
        else if (str.equals("东南风")) {
            windD = 6;
        }
        else if (str.equals("南风")) {
            windD = 8;
        }
        else if (str.equals("西南风")) {
            windD = 10;
        }
        else if (str.equals("西风")) {
            windD = 12;
        }
        else if (str.equals("西北风")) {
            windD = 14;
        }
        return windD.toString();
    }

    /**
     * 根据字符串解析当前风速
     * @param str 风速文字字符串
     * @return 当前风速平均值
     */
    private String getWindSpeed(String str){
        Double windS = 0.0;
        int tmp = Integer.valueOf(str.replace("≤", ""));
        if(tmp==0){
            windS = 0.1;
        }
        else if(tmp==1){
            windS = 0.9;
        }
        else if (tmp == 2) {
            windS = 2.45;
        }
        else if (tmp == 3) {
            windS = 4.4;
        }
        else if (tmp == 4) {
            windS = 6.7;
        }
        else if (tmp == 5) {
            windS = 9.35;
        }
        else if (tmp == 6) {
            windS = 12.3;
        }
        return windS.toString();
    }

    /**
     * 发送http请求
     * @param url 目标url
     * @param param 请求参数，格式为 "key1=value1&key2=value2"
     * @return 请求结果的JSONObject
     */
    private JSONObject sendHttpsReq(String url, String param){
        PrintWriter out = null;
        BufferedReader in = null;
        JSONObject jsonObject = null;
        String result = "";
        String return_result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流（设置请求编码为UTF-8）
            out = new PrintWriter(new OutputStreamWriter(conn.getOutputStream(), "UTF-8"));
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 获取请求返回数据（设置返回数据编码为UTF-8）
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
            jsonObject = JSONObject.fromObject(result);
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return jsonObject;
    }

    /**
     * 执行http请求，获取上海市黄浦区当前风向风速
     * @return 获取到的风向和风速字符串，用","隔开
     */
    public String getWeather(){
        String url = "https://restapi.amap.com/v3/weather/weatherInfo";
        String param = "key=489c8ba007fb194672858a5072e909ae&city=310101";
        String result = "";
        JSONObject jsonObject = sendHttpsReq(url, param);
        System.out.println("获取的天气信息：");
        System.out.println(jsonObject);
        if (jsonObject.getString("status").equals("1")){
            System.out.println("---------successfully get weather api:");
            JSONObject datas = jsonObject.getJSONArray("lives").getJSONObject(0);
            String distric = datas.getString("city");
            String windD = getWindDirection(datas.getString("winddirection"));
            String windS = getWindSpeed(datas.getString("windpower"));
            result = result + windD + ","+windS;
        }
        return result;
    }

    /**
     * 执行http请求，向服务器发送当前风向风速数据
     * @param speed 风速字符串
     * @param dir 风向字符串
     */
    public void sendWind(String speed, String dir){
        String url = "https://www.wf-bldgtech.com/wdata_check2.php";
        String param = "id=WFupload&pw=m23dwq&nid=7&wspeed="+speed+"&direct="+dir;
        JSONObject jsonObject = sendHttpsReq(url, param);
        System.out.println(jsonObject);
    }

}