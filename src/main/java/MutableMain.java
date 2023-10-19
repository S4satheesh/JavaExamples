public class MutableMain {

        public static void main(String[] args) {
            MutablePerson mperson = new MutablePerson("Alice", 30);
            System.out.println(mperson.getName());
            System.out.println(mperson.getAge());
            // You can modify the person's state directly
            mperson.setName("Bob");
            mperson.setAge(25);
            System.out.println(mperson.getName());
            System.out.println(mperson.getAge());
        }
}
