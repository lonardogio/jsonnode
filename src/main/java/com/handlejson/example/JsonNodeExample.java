package com.handlejson.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class JsonNodeExample {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        for(int i=0; i<3; i++) {
            Employee employee1 = new Employee("Gioacchino"+i, "Lonardo"+i);
        }
        Company company = new Company("Company Test", "Address Test", employees);
        //ObjectMapper provides functionality for reading and writing JSON
        ObjectMapper mapper = new ObjectMapper();
        //<T> T	convertValue(Object fromValue, Class<T> toValueType)
        //Convenience method for doing two-step conversion from given value, into instance of given value type
        JsonNode node = mapper.convertValue(company, JsonNode.class);
        JsonPrettyPrinter.jsonPrettyPrint(node);
    }
}
