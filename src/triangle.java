public class triangle {
    public static void main(String[] args) {
        int n = 4;
        for(int row=1;row<=n;row++)
        {

            for(int space=1;space<=n-row;space++)

            {
                System.out.print(" ");
            }
                for(int col=1;col<=row*2-1;col++)
                {
                    if(row==1 || row==n||col==1 || col==row*2-1)
                        System.out.print( "*");
                    else

                        System.out.print(" ");
                }
            System.out.println(" ");
            }
        }
        }


