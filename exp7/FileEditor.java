import java.io.*;
import java.util.Scanner;

public class FileEditor {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java FileEditor <filename>");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);
        Scanner scanner = new Scanner(System.in);

        try {
            if (file.exists()) {
                System.out.println("File exists. Displaying contents:\n");

                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                }

                System.out.print("\nDo you want to add data to the end of the file? (Yes/No): ");
                String response = scanner.nextLine().trim();

                if (response.equalsIgnoreCase("Yes")) {
                    System.out.println("Enter data to append (type 'exit' on a new line to finish):");

                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                        while (true) {
                            String input = scanner.nextLine();
                            if (input.equalsIgnoreCase("exit")) break;
                            writer.write(input);
                            writer.newLine();
                        }
                        System.out.println("Data successfully appended to the file.");
                    }
                } else {
                    System.out.println("No data was added.");
                }

            } else {
                System.out.println("File does not exist. Creating a new file.");
                System.out.println("Enter data to write to the file (type 'exit' on a new line to finish):");

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    while (true) {
                        String input = scanner.nextLine();
                        if (input.equalsIgnoreCase("exit")) break;
                        writer.write(input);
                        writer.newLine();
                    }
                    System.out.println("Data successfully written to new file.");
                }
            }

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
