package packt.app;

import packt.lib.external.LibApi;

public class App {
    public static void main(String[] args){
        //This will not work because LibApiImpl is not accessible
        //LibApiImpl api = new LibApiImpl();
        //api.testMethod();

        //This will work
        LibApi api = LibApi.createInstance();
        api.testMethod();
    }
}
