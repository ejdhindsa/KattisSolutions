// import statements
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvable
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int length  = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder(br.readLine());

        int minOps = 2;

        if (length == 1) {

            if (sb.charAt(0) == 'l' || sb.charAt(0) == 'v')
                System.out.println("1");
            else
                System.out.println("2");
            return;

        } // end of if

        for (int i = 0; i < length - 1; i++)
        {
            if (sb.charAt(i) == 'l' && sb.charAt(i + 1) == 'v')
            {
                minOps = 0;
                break;
            }
        }

        if (minOps == 2)
        {
            for(int i=0; i < length - 1; i++)
            {
                char c1 =  sb.charAt(i);
                char c2 =  sb.charAt(i+1);

                if ((c1 == 'l') || (c2 == 'v') || (c1 == 'v' && c2 == 'l')) {
                    minOps = 1;
                    break;
                }

            } // end of for
        }

        if (minOps == 2)
        {
            for (int i = 0; i < length - 2; i++) {
                if (sb.charAt(i) == 'l' && sb.charAt(i + 2) == 'v') {
                    minOps = 1;
                    break;
                }
            }
        }

        System.out.println(minOps);

    }  // end of main

} // end of class

