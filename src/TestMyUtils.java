public class TestMyUtils
{
    public static void main(String[] args)
    {
        //region Δημιουργία πίνακα και εισαγωγή φοιτητών
        Foititis[] MyStudentArray = new Foititis[10];
        MyStudentArray[0]=new Foititis("Jadinee","Hinton", (short) 2,2020);
        MyStudentArray[1]=new Foititis("Brette","Paterson", (short) 3,2022);
        MyStudentArray[2]=new Foititis("Sumaya","Boyd", (short) 4,2023);
        MyStudentArray[3]=new Foititis("Serenitry","Wallis", (short) 6,2022);
        MyStudentArray[4]=new Foititis("Keyan","Dunne", (short) 9,2021);
        MyStudentArray[5]=new Foititis("Said","Lindsey", (short) 10,2021);
        MyStudentArray[6]=new Foititis("Dilan","Curran", (short) 1,2021);
        MyStudentArray[7]=new Foititis("Samad","Wilkinson", (short) 5,2021);
        MyStudentArray[8]=new Foititis("Gianni ","Mcnamara", (short) 7,2019);
        MyStudentArray[9]=new Foititis("Glyn","Moreno", (short) 8,2017);
        //endregion

        //region Αναζήτηση Φοιτητή Με Σειριακή αναζήτηση
        System.out.println("-------------- Αναζήτηση Φοιτητή Με Σειριακή αναζήτηση------------");

        System.out.print("Πληκτρολογίστε επώνυμο για αναζήτηση: ");
        String SearchLastName = UserInput.getString();

        if(MyUtils.anazitisiMeEpwnymo(MyStudentArray,SearchLastName)==-1)
        {
            System.out.println("Δέν Βρέθηκε φοιτητής με αυτό το επώνυμο.");
        }
        else
        {
            System.out.print("Ο Φοιτητής Βρέθηκε στοιχεία φοιτητή: ");
            System.out.println(MyStudentArray[MyUtils.anazitisiMeEpwnymo(MyStudentArray,SearchLastName)].toString());
        }
        //endregion

        //region Ταξινόμηση Πίνακα
        MyUtils.bubbleSort(MyStudentArray); //Για να λειτουργήσει η δυαδική αναζήτηση πρώτα ταξινομώ τον πίνακα
        //endregion

        //region Αναζήτηση Φοιτητή Με Δυαδική αναζήτηση

        System.out.println("\n-------------- Αναζήτηση Φοιτητή Με Δυαδική αναζήτηση------------");

        System.out.print("Πληκτρολογίστε αριθμό μητρώου για αναζήτηση: ");
        Short SearchByAM = UserInput.getShort();

        if(MyUtils.anazitisiMeArMitrwou(MyStudentArray,SearchByAM)==-1)
        {
            System.out.println("Δέν Βρέθηκε φοιτητής με αυτόν τον αριθμό μητρώου.");
        }
        else
        {
            System.out.print("Ο Φοιτητής Βρέθηκε στοιχεία φοιτητή: ");
            System.out.println(MyStudentArray[MyUtils.anazitisiMeArMitrwou(MyStudentArray,SearchByAM)].toString());
        }
        //endregion

        //region Αναζήτηση Φοιτητή Με Δυαδική αναζήτηση Αναδρομή
        System.out.println("\n-------------- Αναζήτηση Φοιτητή Με Δυαδική αναζήτηση Αναδρομή------------");

        System.out.print("Πληκτρολογίστε αριθμό μητρώου για αναζήτηση: ");
        SearchByAM = UserInput.getShort();

        if(MyUtils.anadromiAnazMeArithMitrwou(MyStudentArray,0,MyStudentArray.length-1,SearchByAM)==-1)
        {
            System.out.println("Δέν Βρέθηκε φοιτητής με αυτόν τον αριθμό μητρώου.");
        }
        else
        {
            System.out.print("Ο Φοιτητής Βρέθηκε στοιχεία φοιτητή: ");
            System.out.println(MyStudentArray[MyUtils.anadromiAnazMeArithMitrwou(MyStudentArray,0,MyStudentArray.length-1,SearchByAM)].toString());
        }
        //endregion
    }
}
