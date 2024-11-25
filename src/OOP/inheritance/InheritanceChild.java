package OOP.inheritance;

public class InheritanceChild extends InheritanceBase{
    String examSeatNumber;
    String examName;

    public String getExamSeatNumber() {
        return examSeatNumber;
    }

    public void setExamSeatNumber(String examSeatNumber) {
        this.examSeatNumber = examSeatNumber;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    @Override
    public String toString() {
        return "InheritanceChild{" +
                "examSeatNumber='" + examSeatNumber + '\'' +
                ", examName='" + examName + '\'' +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
