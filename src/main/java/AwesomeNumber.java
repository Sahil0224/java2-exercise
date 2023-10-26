public class AwesomeNumber {
    private int number;

    public AwesomeNumber(int number)
    {
        this.number = number;
    }

    public int getAwesomeNumber()
    {
        return this.number;
    }

    public void setAwesomeNumber(int number)
    {
        this.number = number;
    }


    public static int add(AwesomeNumber number1, AwesomeNumber number2)
    {
        return number1.getAwesomeNumber() + number2.getAwesomeNumber();
    }

    public static int subtract(AwesomeNumber number1, AwesomeNumber number2)
    {
        return number1.getAwesomeNumber() - number2.getAwesomeNumber();
    }
}
