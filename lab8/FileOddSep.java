import java.io.*;
//import java.io.FileWriter;
import java.util.*;
import java.io.IOException;

class FileOddSep
{
 
 public static void main(String[] args)
 {
  try{
  int n,f=0;
  Scanner reader=new Scanner(System.in);
  System.out.print("Enter the no.of integers : ");
  n=reader.nextInt();
  int[] arr=new int[n];
  System.out.print("Enter the integers : ");
  for(int i=0;i<n;i++){
    arr[i]=reader.nextInt();
  }
 
  FileWriter fw=new FileWriter("C:\\Users\\hari\\Desktop\\MCA\\SE\\numbers.txt");
  for(int i=0;i<n;i++){
    fw.write(arr[i]+ "\n" );
  }
  fw.close();
  BufferedReader fr = new BufferedReader(new FileReader("C:\\Users\\hari\\Desktop\\MCA\\SE\\numbers.txt"));
 
 
  FileWriter fwe=new FileWriter("C:\\Users\\hari\\Desktop\\MCA\\SE\\even.txt");
  FileWriter fwo=new FileWriter("C:\\Users\\hari\\Desktop\\MCA\\SE\\odd.txt");
   
  String i;
  while((i=fr.readLine())!= null)
  {
    if(Integer.parseInt(i)%2==0){
        f=1;
        if (f==1)
        fwe.write(i+" ");
   }
   else
   fwo.write(i+" ");    
  }
fr.close();
fwe.close();
fwo.close();
System.out.print("Copying Done");
 }

 catch(IOException e){
   System.out.println("Exception");
  }


 }

}