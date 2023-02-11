import java.io.*;

public class StringFunctions {
    public static void main(String [] args) throws IOException {
        //read a file
        File file = new File("//Users//avantikakatiyar//IdeaProjects//Learn//src//textreader.txt");
        FileInputStream fins = new FileInputStream(file);
        InputStreamReader insr = new InputStreamReader(fins);
        BufferedReader bfr = new BufferedReader(insr);
        String givenLine;
        int wordCount = 0;
        int paraCount = 0;
        int whiteSpaceCount = 0;
        int sentenceCount = 0;
        //count words, chars, lines, paras
        int characterCount = 0;
        while((givenLine = bfr.readLine()) != null){
            characterCount += givenLine.length();
            String [] words = givenLine.split("//s+");
            wordCount +=words.length;
            whiteSpaceCount +=wordCount-1;
            String [] sentence =givenLine.split("[!?.:]+");
            sentenceCount +=sentence.length;
        }
        if (sentenceCount>=1){
            paraCount++;
        }
        System.out.println("Total word count = "+ wordCount);
        System.out.println("Total number of sentences = "+ sentenceCount);
        System.out.println("Total number of characters = "+ characterCount);
        System.out.println("Number of paragraphs = "+ paraCount);
        System.out.println("Total number of whitespaces = "+ whiteSpaceCount);

    }
}
