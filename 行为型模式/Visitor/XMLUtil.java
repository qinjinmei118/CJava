package com.qjm.Visitor;

import java.io.File;



import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
 
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;


public class XMLUtil {
	  //�÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ������
    public static Object getBean() {
    	try {
		DocumentBuilderFactory dfactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=dfactory.newDocumentBuilder();
		Document doc;
		doc=builder.parse(new File("E:\\eclipse\\sheji_Mode\\src\\com\\qjm\\Visitor\\config.xml "));
		//��ȡ�����������ı��ڵ�
		 NodeList n1 = doc.getElementsByTagName("className");
         Node classNode = n1.item(0).getFirstChild();

         String cName = classNode.getNodeValue();
		//ͨ����������ʵ�����󲢽��䷵��
		Class c = Class.forName(cName);
		Object obj= c.newInstance();
		return obj;
    	}catch(Exception e) {
    		e.printStackTrace();
    		return null;
    	}
	}
}
