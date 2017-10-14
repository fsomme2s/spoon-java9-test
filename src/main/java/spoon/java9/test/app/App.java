package spoon.java9.test.app;

import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtType;

/**
 * TODO jdoc
 */
public class App {
    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        launcher.addInputResource(App.class.getResource("/input-src").getPath());
        launcher.getEnvironment().setAutoImports(true);
        launcher.getEnvironment().setNoClasspath(true);

        launcher.buildModel();
        CtModel model = launcher.getModel();

        System.out.println("Found the following java types:");
        for (CtType<?> type : model.getAllTypes()) {
            System.out.println(type.getSimpleName());
        }


    }
}
