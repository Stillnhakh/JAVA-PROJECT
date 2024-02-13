
package Project;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int i,j,op;
        Scanner sc = new Scanner(System.in);
        Subject subject = new Subject();
        Student student = new Student();
        Date_Time datetime = new Date_Time();
        ExamTimeTableGenerator examtimetable = new ExamTimeTableGenerator();
        do{
            
                System.out.println("\n=========>> OPTION <<=========");
                System.out.println("[1] ---> InputData");
                System.out.println("[2] ---> GenderatExamTimeTable");
                System.out.println("[3] ---> Update");
                System.out.println("[4] ---> Exit Program");
                System.out.print("Please Choose Option = "); op = sc.nextInt();
                switch(op)
                {
                    case 1->{
                        int op1;
                         do{
                                
                                System.out.println("\n=========>> OPTION <<=========");
                                System.out.println("[1] ---> Input Subject");
                                System.out.println("[2] ---> Input Date And Time");
                                System.out.println("[3] ---> Input Student");
                                System.out.println("[4] ---> Back");
                                System.out.print("Please Choose Option = "); op1 = sc.nextInt();
                                switch(op1)
                                {
                                    case 1->{
                                        
                                              subject.Input();
                                            
                                    }
                                    case 2->{
                                        
                                            datetime.Inputdate();
                                            datetime.Inputtime();
                                            
                                    }
                                    case 3->{
                                            
                                        student.Input();
                                        
                                        
                                    }
                                    case 4->{
                                        
                                        System.err.println("\tBACK TO MAIN OPTOIN");
                                    }
                                    default -> System.out.println("No Option.......");
                                   
                                }
                         
                         }while(op1!=4);
                    }
                    case 2->{
                        
                         if(Student.studentlist.size()==0 || Subject.subjectlist.size()==0 || Date_Time.examdatelist.size()==0 || Date_Time.examtimelist.size()==0)
                        {
                            System.err.println("\t Please Input Data.....!!");
                        }
                        else
                        {
                            examtimetable.date();
                            examtimetable.Header();
                            examtimetable.generatTimeTable();
                            student.checkUnavailableStudent();
                            
                        }
                          
                    }
                    case 3->{
                       
                         int op1;
                         do{
                                
                              
                                System.out.println("====>> OPTION <<=====");
                                System.out.println("1. Update Student");
                                System.out.println("2. Update Subject");
                                System.out.println("3. Update Exam Day And ExamTime");
                                System.out.println("4. Update ExamTimeTable");
                                System.out.println("5. Back");
                                System.out.print("Please Choose Option = "); op1 = sc.nextInt();
                                switch(op1)
                                {
                                    case 1->{}
                                    case 2->{}
                                    case 3->{}
                                    case 4->{}
                                    default->System.err.println("\t BACK TO MAIN OPTION");
                                
                                }
                          }while(op!=5);
                     }
                    
                    case 4->{ 
                       System.exit(0);
                    }
                    default ->  System.err.println("Invalid option. Please choose a valid option.");
                   
                }
        }while(op!=0);    
    }
    
    
}
