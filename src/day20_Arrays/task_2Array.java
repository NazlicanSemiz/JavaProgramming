package day20_Arrays;

public class task_2Array {
    public static void main(String[] args) {

        String[] names= {"java","cilve","nazli"};

        for (String name: names){

            String result= "";
            for (int i= name.length()-1; i >=0; i--){
                result+= name.charAt(i);
            }

            System.out.println(result);
        }
    }
}

/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */