package avrotools;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = avrotools.ImmutableUser.class)
@JsonDeserialize(as = avrotools.ImmutableUser.class)
public interface User {
    String getUsername();

    String getPassword();

    double getAge();

    @Value.Default
    default double getNewField() {
        return 42.0;
    }
}
