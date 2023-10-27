public class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public String draw()
    {
        String string = "";
        for (int i = 0; i < this.width; ++i) {
            if (i == 0 || i == this.width - 1) {
                for (int j = 0; j < this.length; ++j) {
                    string += '*';
                }
            } else {
                for (int j = 0; j < this.length; ++j) {
                    if (j == 0 || j == this.length - 1)
                        string += '*';
                    else
                        string += ' ';
                }
            }
            string += "\n";
        }

        return string;
    }
}
