public class Square extends Shape{
    private int side;

    public Square(int side)
    {
        this.side = side;
    }

    public String draw()
    {
        String string = "";
        for(int i = 0; i < this.side; i++)
        {
            if(i == 0 || i == this.side - 1)
            {
                for(int j = 0; j < this.side; j++)
                {
                    string +="*";
                }
            }
            else 
            {
                for(int j = 0; j < this.side; j++)
                {
                    if (j == 0 || j == this.side - 1)
                    
                        string +="*";
                    
                    else
                    
                        string +=" ";
                    
                }

                string +="\n";
            }

        }
        return string;
    }
}
