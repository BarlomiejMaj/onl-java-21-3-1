package immutabilityTask;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Engine {
    private String type;
    private int horsePower;
    private int volume;

}
