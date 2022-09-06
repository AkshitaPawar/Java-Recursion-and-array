import java.io.*;
class complex
{
    int real, img;
    BufferedReader br1= new BufferedReader(new InputStreamReader (System.in));
    complex()
   {

   }
    complex(int realnum, int imgnum)
    {
        real=realnum;
        img=imgnum;
    }
    void display()
    {
        System.out.println(real+"+"+" i"+ img);
    }
    complex add(complex o1)
    {
        complex temp;
        temp=new complex();
        temp.real=real+o1.real;
        temp.img=img+o1.img;
        return temp;
    }
    complex sub(complex o1)
    {
        complex temp;
        temp=new complex();
        temp.real=real-o1.real;
        temp.img=img-o1.img;
        return temp;
    }
    complex mul(complex o1)
    {
        complex temp;
        temp=new complex();
        temp.real=real*o1.real;
        temp.img=img*o1.img;
        return temp;
    }
    void input() throws IOException
    {
        System.out.println("Enter the real part: ");
        real=Integer.parseInt(br1.readLine());
        System.out.println("Enter the imaginary part: ");
        img=Integer.parseInt(br1.readLine());
    }
}
public class ComplexNumber
{
    public static void main(String[] args) throws IOException
    {
        complex o1,o2,o3,o4,o5;
        o1=new complex();
        o1.input();
        o1.display();
        o2=new complex();
        o2.input();
        o2.display();
        o3=new complex();
        o3=o1.add(o2);
        System.out.print("The addition is : ");
        o3.display();
        o4 = new complex();
        o4 = o1.sub(o2);
        System.out.print("The subtraction is : ");
        o4.display();
        o5 = new complex();
        o5 = o1.mul(o2);
        System.out.print("The multiplication is : ");
        o5.display();
    }
}
