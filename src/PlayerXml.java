import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PlayerXml {
	public static Object getBean() {
        try {
            //创建文档对象
            DocumentBuilderFactory Factory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=Factory.newDocumentBuilder();
            Document doc=builder.parse(new File("/eclipse/Factory/config.xml"));
            System.out.println(doc);
            //获取包含图表类型的文本节点
            NodeList nlList= ((Document) doc).getElementsByTagName("className");
            Node classNode=nlList.item(0).getFirstChild();
            String cName=classNode.getNodeValue();
            
            //通过类名生成实例对象并返回
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
