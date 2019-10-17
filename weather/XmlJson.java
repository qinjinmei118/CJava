package weather;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

import java.util.Map;
public class XmlJson {

	public static String jsonxml(String json) throws JSONException {
        JSONObject jsonObj = null;
		try {
			jsonObj = new JSONObject(json);
		} catch (JSONException e) {
			e.printStackTrace();
		}
        return "<?xml version=\"1.0\" encoding=\"GBK>" + XML.toString(jsonObj) + "</xml>";
    }
	public void xmltoJson(String xml) {  
		
		XMLSerializer xmlSerializer = new XMLSerializer();  
		 
        JSON json = xmlSerializer.read(xml); 
        System.out.println("-----------------xml转换为json--------------------------");
        System.out.println(json.toString(2)); 
	} 
	public void ToXml(String str) throws JSONException {
	
		String xml = jsonxml(str);
		System.out.println("--------------------json转换为xml-----------------------");
        System.out.println(xml);
	}

	
}
