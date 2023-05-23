package forms;

import play.data.validation.Constraints;
import play.data.validation.ValidationError;

import java.util.List;

public class SomeFormData implements Constraints.Validatable<List<ValidationError>>{

    @Constraints.MinLength(3)
    public String someString;

    @Override
    public List<ValidationError> validate() {
        return null;
    }
}
