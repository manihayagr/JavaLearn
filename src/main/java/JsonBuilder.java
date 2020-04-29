import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonBuilder {
    public static void main(String[] args) {

//  Create a Json Object named car
        JSONObject cars = new JSONObject();
        System.out.println(cars.toString());

//    Create a KV pair with empty JSON object   and add to Cars Json
        cars.put("car", new JSONObject());
        System.out.println(cars.toString());

//    Create a Json Array and add it to cars
        JSONArray brands = new JSONArray();
        brands.add("BMW");
        brands.add("AUDI");
        System.out.println(brands);


//  Add Brands to car
        cars.put("brands", brands);
        System.out.println(cars.toString());

//  Add the above to another JSON object (cars)
        JSONObject jsono = new JSONObject();
        jsono.put("cars", cars);
        System.out.println(jsono.toString());

//        Add them in a JsonArray
        JSONArray jArray = new JSONArray();
        jArray.add(jsono);

       System.out.println(jArray);

    }
}
