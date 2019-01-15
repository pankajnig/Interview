package Questions;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLParserDemo {
		public static Document doc;
	
	public static void parsingXML() throws ParserConfigurationException, SAXException, IOException {
		File inputFile = new File("sample.xml");
		DocumentBuilderFactory builer = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbuilder = builer.newDocumentBuilder();
		doc = dbuilder.parse(inputFile);
        doc.getDocumentElement().normalize();
        /*System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
        NodeList nList = doc.getElementsByTagName("student1");
        Node node = nList.item(0);
        Element element = (Element)node;
        System.out.println(element.getElementsByTagName("firstname").item(0).getTextContent());
        System.out.println(nList.getLength());
        System.out.println(nList.item(1).getAttributes().item(0));
        Node childlist = nList.item(0).getFirstChild();
        System.out.println(childlist.getTextContent());
       // System.out.println(childlist.item(0).getNodeValue());
        */
	}
	
	public static void getFieldValue(String nodename,String tagname) {
		NodeList nodeList = doc.getElementsByTagName(nodename);
		Node node = nodeList.item(0);
		Element element = (Element)node;
		System.out.println("Value is  :" + element.getElementsByTagName(tagname).item(0).getTextContent());
	}
	
	
	public static void main(String args[]){
		try {
			parsingXML();
			getFieldValue("student2","marks");
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
