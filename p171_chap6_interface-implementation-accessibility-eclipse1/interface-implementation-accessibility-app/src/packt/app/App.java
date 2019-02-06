package packt.app;

import packt.lib.external.LibApi;

public class App {
	public static void main(String[] args) {
		LibApi api = LibApi.createInstance();
		api.testMethod();
	}
}
