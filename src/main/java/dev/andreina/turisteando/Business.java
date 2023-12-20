package dev.andreina.turisteando;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "cities")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Business {
    @Id
    private ObjectId id;
    private String municipality;
    private String phoneNumber;
    private String businessName;
    private String hours;
    private String location;
    @DocumentReference
    private List<String> reviewIds;
}
