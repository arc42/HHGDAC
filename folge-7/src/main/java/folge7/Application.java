package folge7;

/**
 * = Application
 *
 * Project version: {projectVersion}.
 *
 * We copied this example from @mrhaki's blogpost
 * on AsciiDoclet...
 *
 * Sample Java application in project {projectName}
 * to show Asciidoclet as replacement for the
 * default Javadoclet.
 *
 * We can apply Asciidoc syntax in our Javadoclet
 * comments, like:
 *
 *  - `code`
 *  - **bold**
 *  - _italics_
 *
 * include::./src/main/javadoc/common.adoc[]
 *
 *
 *
 * @author mrhaki
 * @version 1.0
 */
public class Application {

    /**
     * Main method to start the application.
     *
     * The following arguments are allowed
     * (easy Asciidoc table syntax):
     *
     * |===
     * | Name | Description
     *
     * | --help
     * | Getting more help about the application.
     *
     * | --info
     * | Show extra logging information
     *
     * |===
     *
     */
    public static void main(final String... arguments) {
        System.out.println("Application started...");
    }

}
