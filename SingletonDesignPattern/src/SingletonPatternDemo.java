public class SingletonPatternDemo {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        singleton.showMessage();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.showMessage();

        int s1 = singleton.hashCode();
        int s2 = singleton2.hashCode();
        System.out.println(s1 + " ----> " + s2);

        //how to prove that singleton class is follow singleton properties?

        AnotherSimpleClass anotherSimpleClass = new AnotherSimpleClass();

        anotherSimpleClass.showMessages();

        AnotherSimpleClass anotherSimpleClass2 = new AnotherSimpleClass();
        anotherSimpleClass2.showMessages();

        int a1 = anotherSimpleClass.hashCode();
        int a2 = anotherSimpleClass2.hashCode();
        System.out.println(a1 + " ----> " + a2);


        //OUTPUT
//        Hello world!
//        Hello world!
//        1595428806 ----> 1595428806  (Same hashcode)
//        Another normal class...
//        Another normal class...
//        824909230 ----> 122883338    (Different hashcode)


    }
}
