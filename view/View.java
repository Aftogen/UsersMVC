package view;

import controller.Controller;
import model.ModelData;

public interface View {
     void refresh(ModelData modelData);

     void setController(Controller controller);
}
