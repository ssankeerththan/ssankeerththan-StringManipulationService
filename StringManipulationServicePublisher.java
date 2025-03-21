import javax.xml.ws.Endpoint;

public class StringManipulationServicePublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8080/StringManipulationService";
        Endpoint.publish(url, new StringManipulationServiceImpl());
        System.out.println("Service is running at: " + url + "?wsdl");
    }
}
