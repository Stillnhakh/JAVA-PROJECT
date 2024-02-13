
package Project;
import java.util.ArrayList;
import java.util.Scanner;
public class Date_Time {
    public int dayofexam;
    public String examdate;
    public String examtime;
    Scanner sc = new Scanner(System.in);
    static ArrayList<String> examdatelist = new ArrayList<>();
    static ArrayList<String> examtimelist = new ArrayList<>();
    public int getDayofexam() {
        return dayofexam;
    }
    public String getExamdate() {
        return examdate;
    }
    public String getExamtime() {
        return examtime;
    }
    public Date_Time() {
    }
    public Date_Time(int dayofexam, String examdate, String examtime) {
        this.dayofexam = dayofexam;
        this.examdate = examdate;
        this.examtime = examtime;
    }
    void Inputdate()
    {
      
       
        System.out.print("Input Day Of Exam = "); dayofexam = sc.nextInt(); sc.nextLine();
        for(int i = 0;i<dayofexam;i++)
        {
            System.out.print("Input Exam Date ["+(i+1)+"] :");examdate = sc.nextLine();
            examdatelist.add(examdate);
        }
    
    }
    
    void showdate()
    {
            for(int i=0;i<examdatelist.size();i++)
            {
                System.out.print(examdatelist.get(i)+"\t");
            }
    
    }
    void Inputtime()
    {
         for(int i=0;i<4;i++)
        {
            System.out.print("\nInput ExamTime["+(i+1)+"] :"); examtime = sc.nextLine();
            examtimelist.add(examtime);
        }
    
    }
    void showTime()
    {
        for(int i=0;i<examdatelist.size();i++)
        {
            System.out.print(examdatelist.get(i)+"\t");
        }
    }
    
}
