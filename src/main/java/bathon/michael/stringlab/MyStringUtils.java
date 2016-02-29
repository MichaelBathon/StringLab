package bathon.michael.stringlab;

import java.util.Scanner;

/**
 * Created by michaelbathon on 2/19/16.
 */
public class MyStringUtils {

    public String iterateArrayPlusCommas(String[] array){
        String sequencePlusCommas = "";

        for(int i = 0; i < array.length; i++){
            sequencePlusCommas += array[i] + ",";
        }

        return sequencePlusCommas;
    }

    public String iterateArrayPlusCommas(char[] array){
        String sequencePlusCommas = "";

        for(int i = 0; i < array.length; i++){
            sequencePlusCommas += array[i] + ",";
        }

        return sequencePlusCommas;
    }


    public String[] turnStringIntoArray(String input){
        Scanner scan = new Scanner(input);
        int arraySize = stringArraySizeSetter(input);
        String[] sequenceArr = new String[arraySize];
        if(input == ""){
            sequenceArr[0] = "";
            return sequenceArr;
        }

        for(int i = 0; i < sequenceArr.length; i++) {
            sequenceArr[i] = scan.nextLine();
        }
        return sequenceArr;
    }

    public int stringArraySizeSetter(String input){
        int size = 1;

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '\n'){
                size++;
            }
        }
        if(input.endsWith("\n")){size--;}
        return size;
    }

    public String reverseCapitalization(String sequence){
        String reverseCapitalizationString = "";
        for(int i = 0; i < sequence.length(); i++) {
                if (Character.isLowerCase(sequence.charAt(i))) {
                    reverseCapitalizationString += Character.toUpperCase(sequence.charAt(i));
                }
                else{
                reverseCapitalizationString += Character.toLowerCase(sequence.charAt(i));
                }
        }

        return reverseCapitalizationString;
    }

    public String reverseTheOrderOfTheWordsInAString(String string){
        String reversedWordSequence = "";

        String[] stringArrToReverse = string.split(" ");

        for(int i = 0; i < stringArrToReverse.length; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(stringArrToReverse[i]);
            sb.reverse();
            reversedWordSequence += sb.toString() + " ";
        }

        return reversedWordSequence.trim();
    }

    public String removeWhiteSpaceAddNewLines(String string){
        String noSpaceNewlineSequence = "";

        String[] stringWithOutSpace = string.split(" ");

        for(int j = 0; j < stringWithOutSpace.length; j++){
            StringBuilder sb = new StringBuilder();
            sb.append(stringWithOutSpace[j]);
            noSpaceNewlineSequence += sb.toString() + "\n";
        }

        return noSpaceNewlineSequence;
    }

    public String[] produceAllPossibleSubstringCombos(String subStr){
        int arraySize = 0;
        int v = 0;
        for(int i = 1; i <= subStr.length(); i++){
            arraySize += i;
        }
        String[] substringComboArr = new String[arraySize];

        for(int j = 0; j < subStr.length(); j++){

            for(int k = j+1; k <= subStr.length(); k++){
                substringComboArr[v] = subStr.substring(j,k);
                v++;
            }
        }

        return substringComboArr;
    }





}
