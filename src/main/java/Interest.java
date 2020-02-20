import java.lang.Math;
class Interest
{
    double Principle_amount;
    int Time_perid;
    double Rate_of_interest;
    Interest(double p,int t,double r)
    {
        Principle_amount=p;
        Time_perid=t;
        Rate_of_interest=r;
    }

    double simple_interest()
    {
        double amount=Principle_amount*Time_perid*Rate_of_interest;
        return amount/100;
    }

    double compound_interest()
    {
        double amount=Math.pow((1+(Rate_of_interest/100)),Time_perid);
        return Principle_amount*amount;
    }
}
