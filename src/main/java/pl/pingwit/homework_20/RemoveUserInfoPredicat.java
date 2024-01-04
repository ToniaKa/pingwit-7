package pl.pingwit.homework_20;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveUserInfoPredicat {
    public static void main(String[] args) {
        /*Task 9
        Создайте List<UserInfo>. Создайте предикат, по которому все юзеры, у которых имена начинаются с A,P,E удалялись бы из этого листа*/

        UserInfo userInfo1 = new UserInfo("Sasha", "Petrov", "1234567", "sp@gmail.com", LocalDate.of(1990, 12, 12));
        UserInfo userInfo2 = new UserInfo("Pavel", "Ivanov", "987654", "pi@gmail.com", LocalDate.of(1980, 12, 12));
        UserInfo userInfo3 = new UserInfo("Anna", "Sidorova", "332211", "as@gmail.com", LocalDate.of(2005, 12, 12));
        UserInfo userInfo4 = new UserInfo("Lena", "Ivanova", "76555", "li@gmail.com", LocalDate.of(1998, 12, 12));
        UserInfo userInfo5 = new UserInfo("Sergey", "Sergeeev", "98876666", "ss@gmail.com", LocalDate.of(2005, 12, 12));

        List<UserInfo> userInfos = new ArrayList<>();
        userInfos.add(userInfo1);
        userInfos.add(userInfo2);
        userInfos.add(userInfo3);
        userInfos.add(userInfo4);
        userInfos.add(userInfo5);

        Predicate<UserInfo> userInfoPredicate = user -> user.getName().startsWith("A") || user.getName().startsWith("P") || user.getName().startsWith("E");
        // альтернативная форма:
        Predicate<UserInfo> userInfoPredicate2 = user -> {
            String name = user.getName();
            return name.startsWith("A") || name.startsWith("P") || name.startsWith("E");
        };

        List<UserInfo> users = userInfos.stream()
                .filter(userInfoPredicate)
                .toList();
        System.out.println(users);

        for (int i = 0; i < userInfos.size(); i++) {
            for (int j = 0; j < users.size(); j++) {
                userInfos.removeAll(users);
            }
        }
        System.out.println(userInfos);
    }
}
