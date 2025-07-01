import java.util.*;
public class BANK
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("WELCOME TO SWIFT BANK");
        System.out.print("Enter your Choice: "+"\n1 for KYC."+"\n2 for Savings Account."+"\n3 for Fixed Deposit."+"\n4 for Reccuring Deposit."+"\n5 for Mutual Fund.\n");
        System.out.print("Your Choice: ");
        int z=in.nextInt();
        switch(z)
        {
            case 1: //KYC
                System.out.println("Enter Name and Address: ");
                String nam=in.nextLine();
                String ad=in.nextLine();
                System.out.println("Enter Aadhaar Card Number: ");
                long acn=in.nextLong();
                System.out.println("Enter PAN Card Number: ");
                String pan=in.next();
                System.out.println("Enter Phone Number: ");
                long ph=in.nextLong();
                System.out.print("\nName and Address: "+ad+"\nAadhaar Card Number: "+acn+"\nPAN Card Number: "+pan+"\nPhone Number: "+ph); 
                break;
                
            case 2: //Savings Account
                System.out.print("Enter Initial Balance: ");
                float inbal=in.nextFloat();
                System.out.print("Enter Amount Deposited: ");
                float dep=in.nextFloat();
                System.out.print("Enter Amount Withdrawn: ");
                float wd=in.nextFloat();
                inbal=inbal+dep-wd;
                System.out.print("\nAmount Deposited: "+dep+"\nAmount Withdrawn: "+wd);
                System.out.print("\nNew Account Balance: "+inbal);
                break;
                
            case 3: //Fixed Deposit
                System.out.print("Enter the Principal Amount: ");
                float pdep=in.nextFloat();
                System.out.print("Enter the Number of Years of Fixed Deposit: ");
                int yr=in.nextInt();
                System.out.print("Enter the Year of Deposition: ");
                int yd=in.nextInt();
                int ymat=yd+yr;
                System.out.print("Enter the Rate of Interest: ");
                float rfd=in.nextFloat();
                double afd= pdep+pdep*((1+rfd/100)*yr-1);
                System.out.print("\nPrincipal Amount: "+pdep+"\nNumber of Years: "+yr+"\nYear of Deposition: "+yd+"\nRate of Interest: "+rfd);
                System.out.print("\nMaturity Amount: "+afd+"\nYear of Maturity: "+ymat);
                break;
                
            case 4: //Recurring Deposit
                System.out.print("Enter Savings Account Balance: ");
                float svngs=in.nextFloat();
                System.out.print("Enter the Fixed Monthly Amount: ");
                float rdamt=in.nextFloat();
                System.out.print("Enter the Number of Quarters: ");
                int qrts=in.nextInt();
                int years=qrts/4;
                System.out.print("Enter the Rate Of Interest: ");
                float raterd=in.nextFloat();
                double rdint=rdamt*Math.pow((1+(raterd/qrts)),(qrts*years));
                System.out.print("\n\nInitial Account Balance: "+svngs+"\nFixed Monthly Amount: "+rdamt+"\nNumber of Quarters: "+qrts+"\nTenure: "+years+" years"+"\nRate of Interest: "+raterd);
                System.out.print("\nSavings Account Balance after Tenure is over: "+(svngs+rdint));
                break;
                
            case 5: //Mutual Fund
                System.out.print("Enter Monthly Investment Amount: ");
                float mfamt=in.nextFloat();
                System.out.print("Enter Rate of Return: ");
                float mfr=in.nextFloat();
                System.out.print("Enter the Number of Months to be invested: ");
                int mfmon=in.nextInt();
                double matmf=mfamt*(((1+mfr)*mfmon-1)*(1+mfr)/mfr);
                System.out.print("\nMonthly Investment: "+mfamt+"\nRate of Return: "+mfr+"\nInvestment Period: "+mfmon+" months"+"\nReturn Amount: "+matmf);
                break;
                
            default: //Default Case
                System.out.print("Invalid Input. Please Enter Again");
            }
        System.out.print("\nVisit Again");    
        }
    }
    