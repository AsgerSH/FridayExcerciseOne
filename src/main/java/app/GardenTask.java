package app;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
public class GardenTask extends Task {
    private String gardenLocation;

    // Udkommenteret fordi jeg nu er gået over til at bruge builder

//    public GardenTask(String title, String description, LocalDate dueDate, String gardenLocation) {
//        super(title, description, dueDate);
//        this.gardenLocation = gardenLocation;
//    }
}
