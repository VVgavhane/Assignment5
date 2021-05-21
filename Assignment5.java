import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class Assignment5 {
 public static void main(String[] args) {
	 String1.methodOne();
	 String2.methodOne();
	 String3.methodOne();
	 String4.methodOne();
	 String5.methodOne();
	 String6.methodOne();
	 String7.methodOne();
	 String8.methodOne();
	 String9.methodOne();
	 String10.methodOne();
	 String11.methodOne();
	 Re1.methodOne();
	 Re2.methodOne();
	 Re3.methodOne();
	 Re4.methodOne();
	 Re5.methodOne();
	 Re6.methodOne();
	 Re7.methodOne();
	 Re8.methodOne();
	 TriedSierpinskiTriangle.methodOne();
		
}
}

class String1{
	static void methodOne(){
		Scanner scr= new Scanner(System.in);
		java.lang.String x= scr.nextLine();
		char[] ch = x.toCharArray();
		int letter = 0;
		int vowels=0;
		for(int i = 0; i < x.length(); i++){
			if((ch[i]>64 &&ch[i]<90)||(ch[i]>96&&ch[i]<123)){
				letter ++ ;
				if((ch[i] == 'a' || ch[i]  == 'e' || ch[i]  == 'i' || ch[i]  == 'o' || ch[i]  == 'u')||((ch[i] == 'A' || ch[i]  == 'E' || ch[i]  == 'I' || ch[i]  == 'O' || ch[i]  == 'U'))){  
	                vowels++;  
	            }
			}
			
		}
	}
}

class String2{
	static void methodOne(){
		Scanner scr= new Scanner(System.in);
		java.lang.String x= scr.nextLine();
		char[] ch = x.toCharArray();
		for(int i = 0; i < x.length(); i++){
			if((ch[i]>64 &&ch[i]<90)||(ch[i]>96&&ch[i]<123)||(ch[i]>47&&ch[i]<58)){
				
				if(ch[i] == 'a' || ch[i]  == 'e' || ch[i]  == 'i' || ch[i]  == 'o' || ch[i]  == 'u') {  
	                System.out.println(ch[i]);  
	            }
				else{
					System.out.print(" ");
				}
			}
			else{
				System.out.println(ch[i]);
			}
			
		}
	}
}

class String3{
	static void methodOne(){
		Scanner scr= new Scanner(System.in);
		java.lang.String x= scr.nextLine();
		char[] ch = x.toCharArray();
		char[] rev= new char[ch.length];
		for(int i = ch.length-1, j=0; i>=0; i--,j++){
			rev[j]=ch[i];
		}
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(rev));
		boolean result=false;
		for (int i = 0,j=0; i < rev.length; i++,j++) {
			if(ch[i]==rev[j]){
				result=true;
			}
			else{
				result=false;
				break;
			}
		}
		if(result){
			System.out.println("the string is palindrome");
		}
		else System.out.println("the string is not palindrome");
	}
}

class String4{
	static void methodOne(){
		Scanner scr= new Scanner(System.in);
		java.lang.String x= scr.nextLine();
		char[] ch = x.toCharArray();
		char[] rs= new char[ch.length];
		for(int i = 0, j=0; i<ch.length; i++){
			if(ch[i]!=32){
				rs[j]=ch[i];
				j++;
			}
		}
		StringBuilder builder = new StringBuilder();
		for (char value : rs) {
		    builder.append(value);
		}
		String text = builder.toString();
		System.out.println(text);

		
}
}

class String5{
	static void methodOne(){
		Scanner scr= new Scanner(System.in);
		java.lang.String x= scr.nextLine();
		char[] ch = x.toCharArray();
		for(int i = 0; i < x.length(); i++){
			if((ch[i]>96&&ch[i]<123)){
				ch[i]=(char) ((int)ch[i]-32);
			}
			
		}
		StringBuilder builder = new StringBuilder();
		for (char value : ch) {
		    builder.append(value);
		}
		String text = builder.toString();
		System.out.println(text);
	}
}

class String6{
	static int countFreq(String pat, String txt) {       
        int M = pat.length();       
        int N = txt.length();       
        int res = 0;
 
        for (int i = 0; i <= N - M; i++) {
            
            int j;           
            for (j = 0; j < M; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
 
            if (j == M) {               
                res++;               
                j = 0;               
            }           
        }       
        return res;       
    }
 
    static public void methodOne() {
    	Scanner scr= new Scanner(System.in);
	System.out.println("enter the 1st string");
	java.lang.String txt= scr.nextLine(); 
	System.out.println("enter the 2st string");
	java.lang.String pat= scr.nextLine();
        System.out.println(countFreq(pat, txt));       
    }
}

class String7{
	 private static final String EMPTY_STRING = "";
	 
	    public static String ltrim(String str) {
	        return str.replaceAll("^\\s+", EMPTY_STRING);
	    }
	 
	    public static String rtrim(String str) {
	        return str.replaceAll("\\s+$", EMPTY_STRING);
	    }
	 
