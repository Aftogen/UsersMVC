import controller.Controller;
import model.MainModel;
import model.Model;
import view.EditUserView;
import view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();

        UsersView usersView = new UsersView();
        EditUserView editUserView = new EditUserView();

        Controller controller = new Controller();

        usersView.setController(controller);
        editUserView.setController(controller);

        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126L);
        editUserView.fireEventUserDeleted(124L);
        editUserView.fireEventUserChanged("Petrov", 125L, 1);

        usersView.fireEventShowDeletedUsers();


    }
}