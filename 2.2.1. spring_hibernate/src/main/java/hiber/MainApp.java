package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        userService.add(new User((new Car("Model1", 1000)), "User1", "LastName1", "user1@mail.ru"));
        userService.add(new User((new Car("Model2", 2000)), "User2", "LastName2", "user2@mail.ru"));
        userService.add(new User((new Car("Model3", 3000)), "User3", "LastName3", "user3@mail.ru"));
        userService.add(new User((new Car("Model4", 4000)), "User4", "LastName4", "user8@mail.ru"));

        userService.listUsers();

        userService.searchUserByCar(new Car("Model3", 3000));

        context.close();
    }
}
