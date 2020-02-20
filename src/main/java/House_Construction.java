class House_Construction
{
    String material_type;
    double total_area;
    String isautomated;
    double total_amount=0.0;
    House_Construction(String m,double t,String a)
    {
        material_type=m;
        total_area=t;
        isautomated=a;
    }
    double total_construction_cost()
    {

        if(material_type.equals("standard"))
        {
            total_amount=1200*total_area;
        }
        else if(material_type.equals("above-standard"))
        {
            total_amount=1500*total_area;
        }
        else if(material_type.equals("high-standard"))
        {
            if(isautomated.equals("yes"))
            {
                total_amount=2500*total_area;
            }
            else
            {
                total_amount=1800*total_area;
            }
        }
            return total_amount;
    }
}
