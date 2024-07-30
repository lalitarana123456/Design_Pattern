public class Singleton {

    private static Singleton singletonInstance = null;

    private Singleton(){

    }


    //public method which return the instance of the class
    public static Singleton getInstance(){
        if(singletonInstance == null){
            singletonInstance = new Singleton();
        }

        return singletonInstance;
    }


    public void showMessage(){
        System.out.println("Hello world!");
    }


}