	    public static void methodOne()
	    {
	        String str = "  Hello World  ";
	 
	        System.out.println("Left Trim :" + ltrim(str) +":");
	        System.out.println("Right Trim :" + rtrim(str) +":");
	    }
	
}

class String8{
	static void methodOne(){
		Scanner scr= new Scanner(System.in);
		java.lang.String x= scr.nextLine();
		String strUpperCase = x.toUpperCase();
		System.out.println(strUpperCase);
	}
	
}

class String9{
	static void methodOne(){
		Scanner scr= new Scanner(System.in);
		System.out.println("enter the 1st string");
		
		
		java.lang.String str1= scr.nextLine(); 

		System.out.println("enter the 2st string");
		java.lang.String str2= scr.nextLine();
		int len = str1.length();
        int len2 = str2.length();
        int ans = Integer.MAX_VALUE;
     
       
        int [] hash1 = new int[26];
        int [] hash2 = new int[26];
     
        
        for (int i = 0; i < len; i++)
            hash1[(int)(str1.charAt(i) - 'a')]++;
     
        
        for (int i = 0; i < len2; i++)
            hash2[(int)(str2.charAt(i) - 'a')]++;
     
        
        for (int i = 0; i < 26; i++)
            if (hash2[i] != 0)
                ans = Math.min(ans, hash1[i] / hash2[i]);
     
        System.out.println(ans);
	}
}

class String10{
	static void methodOne(){
	Scanner scr= new Scanner(System.in);
	System.out.println("enter the 1st string");
	
	
	java.lang.String str1= scr.nextLine(); 
	
	String ltrim = str1.replaceAll("^\\s+", "");
	String rtrim = str1.replaceAll("\\s+$", "");
	System.out.println(ltrim);
	System.out.println(rtrim);
	
	}
	
}
 class String11{
	public static int i;
	 static void methodOne(){
		  {
			print();
		}
	 }
	 static String print(){
         String11.i=0;
		 while(String11.i<9999){
			 String11.i++;
			 return "Helloworldthisisit"+print();
		 }
		return null;
	 }
 }

class Re1{
	static void methodOne(){
		int n, mul;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer:");
        n = s.nextInt();
        Re1 obj = new Re1();
        mul = obj.fact(n);
        System.out.println("Factorial of "+n+" :"+mul);
    }
    int fact(int x)
    {
        if(x > 1)
        {
            return(x * fact(x - 1));
        }
        return 1;
    }
	}


class Re2{
	static int n1=0,n2=1,n3=0;
	static void methodOne(){
		 int count=10;    
		  System.out.print(n1+" "+n2);    
		  printFibonacci(count-2);
		    
		 }    
	static void printFibonacci(int count){    
	    if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(count-1);    
	     } 
	}
}

class Re3{
	static void bubbleSort(int arr[], int n)
    {
        if (n == 1)
            return;
      
     
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
            {
                
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
      
       
        bubbleSort(arr, n-1);
    }
	
	static void methodOne(){
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
	      
        bubbleSort(arr, arr.length);
         
        System.out.println("Sorted array : ");
        System.out.println(Arrays.toString(arr));
	}
}

class Re4{
	static void towerOfHanoi(int n, char from_rod,
            char to_rod, char aux_rod){
	 if (n == 1){
	System.out.println("Move disk 1 from rod "+
	                   from_rod+" to rod "+to_rod);
	return;
	}
	towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
	System.out.println("Move disk "+ n + " from rod " +
	               from_rod +" to rod " + to_rod );
	towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
}
	static void methodOne(){
		int n = 4;
	    towerOfHanoi(n, 'A', 'C', 'B');
	}
}

class Re5{
	 static final int N = 4;
	 
	    
	    static void getCofactor(int mat[][], int temp[][],
	                            int p, int q, int n)
	    {
	        int i = 0, j = 0;
	 
	        
	        for (int row = 0; row < n; row++)
	        {
	            for (int col = 0; col < n; col++)
	            {
	                
	                if (row != p && col != q)
	                {
	                    temp[i][j++] = mat[row][col];
	                    
	                    if (j == n - 1)
	                    {
	                        j = 0;
	                        i++;
	                    }
	                }
	            }
	        }
	    }
	 
	    
	    static int determinantOfMatrix(int mat[][], int n)
	    {
	        int D = 0; // Initialize result
	 
	       
	        if (n == 1)
	            return mat[0][0];
	 
	       
	        int temp[][] = new int[N][N];
	 
	        
	        int sign = 1;
	 
	        
	        for (int f = 0; f < n; f++)
	        {
	            
	            getCofactor(mat, temp, 0, f, n);
	            D += sign * mat[0][f]
	                 * determinantOfMatrix(temp, n - 1);
	 
	            sign = -sign;
	        }
	 
	        return D;
	    }
	 
	    static void display(int mat[][], int row, int col)
	    {
	        for (int i = 0; i < row; i++)
	        {
	            for (int j = 0; j < col; j++)
	                System.out.print(mat[i][j]);
	 
	            System.out.print("\n");
	        }
	    }
	 
