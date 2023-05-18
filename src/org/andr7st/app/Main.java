package org.andr7st.app;

/**
 * author Andrés Segura
 */
public class Main {

    private static String message = "Hello, this is a Java Jdk11 practice!";

    public static void main( String... args ) {
        
        System.out.println(  ConsoleColors.NORMAL_PURPLE + ConsoleColors.BACKGROUND_BLACK + message + ConsoleColors.COLOR_RESET );
    }
}


/**
 * This class provides several colors code for use in a Java an Kotlin console apps. 
 */
class ConsoleColors {

    public static final String NORMAL_BLACK = "\033[0;30m";
    public static final String NORMAL_RED = "\033[0;31m";
    public static final String NORMAL_GREEN = "\033[0;32m";
    public static final String NORMAL_YELLOW = "\033[0;33m";
    public static final String NORMAL_BLUE = "\033[0;34m";
    public static final String NORMAL_PURPLE = "\033[0;35m";
    public static final String NORMAL_CYAN = "\033[0;36m";
    public static final String NORMAL_WHITE = "\033[0;37m";

    public static final String BOLD_BLACK = "\033[1;30m";
    public static final String BOLD_RED = "\033[1;31m";
    public static final String BOLD_GREEN = "\033[1;32m";
    public static final String BOLD_YELLOW = "\033[1;33m";
    public static final String BOLD_BLUE = "\033[1;34m";
    public static final String BOLD_PURPLE = "\033[1;35m";
    public static final String BOLD_CYAN = "\033[1;36m";
    public static final String BOLD_WHITE = "\033[1;37m";

    public static final String BOLD_INTENSE_BLACK = "\033[1;90m";
    public static final String BOLD_INTENSE_RED = "\033[1;91m";
    public static final String BOLD_INTENSE_GREEN = "\033[1;92m";
    public static final String BOLD_INTENSE_YELLOW = "\033[1;93m";
    public static final String BOLD_INTENSE_BLUE = "\033[1;94m";
    public static final String BOLD_INTENSE_PURPLE = "\033[1;95m";
    public static final String BOLD_INTENSE_CYAN = "\033[1;96m";
    public static final String BOLD_INTENSE_WHITE = "\033[1;97m";

    public static final String UNDERLINED_BLACK = "\033[4;30m";
    public static final String UNDERLINED_RED = "\033[4;31m";
    public static final String UNDERLINED_GREEN = "\033[4;32m";
    public static final String UNDERLINED_YELLOW = "\033[4;33m";
    public static final String UNDERLINED_BLUE = "\033[4;34m";
    public static final String UNDERLINED_PURPLE = "\033[4;35m";
    public static final String UNDERLINED_CYAN = "\033[4;36m";
    public static final String UNDERLINED_WHITE = "\033[4;37m";

    public static final String INTENSE_BLACK = "\033[0;90m";
    public static final String INTENSE_RED = "\033[0;91m";
    public static final String INTENSE_GREEN = "\033[0;92m";
    public static final String INTENSE_YELLOW = "\033[0;93m";
    public static final String INTENSE_BLUE = "\033[0;94m";
    public static final String INTENSE_PURPLE = "\033[0;95m";
    public static final String INTENSE_CYAN = "\033[0;96m";
    public static final String INTENSE_WHITE = "\033[0;97m";

    public static final String BACKGROUND_BLACK = "\033[40m";
    public static final String BACKGROUND_RED = "\033[41m";
    public static final String BACKGROUND_GREEN = "\033[42m";
    public static final String BACKGROUND_YELLOW = "\033[43m";
    public static final String BACKGROUND_BLUE = "\033[44m";
    public static final String BACKGROUND_PURPLE = "\033[45m";
    public static final String BACKGROUND_CYAN = "\033[46m";
    public static final String BACKGROUND_WHITE = "\033[47m";

    public static final String BACKGROUND_INTENSE_BLACK = "\033[0;100m";
    public static final String BACKGROUND_INTENSE_RED = "\033[0;101m";
    public static final String BACKGROUND_INTENSE_GREEN = "\033[0;102m";
    public static final String BACKGROUND_INTENSE_YELLOW = "\033[0;103m";
    public static final String BACKGROUND_INTENSE_BLUE = "\033[0;104m";
    public static final String BACKGROUND_INTENSE_PURPLE = "\033[0;105m";
    public static final String BACKGROUND_INTENSE_CYAN = "\033[0;106m";
    public static final String BACKGROUND_INTENSE_WHITE = "\033[0;107m";

    public static final String COLOR_RESET = "\033[0m";

}
