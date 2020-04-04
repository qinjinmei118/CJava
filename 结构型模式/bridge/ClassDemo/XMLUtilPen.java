package com.qjm.bridge.ClassDemo;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtilPen {
	public static Object getBean(String name) {
    	try {
		DocumentBuilderFactory dfactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=dfactory.newDocumentBuilder();
		Document doc;
		doc=builder.parse(new File("E:\\eclipse\\sheji_Mode\\src\\com\\qjm\\bridge\\config.xml "));
		//获取包含类名的文本节点
		 NodeList n1 = doc.getElementsByTagName("className");
         Node classNode = null;
         if (name.equals("color")) { 

             classNode = n1.item(0).getFirstChild(); 

         } 

         else if(name.equals("pen")){ 

             classNode = n1.item(1).getFirstChild(); 

         }  
         String cName = classNode.getNodeValue();
		//通过类名生成实例对象并将其返回
		Class c = Class.forName(cName);
		Object obj= c.newInstance();
		return obj;
    	}catch(Exception e) {
    		e.printStackTrace();
    		return null;
    	}
	}
}
