package day09_IfStatements;

public class EqualNumbers {
    public static void main(String[] args) {

        int n1 = 2,
                n2=4,
                n3=6;

        String equal = (n1==n2&&n3==n1)? "all equal" :(n1==n2)? "n1&n2 are equal" :(n2==n3)?
                "n2&n3 are equal" :(n3==n1)? "n3&n1 are equal" :"none of them are equal" ;

        System.out.println(equal);

    }
}

/*
6. Create a class called EqualNumbers, and write a program that can check the equality of
the three given numberrs

	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal


 */