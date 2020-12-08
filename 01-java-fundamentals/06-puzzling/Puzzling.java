import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Arrays; 
import java.util.Random;

public class Puzzling{

    public static ArrayList<Integer> sumAndMoreThan10(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        System.out.println(sum); 
            }
            ArrayList<Integer> newArr = new ArrayList<Integer>(); 
        for(int j = 0; j < arr.length; j++){
            if(arr[j] > 10){
                newArr.add(arr[j]);
            }
        }
        return newArr;
    }
public static void shuffleLessThanFive(String[] y) {
    Collections.shuffle(Arrays.asList(y));
    System.out.println(Arrays.asList(y));
    
    ArrayList<String> newArr = new ArrayList<String>();

    for(int i = 0; i < y.length; i++) {
        String currString = y[i];
        if(currString.length() > 5){
            newArr.add(currString);
        }
    }
    System.out.println(Arrays.asList(newArr));
    }
    public static void alphabetPuzzle(){
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(Character ch = 'a'; ch <= 'z'; ch++){
            alphabet.add(ch);
            }
            Collections.shuffle(alphabet);
            System.out.println(alphabet.get(25));
            if (alphabet.get(0).equals('a') || alphabet.get(0).equals('e') || alphabet.get(0).equals('i') || alphabet.get(0).equals('o') || alphabet.get(0).equals('u')) {
                System.out.println(alphabet.get(0) + " is a vowel!");
            }else{
                System.out.println(alphabet.get(0));
            }
    }
    
    public static int[] randomIntArr(int a, int b){
        int[] newArr = new int[10];
        int boundary = b - a; 
        Random r = new Random();

        for(int i = 0;i < newArr.length; i++){
            int randomNum = r.nextInt(boundary);
            newArr[i] = randomNum + a;
        }
        Arrays.toString(newArr); 
        return newArr; 
    }        

    public static void sortArray(int[] x){
        Arrays.sort(x);
        System.out.println(Arrays.toString(x)); 
        System.out.println(x[0]);
        System.out.println(x[x.length-1]);
    }

    public static String generateRandomChars(String candidateChars, int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(candidateChars.charAt(random.nextInt(candidateChars.length())));
        }
    
        return sb.toString();
    }

    public static void randStringArray(int length){
        ArrayList<String> ranStrArr = new ArrayList<String>();
        for(int k = 0; k < length; k++){
            ranStrArr.add(generateRandomChars("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890",5));
        }
        System.out.println(ranStrArr);
    }

}

