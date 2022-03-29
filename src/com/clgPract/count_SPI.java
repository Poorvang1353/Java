package com.clgPract;

class student
{
    int id_no, no_of_subjects_registered, subject_credits;
    float spi;
    String subject_code,grade_obtained;
    student(int i, int nsub, int sc, String code, String g)
    {
        id_no = i;
        no_of_subjects_registered = nsub;
        subject_credits = sc;
        subject_code = code;
        grade_obtained = g;
    }
    void calculate_spi()
    {
        int go=0;
        switch(grade_obtained)
        {
            case "AA": go = 10; break;
            case "AB": go = 9; break;
            case "BB": go = 8; break;
            case "BC": go = 7; break;
            case "CC": go = 6; break;
            case "CD": go = 5; break;
            case "DD": go = 4; break;
            case "FF": go = 00; break;
            default : System.out.println("\nInvalid Grade Value.."+grade_obtained); break;
        }
        int total = no_of_subjects_registered*subject_credits;
        spi = (total*go)/total;
        System.out.println("\nID Number: "+id_no+", SPI: "+spi);
    }
}
public class count_SPI
{
    public static void main(String args[])
    {
        int n_student = 3;
        student s_obj[] = new student[n_student];
        s_obj[0] = new student(1, 4, 10, "27374", "AA");
        s_obj[1] = new student(2, 4, 10, "27374", "CC");
        s_obj[2] = new student(3, 4, 10, "27374", "BC");
        for(int i=0; i<n_student; i++)
        {
            s_obj[i].calculate_spi();
        }
    }
}
