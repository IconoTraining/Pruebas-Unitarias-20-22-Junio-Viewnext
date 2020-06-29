import java.util.StringTokenizer;

public class Calculation {  
  	
	// input: {2, 6, 9}, output: 9
	// input: {-4, 2, -5}, output: 2
    public static int findMax(int[] arr){  
        int max = arr[0];
        for(int i=0;i<arr.length;++i){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }   
     
    // input: "Hola qué tal", output: "aloH éuq lat"
    public static String reverseWord(String str){  
  
        StringBuilder result=new StringBuilder();  
        StringTokenizer tokenizer=new StringTokenizer(str," ");  
  
        while(tokenizer.hasMoreTokens()){  
	        StringBuilder sb=new StringBuilder();  
	        sb.append(tokenizer.nextToken());  
	        sb.reverse();  
	  
	        result.append(sb);  
	        result.append(" ");  
        }
        
        return result.toString().trim();  
    }  
}  