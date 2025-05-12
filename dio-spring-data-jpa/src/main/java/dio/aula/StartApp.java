package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        insertUser();
        List<User> users = userRepository.findByNameContaining("MURILO");
        for (User u : users) {
            System.out.println(u);
        }

    }
    private void insertUser(){
        User user = new User();
        user.setName("MURILO");
        user.setUsername("murilo");
        user.setPassword("dio123");

        userRepository.save(user);

//        for(User u : userRepository.findAll()){
//            System.out.println(u);
//        }
    }
}
