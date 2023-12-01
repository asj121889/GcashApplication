import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Main {
    public static void main(String[] args) {
        MongoClient client = MongoClients.create("mongodb+srv://admin:admin@zuitt-bootcamp.o8syqdi.mongodb.net/001gcashappapi?retryWrites=true&w=majority");

        MongoDatabase db = client.getDatabase("gcashDB");

        MongoCollection col = db.getCollection("gcashCollection");

        Document gcashDoc = new Document();
        gcashDoc.put("name", "Matt Bellamy");
        gcashDoc.put("email", "mattbellamy@mail.com");
        gcashDoc.put("mobile", "09661871435");
        gcashDoc.put("pin", 1111);
        col.insertOne(gcashDoc);

        //Document gcashDoc = new Document().append("name", "John Smith");

        //col.insertOne(gcashDoc);

    }
}
