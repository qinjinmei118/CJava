import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PlayerXml {
	public static Object getBean() {
        try {
            //�����ĵ�����
            DocumentBuilderFactory Factory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=Factory.newDocumentBuilder();
            Document doc=builder.parse(new File("/eclipse/Factory/config.xml"));
            System.out.println(doc);
            //��ȡ����ͼ�����͵��ı��ڵ�
            NodeList nlList= ((Document) doc).getElementsByTagName("className");
            Node classNode=nlList.item(0).getFirstChild();
            String cName=classNode.getNodeValue();
            
            //ͨ����������ʵ�����󲢷���
            Class<?> c=Class.forName(cName);
            Object obj=c.newInstance();
            return obj;
            
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        }
	}

}
