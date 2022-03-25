public class Foititis
{
    String FirstName;
    String LastName;
    Short AM;
    Integer Year;

    public Foititis(String FirstName_,String LastName_,Short AM_,Integer Year_)
    {
        FirstName=FirstName_;
        LastName=LastName_;
        AM=AM_;
        Year=Year_;
    }

    public void setFirstName(String FirstName_) {
        FirstName = FirstName_;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName_) {
        LastName = LastName_;
    }

    public Short getAM() {
        return AM;
    }

    public void setAM(Short AM_) {
        this.AM = AM_;
    }

    public void setYear(Integer Year_) {
        Year = Year_;
    }

    public Integer getYear() {
        return Year;
    }

    @Override
    public String toString() {
        return "AM: "+(short)AM+"|| Όνομα: "+ FirstName + " Επώνυμο: "+LastName+" Έτος Εισαγωγής: "+Year;
    }
}
