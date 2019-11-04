package GroupId1;

import org.apache.camel.main.Main;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        myJsonParser obj = new myJsonParser();
        obj.ReadFile("C:\\AAA\\Data.json");
        Main main = new Main();
        main.addRouteBuilder(new MyRouteBuilder());

        //JsonParser obj = new JsonParser();
        //obj.ReadFile("C:\\Users\\med\\IdeaProjects\\ArtifactId1\\src\\data\\dblp_papers.json");
        main.run(args);
        System.out.println("Finished...s");
    }

}

