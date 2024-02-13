
package Project;
public class ExamTimeTableGenerator {
    Subject subject = new Subject();
    Student student = new Student();
    Date_Time datetime = new Date_Time();
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String BOLD = " \\u001B[1m";
    String day[]={"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FIRDAY","SARTUDAY","SUNDAY"};
    void date()
    {
         System.err.println( CYAN + "\t EXAM SESSION  " + Date_Time.examdatelist.get(0));
    
    }
    public void Header()
    {
        System.out.print(GREEN+"TIME\t\t");
        for(int i=0;i<Date_Time.examdatelist.size();i++)
        {
             System.out.print(day[i]+"\t\t");
        }
        System.out.println("");

    }
    public void generatTimeTable() {
        int j = 4;
        int k = 8;
            // Iterate through time slots
            for (int i = 0; i < Date_Time.examtimelist.size(); i++) {
                // Print time slot
                System.out.print(Date_Time.examtimelist.get(i) + "\t\t");

                // Print subjects for DAY(1)
                if (i < Subject.subjectlist.size()) {
                    System.out.print(Subject.subjectlist.get(i).getName());
                }

                // Print subjects for DAY(2) if available
                if (j + i < Subject.subjectlist.size()) {
                    System.out.print("\t\t" + Subject.subjectlist.get(j + i).getName());
                }
                 // Print subjects for DAY(3) if available
                if (i + k < Subject.subjectlist.size()) {
                    System.out.print("\t\t" + Subject.subjectlist.get(i + k).getName());
                }

                // Move to the next line
                System.out.println();
         }
      
        
}
   
                  
}     
            
            

    

    

