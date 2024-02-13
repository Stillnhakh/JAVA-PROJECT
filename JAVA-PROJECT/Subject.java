
package Project;
import java.util.ArrayList;
import java.util.Scanner;
public class Subject {
    public String code;
    public String name;
    int n;
    static ArrayList<Subject> subjectlist = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public Subject() {
    }
    public Subject(String code, String name) {
        this.code = code;
        this.name = name;
    }
    void Header()
    {
        System.err.println("CODE\tNAME");
    }
    void Input()
    {
         System.out.print("Input Number Of Subject = "); n = sc.nextInt(); sc.nextLine();
         for(int i=0;i<n;i++)
         {
              
              System.err.println("\t\tSubject["+(i+1)+"]");
              System.out.print("Input Subject Code = "); code = sc.nextLine();
              System.out.print("Input Subject Name = "); name = sc.nextLine();
              subjectlist.add(new Subject(code, name));
         
         }
        
    }
    void Output()
    {
        for(int i=0;i<subjectlist.size();i++)
        {
            System.out.println(subjectlist.get(i).getCode()+"\t"+subjectlist.get(i).getName());
        
        }
    
    }
   
}
