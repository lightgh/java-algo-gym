package optionaldrills.annotationdrill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestPerson {

    @Test
    public void givenObjectSerializedThenTrueReturned() throws JsonSerializationException {
        assertEquals("1", "1");
        Person person = new Person("peterson", "kingsley", "34");
        ObjectToJsonConverter serializer = new ObjectToJsonConverter();
        String jsonString = serializer.convertToJson(person);
        assertEquals(
                "{\"personAge\":\"34\",\"firstName\":\"Peterson\",\"lastName\":\"Kingsley\"}",
                jsonString);
    }

}
