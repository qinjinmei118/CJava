package weather;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import org.json.JSONException;

import java.util.HashMap;
import java.util.Date;
import java.io.UnsupportedEncodingException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;

public class searchWeather {
	 public static void main(String[] args) throws JSONException {
		System.out.println("xmlת��Ϊjson��ʽ��������������Ҫ��ѯ�����ĳ��У���:jingzhou");	
	    Scanner input=new Scanner(System.in);	
	    String name=input.next();
	    String requestUrlXml = "http://flash.weather.com.cn/wmaps/xml/"+name+".xml";//�ӿڵ�ַ
	    System.out.println(result("9787208061644",requestUrlXml));//��������
	    XmlJson ww=new XmlJson();
	    /* ww.xmltoJson("<?xml version=\"1.0\" encoding=\"GBK\" ?>"
               + "<o><bz></bz><ok>222</ok></o>");*/
	    /*����xmlת��Ϊjson�Ľ��*/
	    ww.xmltoJson(result("9787208061644", requestUrlXml));
	    
	    
	    System.out.println("jsonת��Ϊxml��ʽ��������������Ҫ��ѯ�����ĳ��У���:��������");
	    Scanner inputJson=new Scanner(System.in);
	    String nameJson=inputJson.next();
	    try {
	            initCityMap("cities.txt");
	    } catch (IOException e) {
	         System.out.println("���ļ�����");
	         return;
	    }
	    String code=cityToCode(nameJson);
	    String requestUrlJson = "http://www.weather.com.cn/data/cityinfo/"+code+".html";//�ӿڵ�ַ
	    System.out.println(result("9787208061644",requestUrlJson));//��������
	   /* ����jsonת��Ϊxml�Ľ��*/
	    ww.ToXml(result("9787208061644", requestUrlJson));
	    }
	 
	    public static String get_time() {//����ʱ��
	        Date d = new Date();//�������ڶ���
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");//������ʽ������
	        String s = sdf.format(d);//�������ַ���      
	        return s;
	    }
	    public static String result(String ISBN,String requestUrl) throws JSONException {
	        Map params = new HashMap();//params���ڴ洢�������ݵĲ�
	        params.put("isbn", ISBN);//������
	        params.put("showapi_appid", "94112");//showapi_appid��ֵ
	        params.put("showapi_timestamp", get_time());  //���ʱ��
	        params.put("showapi_sign", "9a147a4260a34c9c8c4b304decf73744"); //����ǩ����###���������ǩ������������ĸ������Ŀ���
	        String s = httpRequest(requestUrl, params);//����httpRequest���������������Ҫ���������ַ���������������
	        return s;
	    }

	    private static String httpRequest(String requestUrl, Map params) {
	    	//buffer���ڽ��ܷ��ص�����
	        StringBuffer buffer = new StringBuffer();
	        try {
	        	//����URL���������ַ����ȫ������urlencode�����������ڰ�params��Ĳ�����ȡ����
	            URL url = new URL(requestUrl+"?"+urlencode(params)); 
	            //��http����
	            HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();//����
	            httpUrlConnection.setDoInput(true);//�������Ӧ
	            httpUrlConnection.setRequestMethod("GET");
	            httpUrlConnection.connect();
	            //�������
	            InputStream inputStream = httpUrlConnection.getInputStream();
	            InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"utf-8");//����
	            BufferedReader bufferedReader =  new BufferedReader(inputStreamReader);
	            //��bufferReader��ֵ���ŵ�str��->buffer
	            String str = null;
	            while((str = bufferedReader.readLine()) != null) {
	                buffer.append(str);
	            }
	            //�ر�bufferReader��������
	            bufferedReader.close();
	            inputStreamReader.close();
	            inputStream.close();
	            //�Ͽ�����
	            httpUrlConnection.disconnect();

	        } catch(Exception ex) {
	            ex.printStackTrace();
	        }
	        //�����ַ���
	        return buffer.toString();
	    }

	    public static String urlencode(Map<String, Object> data) {//Map-һ�����ϰ���һ���ַ�����һ������

	    	//��map��Ĳ�������� showapi_appid=xxx&showapi_sign=xxx&�����ӣ�����api����ĸ�ʽ
	        StringBuilder sb = new StringBuilder();//��data�����ݷ���sb��
	        for(Map.Entry i : data.entrySet()) {
	            try {
	                sb.append(i.getKey()).append("=").append(URLEncoder.encode(i.getValue() + "", "UTF-8")).append("&");
	            } catch (UnsupportedEncodingException ex) {
	                ex.printStackTrace();
	            }
	        }
	        return sb.toString();
	    }
	    private static HashMap<String, String> cityMap = new HashMap<String, String>();

	    // ��ʼ��cityMap
	    public static void initCityMap(String fileName) throws IOException {
	        File file = new File(fileName);
	        BufferedReader reader = null;
	        try {
	            reader = new BufferedReader(new FileReader(file));
	            String tempString = null;
	            while ((tempString = reader.readLine()) != null) {
	                String[] strs = tempString.split("\t");
	                if (cityMap.get(strs[0]) == null) {
	                    cityMap.put(strs[0], strs[1]);
	                } else {
	                    System.out.println("���м��ظ�  " + strs[1]);
	                }
	            }
	            reader.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	            throw e;
	        } finally {
	            if (reader != null) {
	                try {
	                    reader.close();
	                } catch (IOException e1) {
	                    throw e1;
	                }
	            }
	        }
	    }

	    // ��������������س��д���
	    public static String cityToCode(String cityName) {
	        String code = cityMap.get(cityName);//ƥ��
	        if (code == null) {
	            return null;
	        }
	        return code;
	    }
  
	}
	



