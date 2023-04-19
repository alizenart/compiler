import java.util.*;
import java.io.*;  // Import the File class

public class compilerDraft
{
  public static void main(String[]args)
  {
    try
    {
      File myObj = new File("original1.txt"); //grabbing the sample program
      Scanner myReader = new Scanner(myObj); //scanner myReader for reading line
      

      ArrayList<String> a = new ArrayList<String>();
      
      int[] numbers = new int[10];
      String[] names = new String[10];
      numbers[0] = 100;
      
      int count=0;
      
      
          
      while (myReader.hasNextLine()) //turning .txt file to an arraylist of strings
      { 
        String w = myReader.nextLine();
        a.add(w);
      }
      
      for(int i = 0; i < a.size(); i++)
      {
        if (a.equals(""))
        {
         
        }
      }
      
     
      
      int counter = 0; //counter used for counting which fruit it is in
      
      
      int i = 0;
      int size = a.size();
      
      while(i < size)// going through all the lines
      {
        String r = a.get(i);
        if(r.length()>7)
        {
          if(r.substring(0,6).equals("repeat"))//for the loop
          {
            int loop = Integer.parseInt(a.get(i).substring(7,8));
            r = a.get(i+1);
            for(int c=0; c<loop;c++)
            {
              operations(r, numbers, names, i, a);
            }
          }
          else
          {
            operations(r, numbers, names, i, a);
          }
        }
             
        i++;

      }//end of going through all the lines

        
        
      
      
     
      myReader.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
     
  }
  
  
  public static void operations(String re, int[] numbers, String[] names, int i, ArrayList<String> a)
  {
    Scanner pencil = new Scanner(System.in); //scanner pencil accepting input
        if (re.equals("**"))//leaving a comment
        {
          System.out.println();
        }

        
        if(re.length() > 13)//prints out, System.out.println()
        {
          if(re.substring(0,12).equals("Instruction "))
          {
            System.out.println(re.substring(12));
            
          }
        }
        
        if(re.length() > 5)
        {
          
          if(re.substring(0,4).equals("name") && re.substring(5).contains("typein"))//storing and getting the name, scanner
          {
            
            
            String temp = re.substring(4,5);
            int order;
            if(temp.equals("1"))
            {
              order = 1;
            }
            else if(temp.equals("2"))
            {
              order = 2;
            }
            else if(temp.equals("3"))
            {
              order = 3;
            }
            
            else
            {
              order = 4;
            }
            
            names[order] = pencil.nextLine();
            
          }
          
          if(re.substring(0,3).equals("num") && re.substring(4).contains("typein"))//storing and getting the number, scanner
          {
            
            
            String temp = re.substring(3,4);
            int order;
            int n = pencil.nextInt();
            pencil.nextLine();
            
           
            
            
            if(temp.equals("1"))
            {
              order = 1;
              //works
            }
            else if(temp.equals("2"))
            {
              order = 2;
            }
            
            else if(temp.equals("3"))
            {
              order = 3;
            }
            
            else
            {
              order = 4;
            }
            
            
            numbers[order] = n;
            
            //works
            
          }
                
        }
        
        
        
        
        if(re.length() > 7)
        {
         if(re.substring(0,2).equals("if"))
          {
            if(re.contains("equals"))//comparison if
            { 
              int numTemp=0;
              int temp=-1;
            
              if(re.substring(3,6).equals("num"))//fetching the input number (ex num3, to compare to)
              {
                
                if(re.substring(6,7).equals("3"))
                {
                  numTemp = numbers[3];
                }
                if(re.substring(6,7).equals("2"))
                {
                  numTemp = numbers[2];
                }
                if(re.substring(6,7).equals("1"))
                {
                  numTemp = numbers[1];
                }
                
                if(re.substring(re.length() - 1 ).equals("1"))//fetching the compareto number for operations
                {
                  temp = 1;
                }
                
                if(re.substring(re.length() - 1 ).equals("2"))//fetching the compareto number for operations
                {
                  temp = 2;
                }
                
                if(re.substring(re.length() - 1 ).equals("3"))//fetching the compareto number for operations
                {
                  temp = 3;
                }
                
                if(re.substring(re.length() - 1 ).equals("4"))//fetching the compareto number for operations
                {
                  temp = 4;
                }
                
                if(re.substring(re.length() - 1 ).equals("5"))//fetching the compareto number for operations
                {
                  temp = 5;
                }
                
               
                
                if(temp == numTemp)//if values are equal, continue
                {
                  re = a.get(i+1);
                  int n1 =0;
                  int n2 = 0;
                  
                  //CALCULATOR EFFECTS
                  if(re.substring(0,3).equals("add"))
                  {
                    
                    String string1;
                    String string2;
                    int t = 0;
                    int x;
                    
                    for(int j = 0; j < re.length() - 5; j++)
                    {
                      if(re.substring(j, j + 3).equals("num"))
                      {
                        
                        string1 = re.substring(j+3, j+4);
                        
                        if(string1.equals("1"))
                        {
                          n1 = numbers[1];
                        }
                        if(string1.equals("2"))
                        {
                          n1 = numbers[2];
                        }
                        if(string1.equals("3"))
                        {
                          n1 = numbers[3];
                        }
                        t = j + 2;
                        
                        

                        j = re.length();
                      }
                    }
                    
                    
                    
                    for(int r = t; r< re.length() - 3; r++)
                    {
                      if(re.substring(r, r +3).equals("num"))
                      {
                        string1 = re.substring(r+3, r+4);
                        
                        if(string1.equals("1"))
                        {
                          n2 = numbers[1];
                        }
                        if(string1.equals("2"))
                        {
                          n2 = numbers[2];
                        }
                        if(string1.equals("3"))
                        {
                          n2 = numbers[3];
                        }
                        r = re.length();
                        
                      }
                    }
                    
                    int f = n1 + n2;
                    System.out.println("sum: " + f);
                    
                    
                    
                  }
                  
                  //CALCULATOR EFFECTS
                  if(re.substring(0,8).equals("subtract"))
                  {
                    
                    String string1;
                    String string2;
                    int t = 0;
                    int x;
                    
                    for(int j = 0; j < re.length() - 5; j++)
                    {
                      if(re.substring(j, j + 3).equals("num"))
                      {
                        
                        string1 = re.substring(j+3, j+4);
                        
                        if(string1.equals("1"))
                        {
                          n1 = numbers[1];
                        }
                        if(string1.equals("2"))
                        {
                          n1 = numbers[2];
                        }
                        if(string1.equals("3"))
                        {
                          n1 = numbers[3];
                        }
                        t = j + 2;
                        
                        

                        j = re.length();
                      }
                    }
                    
                    
                    
                    for(int r = t; r< re.length() - 3; r++)
                    {
                      if(re.substring(r, r +3).equals("num"))
                      {
                        string1 = re.substring(r+3, r+4);
                        
                        if(string1.equals("1"))
                        {
                          n2 = numbers[1];
                        }
                        if(string1.equals("2"))
                        {
                          n2 = numbers[2];
                        }
                        if(string1.equals("3"))
                        {
                          n2 = numbers[3];
                        }
                        r = re.length();
                        
                      }
                    }
                    
                    int f = n1 - n2;
                    System.out.println("difference: " + f);
                    
                    
                    
                  }
                  
                  if(re.substring(0,8).equals("multiply"))
                  {
                    
                    String string1;
                    String string2;
                    int t = 0;
                    int x;
                    
                    for(int j = 0; j < re.length() - 5; j++)
                    {
                      if(re.substring(j, j + 3).equals("num"))
                      {
                        string1 = re.substring(j+3, j+4);
                        
                        if(string1.equals("1"))
                        {
                          n1 = numbers[1];
                        }
                        if(string1.equals("2"))
                        {
                          n1 = numbers[2];
                        }
                        if(string1.equals("3"))
                        {
                          n1 = numbers[3];
                        }
                        t = j + 2;
                        

                        j = re.length();
                      }
                    }
                    
                    
                    
                    for(int r = t; r< re.length() - 3; r++)
                    {
                      if(re.substring(r, r +3).equals("num"))
                      {
                        
                        string1 = re.substring(r+3, r+4);
                        
                        if(string1.equals("1"))
                        {
                          n2 = numbers[1];
                        }
                        if(string1.equals("2"))
                        {
                          n2 = numbers[2];
                        }
                        if(string1.equals("3"))
                        {
                          n2 = numbers[3];
                        }
                       
                        
                        r = re.length();
                        
                      }
                    }
                    
                    int f = n1 * n2;
                    System.out.println("product: " + f);
                    
                    
                    
                  }
                  
                  if(re.substring(0,6).equals("divide"))
                  {
                    
                    String string1;
                    String string2;
                    int t = 0;
                    int x;
                    
                    for(int j = 0; j < re.length() - 5; j++)
                    {
                      if(re.substring(j, j + 3).equals("num"))
                      {
                        
                        string1 = re.substring(j+3, j+4);
                        
                        if(string1.equals("1"))
                        {
                          n1 = numbers[1];
                        }
                        if(string1.equals("2"))
                        {
                          n1 = numbers[2];
                        }
                        if(string1.equals("3"))
                        {
                          n1 = numbers[3];
                        }
                        t = j + 2;
                        
                        

                        j = re.length();
                      }
                    }
                    
                    
                    
                    for(int r = t; r< re.length() - 3; r++)
                    {
                      if(re.substring(r, r +3).equals("num"))
                      {
                        string1 = re.substring(r+3, r+4);
                        
                        if(string1.equals("1"))
                        {
                          n2 = numbers[1];
                        }
                        if(string1.equals("2"))
                        {
                          n2 = numbers[2];
                        }
                        if(string1.equals("3"))
                        {
                          n2 = numbers[3];
                        }
                        r = re.length();
                        
                      }
                    }
                    
                    int f = n1/n2;
                    System.out.println("quotient: " + f);
                    
                    
                    
                  }
                  
                  if(re.substring(0,3).equals("mod"))
                  {
                    
                    String string1;
                    String string2;
                    int t = 0;
                    int x;
                    
                    for(int j = 0; j < re.length() - 5; j++)
                    {
                      if(re.substring(j, j + 3).equals("num"))
                      {
                        
                        string1 = re.substring(j+3, j+4);
                        
                        if(string1.equals("1"))
                        {
                          n1 = numbers[1];
                        }
                        if(string1.equals("2"))
                        {
                          n1 = numbers[2];
                        }
                        if(string1.equals("3"))
                        {
                          n1 = numbers[3];
                        }
                        t = j + 2;
                        
                        

                        j = re.length();
                      }
                    }
                    
                    
                    
                    for(int r = t; r< re.length() - 3; r++)
                    {
                      if(re.substring(r, r +3).equals("num"))
                      {
                        string1 = re.substring(r+3, r+4);
                        
                        if(string1.equals("1"))
                        {
                          n2 = numbers[1];
                        }
                        if(string1.equals("2"))
                        {
                          n2 = numbers[2];
                        }
                        if(string1.equals("3"))
                        {
                          n2 = numbers[3];
                        }
                        r = re.length();
                        
                      }
                    }
                    
                    int f = n1%n2;
                    System.out.println("module: " + f);
                  }
                  
                }
                else//if the values aren't equal, then skip the next line
                {
                  

                }
               
              }
            }

         }
         
         
       
         
         
                    
        }
        
        
    
        
        i++;//end of while loop

        
        
       
        
  }
  
}