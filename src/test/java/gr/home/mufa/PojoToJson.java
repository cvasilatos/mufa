package gr.home.mufa;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PojoToJson {
    public static void main(String[] args) {
        Employee employee = new Employee("Chris", "admin");

        Gson gsonBuilder = new GsonBuilder().create();
        String jsonFromPojo = gsonBuilder.toJson(employee);

        System.out.println(jsonFromPojo);
    }
}
