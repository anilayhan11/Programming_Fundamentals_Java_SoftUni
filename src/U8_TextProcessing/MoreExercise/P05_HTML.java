package U8_TextProcessing.MoreExercise;

import java.util.Scanner;

public class P05_HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        printTitle(title);

        String content = scanner.nextLine();
        printContent(content);

        String comments = scanner.nextLine();

        while (!comments.equals("end of comments")) {
            printComments(comments);

            comments = scanner.nextLine();
        }
    }

    public static void printTitle(String title) {
        System.out.println("<h1>");
        System.out.printf("%s\n", title);
        System.out.println("</h1>");
    }

    public static void printContent(String article) {
        System.out.println("<article>");
        System.out.printf("%s\n", article);
        System.out.println("</article>");
    }

    public static void printComments(String comment) {
        System.out.println("<div>");
        System.out.printf("%s\n", comment);
        System.out.println("</div>");
    }
}