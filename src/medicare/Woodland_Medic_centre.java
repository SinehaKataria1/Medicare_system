
import java.util.Scanner;
class choice1{
    int i=0,j=0,k=0,l=0;
    int telephone,dateofbirth,time,appointEmily=0,appointStephen=0,appointseagal=0,appointlily=0,
             choiceofschedule;
            int doctor;
            String[] emilydetails= new String[7];
            String[] stephendetails= new String[7];
            String[] seagaldetails= new String[7];
            String[] lilydetails= new String[7];
            
            String firstname,surname,countryoforigin,choiceofdoctor,details;
    public void choices(int choice){
        try{
            Scanner sc=new Scanner(System.in);
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the Firstname:");
                    firstname=sc.next();
                    System.out.println("Enter the Surname:");
                    surname=sc.next();
                    System.out.println("Enter the telephone:");
                    telephone=sc.nextInt();
                    System.out.println("Enter the date of birth:");
                    dateofbirth=sc.nextInt();
                    System.out.println("Enter the country of origin:");
                    countryoforigin =sc.next();
                    System.out.println("Enter the time:");
                    time=sc.nextInt();
                    if((time>=1&&time<4)&&(appointEmily>=0&& appointEmily<=7))
                    {
                        if(appointEmily>=0&&appointEmily<=7)
                        {
                            System.out.println("Registered of Dr.Emily likova");
                             ++appointEmily;
                            details=" ";
                            details="Firstname:"+firstname+" "+surname+"\n"+"telephone:"+telephone+"\n"+"Date of birth:"+dateofbirth+"\n"+"Country of origin: "+countryoforigin+"\n"+"Time:"+time+"\nPatient of DR.Emilylikova";
                            emilydetails[i]=details;
                            i++;
                           
                        }
                        else
                        {
                            System.out.println("7 appointment is fixed");
                        }

                    }
                    else if((time>=4&&time<7)&&(appointStephen>=0&& appointStephen<=7))
                    {
                        if(appointStephen>=0&&appointStephen<=7)
                        {
                            System.out.println("Registered of Dr.Stephen Marganic");
                            details=" ";
                            details="Firstname:"+firstname+" "+surname+"\n"+"telephone:"+telephone+"\n"+"Date of birth:"+dateofbirth+"\n"+"Country of origin: "+countryoforigin+"\n"+"Time:"+time+"\nPatient of DR.Stephen Marganic.";
                            stephendetails[j]=details;
                            j++;
                            appointStephen++;
                        }
                        else
                        {
                            System.out.println("7 appointment is fixed");
                        }
                    }
                    else if((time>=7&&time<9)&&(appointseagal>=0&& appointseagal<=7))
                    {
                        
                        if(appointseagal>=0&&appointseagal<=7)
                        {
                            appointseagal++;
                            System.out.println("Registered of Dr.Seagal Handsome");
                            details=" ";
                            details="Firstname:"+firstname+" "+surname+"\n"+"telephone:"+telephone+"\n"+"Date of birth:"+dateofbirth+"\n"+"Country of origin: "+countryoforigin+"\n"+"Time:"+time+"\nPatient of Dr.Seagal Handsome.";
                            seagaldetails[k]=details;
                            k++;
                        }
                        else
                        {
                            System.out.print("7 appointment is fixed");
                        }
                    }
                    else if((time>=9&&time<=12)&&(appointlily>=0&& appointlily<=7))
                    {
                        if(appointlily>=0&&appointlily<=7)
                        {
                            appointlily++;
                            details=" ";
                            details="Firstname:"+firstname+" "+surname+"\n"+"telephone:"+telephone+"\n"+"Date of birth:"+dateofbirth+"\n"+"Country of origin: "+countryoforigin+"\n"+"Time:"+time+"\nPatient of Dr.lily Win";
                            lilydetails[l]=details;
                            l++;
                            System.out.println("Registered of Dr.lily Win");
                        }
                        else
                        {
                            System.out.println("7 appointment is fixed");
                        }
                    }
                    else
                    {
                        System.out.println("No Available doctor");
                    }
                    break;
                case 2:
                    System.out.println("1.Dr.Emily likova");
                    System.out.println("2.Dr.Stephen Marganic");
                    System.out.println("3.Dr.Seagal Handsome");
                    System.out.println("4.Dr.lily Win");
                    System.out.println("Please enter an option");
                    doctor=sc.nextInt();
                    if(doctor==1)
                    {
                        System.out.println("Cancelled appointment of Dr.Emily likova");
                        if(appointEmily>0)
                           appointEmily--;
                    }
                    else if(doctor==2)
                    {
                       System.out.println("Cancelled appointment ofDr.Stephen Marganic ");
                       if(appointStephen>0)
                        appointStephen--;
                    }
                    else if(doctor==3)
                    {
                      System.out.println("Cancelled appointment of Dr.Seagal Handsome");
                      if(appointseagal>0)
                        appointseagal--;
                    }
                    else if(doctor==4)
                    {
                       System.out.println("Cancelled appointment of Dr.lily Win");
                       if(appointlily>0)
                          appointlily--;
                    }
                    else
                    {
                        System.out.print("No available doctor");
                    }
                    break;
                case 3:
                    System.out.println("1.Every Schedule of doctor");
                    System.out.println("2.Specific Schedule of doctor");
                    choiceofschedule=sc.nextInt();
                    switch(choiceofschedule)
                    {
                        case 1:
                            System.out.println("Dr.Emily likova");
                            System.out.println("Registered appointment in current day is "+appointEmily );
                            System.out.println("Dr.Stephen Marganic");
                            System.out.println("Registered appointment in current day is "+appointStephen );
                            System.out.println("Dr.Seagal Handsome");
                            System.out.println("Registered appointment in current day is "+appointseagal );
                            System.out.println("Dr.lily Win");
                            System.out.println("Registered appointment in current day is "+appointlily );
                            break;
                        case 2:
                           System.out.println("1.Dr.Emily likova");
                            System.out.println("2.Dr.Stephen Marganic");
                            System.out.println("3.Dr.Seagal Handsome");
                            System.out.println("4.Dr.lily Win");
                            System.out.println("Please enter an option");
                            doctor=sc.nextInt();
                             if(doctor==1)
                            {
                                System.out.println("Registered appointment in current day is "+appointEmily );

                            }
                             if(doctor==2)
                             {
                                System.out.println("Registered appointment in current day is "+appointStephen );
                            }
                            if(doctor==3)
                            {
                                System.out.println("Registered appointment in current day is "+appointseagal );
                            }
                             if(doctor==4)
                              {
                                System.out.println("Registered appointment in current day is "+appointlily );
                              }
                           
                            break;
                    }
                    break;
                case 4:
                     if(appointEmily==0)
                        {
                             System.out.println("No patients of .Dr.Emily likova");
                        }
                    else{

                        for(int m=0;m<appointEmily;m++)
                        {
                                   System.out.println("Patients:\n"+emilydetails[m]+"\n");
                        }
                    }
                       if(appointStephen==0)
                        {
                             System.out.println("No patients of Dr.Stephen Marganic");
                        }
                        else{
                    for(int m=0;m<appointStephen;m++)
                    {
                       
                        System.out.println("Patients:\n"+stephendetails[m]);
                         }
                    }
                        if(appointseagal==0)
                        {
                             System.out.println("No patients of Dr.Seagal Handsome"+"\n");
                        }
                        else{
                    for(int m=0;m<appointseagal;m++)
                    {
                        
                        System.out.println("Patients:\n"+seagaldetails[m]+"\n");
                         }
                    }
                         if(appointlily==0)
                        {
                             System.out.println("No patients of Dr.lily Win");
                        }
                        else{
                    for(int m=0;m<appointlily;m++)
                    {
                        
                        System.out.println("Patients:\n"+lilydetails[m]+"\n");
                         }
                    }
                    break;

                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.print("notvalid");

            }


        }
        catch(Exception e)
        {
            System.out.print("Exception");
        }
    }


}
public class Woodland_Medic_centre {
    public static void main(String[] args) {
        // TODO code application logic here
        
        int choice;
        Scanner sc=new Scanner(System.in);
        
        choice1 ch=new choice1();
        do{
        System.out.println("*********************");
        System.out.println("*      MEDICARE     *");
        System.out.println("*********************");
        System.out.println("1. Book an appointment.");
        System.out.println("2. Cancel an appointment.");
        System.out.println("3. View a doctor's schedule.");
        System.out.println("4. View patient's appointment.");
        System.out.println("5. Exit.");
        System.out.println("Please enter an option.");
         choice=sc.nextInt();
        ch.choices(choice);
        }while(choice!=5);





    }

}
