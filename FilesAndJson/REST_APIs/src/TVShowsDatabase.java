import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class TVShowsDatabase {

    String baseUrl = "http://api.tvmaze.com/search/";

//Create a method getURLSource that returns a String and gets a URL object as a parameter. It should also throw an exception.
//This method should read the open stream of the url and concatenate it in a String. It should then return that String.
            public JsonObject getURLSource(String tvShow) {
                String str = "";
                try{
                    URL url = new URL(baseUrl + "i=" + tvShow );
                    Scanner urlScanner = new Scanner(url.openStream());
                    while(urlScanner.hasNextLine()){
                        str += urlScanner.nextLine();
                    }
                    urlScanner.close();
                }catch(MalformedURLException e){
                    System.out.println("oop" + e.getMessage());
                }catch(IOException e) {
                    System.out.println("Could not read webpage" + e.getMessage());
                }
                str = "{\"result\":" + str + '}';
                JsonObject content =  Jsoner.deserialize(str, new JsonObject());
                return content;
            }

    public JsonObject getShowsByName(String name) throws Exception
    {
        //Getting the things ready to connect to the web
/* TODO 
You have to use the url to retrieve the contents of the website. 
This will be a String, but in JSON format. Use the auxiliary function you created above. */

        URL url = new URL(baseUrl+"shows?q="+name);
        String str = "";
        try {
            Scanner urlScanner = new Scanner(url.openStream());
            while (urlScanner.hasNextLine()) {
                str += urlScanner.nextLine();
            }
            urlScanner.close();
        } catch (MalformedURLException e) {
            System.out.println("oops " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Could not read webpage " + e);
        }
        str = "{\"result\":" + str + '}';
        JsonObject content =  Jsoner.deserialize(str,new JsonObject());
        return content;

        /* TODO
Remember to return a JSON object.*/
    }


    public JsonObject getPeopleInShows(String query) throws Exception
    {
        //Getting the things ready to connect to the web
        /* TODO 
Fill in this data type (Object) */
        URL url = new URL(baseUrl+"people?q="+query);

       /* TODO
Read the information coming from the web
 */
        String str = "";
        try {
            Scanner urlScanner = new Scanner(url.openStream());
            while (urlScanner.hasNextLine()) {
                str += urlScanner.nextLine();
            }
            urlScanner.close();
        } catch (MalformedURLException e) {
            System.out.println("oops " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Could not read webpage " + e);
        }
        str = "{\"result\":" + str + '}';
        JsonObject content = (JsonObject) Jsoner.deserialize(str,new JsonObject());
        return content;

        /* TODO
return the appropriate result.
*/
    }


    public String formatShowAsString(JsonObject doc){
        /* TODO 
This should return a String with each show in four fields:
Name:the name of the show
Link:the link to the show
rating average:The rating average of teh show, and 
summary, the summary of the show.*/
        String results = "";
        JsonArray show = (JsonArray) doc.get("result");

        for(int i =0; i < show.toArray().length; i++){

            JsonObject test = (JsonObject) show.get(i);
            JsonObject showData = (JsonObject) test.get("show");

            String name = (String ) showData.get("name");
            String url = (String ) showData.get("url");

            JsonObject ratingData = (JsonObject) showData.get("rating");
            BigDecimal ratingAvg = (BigDecimal) ratingData.get("average");

            String summary = (String ) showData.get("summary");

            results += "Name:" + name +"\n" +
                    "Link:" + url + "\n" +
                    "Rating average:" + ratingAvg +"\n" +
                    "Summary:" + summary +"\n";

        }
        return results;
    }

    public void saveShows(String text, String outfile){
        /* TODO
Given a String with some text in it, write that text to a file. 
The name of the file is given in outfile */
        try (FileOutputStream fos = new FileOutputStream(outfile)){
            fos.write(text.getBytes());
        }catch(FileNotFoundException fnf){
            System.out.println("No file");
        }catch(IOException e){
            e.printStackTrace();
        }

            }

}