	    public static void methodOne()
	    {
	 
	        int mat[][] = { { 1, 0, 2, -1 },
	                        { 3, 0, 0, 5 },
	                        { 2, 1, 4, -3 },
	                        { 1, 0, 5, 0 } };
	 
	        System.out.print("Determinant "
	                         + "of the matrix is : "
	                         + determinantOfMatrix(mat, N));
	    }
}

class Re6{
	public static void methodOne() {
	    int[] queens = new int[8];
	    solve(queens, 0);
	    prettyPrint(queens);
	}

	
	private static boolean solve(int[] queens, int i) {
	    if(i >= queens.length) {
	        return true;
	    }

	    for(queens[i] = 0; queens[i] < queens.length ; queens[i]++) {
	        if(!isAttacking(queens, i) && solve(queens, i+1)){
	            return true;
	        }
	    }
	    return false;
	}

	
	private static boolean isAttacking(int[] queens, int row){
	    //check same column
	    for(int prevRow = 0; prevRow < row; prevRow++){
	        if (queens[prevRow] == queens[row]) {
	            return true;
	        }
	    }

	    //check diagonals
	    for(int prevRow = 0; prevRow < row; prevRow++) {
	        if(Math.abs(prevRow - row) ==
	                Math.abs(queens[prevRow] - queens[row])){
	            return true;
	        }
	    }
	    return false;
	}

	private static void prettyPrint(int[] queens){
	    StringBuilder output = new StringBuilder();
	    for (int row : queens) {
	        for (int col = 0; col < queens.length; col++) {
	            if (row == col) {
	                output.append('Q');
	            } else {
	                output.append('_');
	            }
	            output.append('|');
	        }
	        output.append('\n');
	    }
	    System.out.println(output.toString());
	}
}


class Re7 {
	static int N = 8;

	
	static boolean isSafe(int x, int y, int sol[][])
	{
		return (x >= 0 && x < N && y >= 0 && y < N
				&& sol[x][y] == -1);
	}

	
	static void printSolution(int sol[][])
	{
		for (int x = 0; x < N; x++) {
			for (int y = 0; y < N; y++)
				System.out.print(sol[x][y] + " ");
			System.out.println();
		}
	}

	
	static boolean solveKT()
	{
		int sol[][] = new int[8][8];

		for (int x = 0; x < N; x++)
			for (int y = 0; y < N; y++)
				sol[x][y] = -1;

		
		int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
		int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

		
		sol[0][0] = 0;

		
		if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
			System.out.println("Solution does not exist");
			return false;
		}
		else
			printSolution(sol);

		return true;
	}


	static boolean solveKTUtil(int x, int y, int movei,
							int sol[][], int xMove[],
							int yMove[])
	{
		int k, next_x, next_y;
		if (movei == N * N)
			return true;

		for (k = 0; k < 8; k++) {
			next_x = x + xMove[k];
			next_y = y + yMove[k];
			if (isSafe(next_x, next_y, sol)) {
				sol[next_x][next_y] = movei;
				if (solveKTUtil(next_x, next_y, movei + 1,
								sol, xMove, yMove))
					return true;
				else
					sol[next_x][next_y]
						= -1; 
			}
		}

		return false;
	}


	public static void methodOne()
	{
		
		solveKT();
	}
}

class Re8{
	 static void RecursivePrint(File[] arr,int index,int level) 
     {
         
         if(index == arr.length)
             return;
           
         
         for (int i = 0; i < level; i++)
             System.out.print("\t");
           
         
         if(arr[index].isFile())
             System.out.println(arr[index].getName());
           
         
         else if(arr[index].isDirectory())
         {
             System.out.println("[" + arr[index].getName() + "]");
               
             
             RecursivePrint(arr[index].listFiles(), 0, level + 1);
         }
            
       
         RecursivePrint(arr,++index, level);
    }
      
   
    public static void methodOne()
    {
         
        String maindirpath = "C:\\Users\\VISHNU\\Documents";
                  
        
        File maindir = new File(maindirpath);
           
        if(maindir.exists() && maindir.isDirectory())
        {
            
            File arr[] = maindir.listFiles();
              
            
            System.out.println("Files from main directory : " + maindir);
            
              
            
            RecursivePrint(arr,0,0); 
       } 
    }
}

class TriedSierpinskiTriangle{
	 static void printSierpinski(int n)
	    {
	        for (int y = n - 1; y >= 0; y--) {
	  
	           
	            for (int i = 0; i < y; i++) {
	                System.out.print(" ");
	            }
	  
	            
	            for (int x = 0; x + y < n; x++) {
	  
	                
	                if ((x & y) != 0)
	                    System.out.print(" "
	                                    + " ");
	                else
	                    System.out.print("* ");
	            }
	  
	            System.out.print("\n");
	        }
	    }
	  
	
	    public static void methodOne()
	    {
	        int n = 16;
	  
	        printSierpinski(n);
	    }
}
