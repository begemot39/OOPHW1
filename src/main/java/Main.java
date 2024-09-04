public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.passport = "Серия: 1111 Номер: 111111";
        post.subscription = true;
        post.birthday.day = 15;
        post.birthday.month = 11;
        post.birthday.year = 2000;
    }
}
