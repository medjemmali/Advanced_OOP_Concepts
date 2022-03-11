import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;

import java.math.BigDecimal;

public class Database {
        private JsonObject db;

    public Database(JsonObject data){
        this.db = data;
    }

    public JsonObject getRestaurant(String name){
        /* TODO
Complete this method as specified. */
        JsonArray rest = (JsonArray) db.get("restaurants");
        int id = 0;
        for(int i =0; i < rest.toArray().length; i++){
            JsonObject test = (JsonObject) rest.get(i);
            if(test.get("name").equals(name)){
                id = i;
                break;
            }
        }
        return (JsonObject) rest.get(id);
    }

    public double getAvgReviews(String name){
        /* TODO
Complete this method as specified.
 The previous method may be of help.
*/
        JsonObject restData = getRestaurant(name);
        JsonArray reviews = (JsonArray) restData.get("reviews");
        double rating =  0;
        for(int i =0; i < reviews.toArray().length; i++){
            JsonObject test = (JsonObject) reviews.get(i);
            BigDecimal temp = (BigDecimal) test.get("rating");
            rating += temp.doubleValue();
        }
        return rating/reviews.size();
    }
}
