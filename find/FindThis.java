package bits.org.find;
 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
 
public class FindThis{
 
    public static void main(String[] args) throws Exception {
    	
        CloseableHttpClient closeableHttpClient=HttpClients.createDefault();//����Get����
        //����GET���󣬴���HttpGet���󣬲�ָ������URL
        HttpGet httpGet=new HttpGet("http://www.w3.org/Consortium/Member/List");
             //.execute��HttpUriRequest request���÷�������һ��HttpResponse�� 
        CloseableHttpResponse closeableHttpResponse=closeableHttpClient.execute(httpGet);
        //getEntity()�����ɻ�ȡHttpEntity���󣬸ö����װ�˷���������Ӧ����
        HttpEntity httpEntity=closeableHttpResponse.getEntity(); //��ȡʵ�塢��ҳ����
           //�����̬������HttpEntityת�����ַ���,��ֹ���������ص����ݴ�������,������ת����ʱ���ַ���ָ����utf-8�Ϳ�����
        String str=EntityUtils.toString(httpEntity, "utf-8");
         //�ͷ�����
        closeableHttpResponse.close();
        closeableHttpClient.close();
         
        Document document=Jsoup.parse(str); //������ҳ
         
        //����url��ҳ�µ�class��ʽΪmember������<li>�����Բ鿴Դ���뿴��ʽ
        Elements elements=document.select(".member");
        for(Element e:elements){
            System.out.println(e.text());
        }
        
        Writer write = null;
        BufferedWriter bufferedWriter = null;

        try {
            write = new FileWriter("E:\\eclipse\\JavaTest\\src\\bits\\org\\find\\result.txt");
            bufferedWriter = new BufferedWriter(write);

            for(int i=0;i<elements.size();i++){
                bufferedWriter.write(elements.get(i).text()+"\r\n");//д�뻻��
            }
            System.out.println("д����ɣ�");

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.flush();
                write.flush();
                bufferedWriter.close();
                write.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
 
}
