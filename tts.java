
/*
class tts{
    public static void main(String[] args)
    {
        System.out.println(sum(new int[]{1,2,3,4}));
    }
    public static int sum(int[] x)
    {
            int sum=0;
        for(int x1:x)
        {
            sum+=x1;
        }
            return sum;
    }
}
element level promotions are not applicable to array level promotions 
in case of object type child type can be assigned parent level 
class tts{
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,6,7,8};
        int[] b = {9,0};
        a=b;
        b=a;
        for(int x1:b)
        {
        System.out.println(x1);
        }
    }
}

class tts{
    public static void main(String[] args)
    {
        String[] argh={"a","b"};
        args = argh;
        for(String s1:args)
        {

        System.out.println(s1);
        }
    }
}
class tts{
    public static void main(String[] args)
    {
        System.out.println(sum(new int[]{1,2,3,4}));
    }
}
class tts{
    public static void main(String[] args)
    {
        String[] argh={"a","b"};
        for(String s1:args)
        {

        System.out.println(s1);
        }
    }
}
default value for the boolean variables is False
class tts{
    int i=10;
    public static void main(String[] args)
    {
        tts t1 = new tts();
        //System.out.println(i);
        System.out.println(t1.i);
        t1.display();
    }
    public void display(){
        System.out.println(i);
    }

}
class tts
{
        static int i=23;
    public static void main(String[] args)
    {
        tts t1 = new tts();
        System.out.println(t1.i);
        System.out.println(tts.i);
    }
}

class tts
{
    int x=45;
    static int y=23;
    public static void main(String[] args)
    {
        tts t1 = new tts();
        tts t2 = new tts();
        t1.x=11;
        t1.y=22;
        System.out.println(t2.x+"----"+t2.y);
        
    }
}

class tts
{
    public static void m1(int[]... x)
    {
        for(int[] a:x)
        {
            System.out.println(a[0]);
        }
    }
    public static void main(String[] args)
    {
        int[] l={1,2,3,4,5,6};
        int[] m={7,8};
        m1(l,m);
    }    
}
class tts
{
    public static final synchronized strictfp  void main(String... args)
    {
        System.out.println("valid main method ");
    }
}
class child extends tts
{

}
class tts 
{
    public static void main(String[] args)
    {
        System.out.println("main method");

    }
    static{
        System.out.println("static method");
        System.exit(0);
    }
}
class tts
{
    public static void main(String[] args)
    {
        int x=10 , y=15;
        if(++x< 10 && (x/0)>10){
            System.out.println("hii");
        }
        else{
            System.out.println("bye");;
        }
    }
}
class tts 
{
    public static void main(String[] args)
    {
        byte a=10,b=20;
        byte c=(a>b)?(byte)50:(byte)60;
        System.out.println(c);
    }
}
class tts
{
    public static void main(String[] args)
    {
        System.out.println(m1(1)+m1(2)*m1(3)/(m1(4)*m1(5))+m1(6));
    }
    public static int m1(int i)
    {
        System.out.println(i);
        return i;
    }
}

class tts
{
    public static void main(String[] args)
    {
        int i=1;
        i+= ++i + i++ + ++i + i++;
        System.out.println(i);
    }
 
}
class tts
{
    public static void main(String[] args)
    {
        int x=1;
        final inty=2;

        switch(x)
        {
            case 1:
                    System.out.println("one one");
            case y:
                    System.out.println("variable expression ");


        }
    }
}
class tts 
{
    public static void main(String[] args)
    {
        final int a=10,b=20;
        while(a<b)
        {
            System.out.println("tis is infinite times");
        }
        System.out.println("if the variables are final or remians uncanged argument unreachable stmt");
    }
}

class tts 
{
    public static void main(String[] args)
    {
            int i=3;
            do{
                System.out.println("do while loop");
                i++;
            }while(i<5);
    }
}
class A
{
    public static void main(String[] args)
    {
        System.out.println("A class main method will be executed");
    }
}

class B
{
    public static void main(String[] args)
    {
        System.out.println("B class main method will be executed");
    }
}

class C
{
    public static void main(String[] args)
    {
        System.out.println("C class main method will be executed");
    }
}

class D
{
    public static void main(String[] args)
    {
        System.out.println("D class main method will be executed");
    }
}
import java.util.ArrayList;
class hack extends java.util.ArrayList
{
    public static void main(String[] args)
    {
        ArrayList l = new ArrayList();
    }
}

import java.util.Date;
import java.sql.*;
class hack
{
    public static void main(String[] args)
    {
        Date l = new Date();
        System.out.println(Math.sqrt(4));
    }
}

class hack
{
    static String name = "rama";
    public static void main(String[] args)
    {
         System.out.println("main");
    }
}
class java extends hack
{
    public static void main(String[] args)
    {
        System.out.println(hack.name.length());
    }
}
public default final abstract strictfp private protected static
import static java.lang.Byte.*;
private class hack{
    public static void main(String[] args)
    {
        System.out.println(MAX_VALUE);
    }
}
package pack1;
public class hack
{
    public void m1()
    {
        System.out.println("test calss m1 method will be executed");
    }
    
}
package pack2;
import pack1.hack;
class test
{
    public static void main(String[] args)
    {
        hack h = new hack();
        h.m1(); 
    }
}

class parent{
    public void property()
    {
        System.out.println("land ,gold, money");
    }
    public final void marriage()
    {
        System.out.println("subalakshmi");
    }
}
class child extends parent
{
    public void marriage(){
        System.out.println("thamman11");
    }
}

class tts 
{
    public static void main(String[] args)
    {
            do while(true) System.out.println("hiii");
    }
}
abstract class vehicle 
{
    public abstract int getNo();
}
class bus extends vehicle
{
    public int getNo()
    {
        return 7;
    }
}

abstract class test{
    public static void main(String[] args)
    {
        test t = new test();

    }
}
class tts{
    public void m1();
}
abstract class tts{
    public abstract void m1();
    public abstract void m2();
}
abstract class child extends tts
{
    public void m1(){}
}
class tts
{
    final int i;
   {
       i=10;
   }
}

class tts
{
    final static int i;
}

class tts
{
    final static int i;
   static
   {
       i=10;
   }
}
class tts
{
    public static void main(String[] args)
    {
       int i;
       System.out.println("grehekko"+i);
   }
}
interface Interf
{
    int x=10;
}
class tts implements Interf
{
    public static void main(String[] args)
    {
        int x=100;
        System.out.println("valuesz of x :"+x);
    }
}
interface left
{
    int x=10;
}
interface right
{
    int x=30;
}
class tts implements left,right
{
    public static void main(String[] args)
    {
        // System.out.println("valuesz of x :"+x);
        System.out.println("valuesz of x :"+left.x);
        System.out.println("valuesz of x :"+right.x);
    }
}

import java.util.regex.*;
class tts
{
    public static void main(String[] args)
    {
        int c=0;
        Pattern p = Pattern.compile("[^a-z]");
        // Pattern p = Pattern.compile("[a-z]");
        // Pattern p = Pattern.compile("[abc]");
        // Pattern p = Pattern.compile("[^abc]");
        Matcher m = p.matcher("ab[x(");
        while(m.find())
        {
            c++;
            System.out.println(m.start()+"---"+m.end()+"---"+m.group());
        }
        System.out.println("the total no of occurences: "+c);
    }
}
import java.util.regex.*;
class tts 
{
    public static void main(String[] args)
    {
        //Pattern p = Pattern.compile("[a-zA-z][a-zA-Z0-9-$]+");
        //Pattern p = Pattern.compile("[7-9][0-9]{9}");
        //Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-z]+)+");
        Matcher m = p.matcher(args[0]);

        if(m.find()&&m.group().equals(args[0]))
        {
            System.out.println("valid identifier");
        }else{
            System.out.println("invalid idemntifier");
        }
    }
class tts
{
    public static void main(String[] args)
    {
        int n=100,c=0,k=0;
        for(int i=2;i<n;i++)
        {   
            c=0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
                if(c<=1)
                {
                    k++;
                }
        }
                    System.out.println(k);
    }
}
class tts
{
    public static void main(String[] args)
    {
        int[] a={2,1,4,3,6};
        int t=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
import java.util.Scanner;
class tts 
{
    public static void main(String[] args)
    {
        int i=0,j=0,n=5,t=0;
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=1;j<n-i;j++)
            {
                if(a[j]<a[j-1])
                {
                    t=a[j];
                    a[j]=a[j-1];
                    a[j-1]=t;
                }
            }
        }
        System.out.println("sorted array");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        
    }
}
class tts 
{
    public static void main(String[] args)
    {
        int i=0,j=0,n=10;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(j==0&&i>=n/2)
                {
                    System.out.print("*");
                    
                }
                if(i<n/2 && (i==0 || i==n/2-1 || j==0 || j==n-1))
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
class tts 
{
    public static void main(String[] args)
    {
        // int[] a = new int[10];
        int[] a = {1,2,1,3,5};
        int i=0;j=0,c=0,count=0,sum=0
        for(i=0;i<n;i++)
        {
            if
        }
    }
}
import java.util.Scanner;
class tts 
{
    public static void main(String[] args)
    {
        int i=0,n=11,beg=0,end=n-1,mid=0,pos=-1;
        int[] a={0,1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
         int ele =sc.nextInt(); 
       while(beg<=end)
        {
            mid=(beg+end)/2;
            if(ele==a[mid])
            {
                pos=mid;
                System.out.println("found"+mid);
                beg=1;
                end=0;
            }else if(ele<a[mid])
            {
                end=mid-1;
            }else if(ele>a[mid]){
                beg=mid+1;
            }
        }
        if(pos==-1)
        {
            System.out.println("ele not found at "+pos);
        }
       
    }
}
//by the object reference also we can call static variables ,local var are accessd by only one thread at a time  object refrence can be used to store the primary addrress of the object normal method will get the chance first then the var arg parameter int[]... x will became the 2d array (final ,synchronized ,strictfp) are the modifiers applicable for main method 
// inheritence concept applicable for main() method also ,overloading of main method wioll also be possible but jvm will call only sstring type argment method only
//oerridingof main method will also be possible but it is called method hiding
//space is an operator to separate the two command linesn if our commad itself contains space we should be enclosed in double quotres
class tts 
{
    public static void m1(int[]... x)
    {
        for(int[] x1:x)
        {
            System.out.println(x1[0]);
        }
    }
    public static void main(String[] args)
    {
   int[] l={1,2,3};
   int[] m={4,5};
   m1(l,m);
    }
}
import java.util.Scanner; 
class tts 
{
    public static void main(String[] args)
    {
        
        int i=0,count=0,sum=0,j=0,c=0,d=0,m=0,n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of ele");
        n=sc.nextInt();
        int[] a = new int[100];
        System.out.println("enter  ele of an array");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter date");
        d=sc.nextInt();
        System.out.println("enter a month");
        m=sc.nextInt();
        for(i=0;i<n;i++)
        {
           sum+=a[i];
           c+=1;
           if(sum==d && c==m)
           {
                System.out.println(a[i-1]+"_ "+a[i]);      
               count++;
               sum=0;
               c=0;
               if(i<=m)
               {
               i=i-(m-1);
               }
               else
               {
                   i=i-m;
               }
           }
        }
         System.out.println("hrllo");
         System.out.println(count);
    }
}
import java.util.Scanner; 
class tts 
{
    public static void main(String[] args)
    {
        
        int i=0,count=0,sum=0,j=0,c=0,d=0,m=0,n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of ele");
        n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter  ele of an array");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter date");
        d=sc.nextInt();
        System.out.println("enter a month");
        m=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i;j<m+i && j<n;j++)
            {
                sum+=a[j];
            }
            if(sum==d)
            {
                System.out.println(a[j-1]+"_"+a[j]);
                count++;
                sum=0;
            }
        }

 
         System.out.println("hrllo");
         System.out.println(count);
    }
}
//printing of prime numbers alternatively
class tts
{
    public static void main(String[] args)
    {
        int i=0,j=0,c=0,n=45;
        for(i=2;i<n;i++)
        {
            boolean b = isPrime(i);
            if(b)
            {
                if(c==0)
                {
                System.out.println(i);
                c++;
                }else if(c==1)
                {
                    c--;
                }
            }
        }


    }
    public static boolean isPrime(int k)
    {
        for(int j=2;j<=k/2;j++)
        {
            if(k%j==0)
            {
                return false;
            }
        }
        return true;

    }
}
// sum of fibonnaci series 
class tts
{
    public static void main(String[] args)
    {
        int i=0,j=1,y=0,k=0,c=5,sum=0;
        System.out.println(i);
        System.out.println(j);
        while(k<c)
        {
            sum=i+j;
            System.out.print(sum+"\t");
            y+=sum;
            i=j;
            j=sum;
            k++;
        }
            System.out.println();
            System.out.println("sum is:"+y);

    }
}
//printing of 123 in rotating manner 
class tts
{
    public static void main(String[] args)
    {
        int i=0,j=1,y=0,k=0,c=1,n=5,sum=0;
        System.out.println(i);
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
               if(i%2==0)
               {
                System.out.print(c+"\t");
                  c++;
               }else{
                   
                   if(j==0) c=c+n-1;
                System.out.print((c-j)+"\t");
                   if(j==n-1) c++;
               }
            }
            System.out.println();
        }
    }
}
//square shaped 
class tts
{
    public static void main(String[] args)
    {
        int i=0,j=1,y=0,k=0,c=1,n=7,sum=0;
        System.out.println(i);
        k=n/2;
        for(i=0;i<n;i++)
        {
            if(i<=k)
            {
            for(j=0;j<n;j++)
            {
                if(j==k-i || j==k+i || i==k ||((i>k) && (j==k-n%(i+1)) || (j==k-n%(i+1)))) System.out.print("*\t");
                else    
                System.out.print(" \t");
            }
            }
            else{
                for(j=0;j<n;j++)
                {
                    if(j==k-n%(i+1) || j==k+n%(i+1))
                        System.out.print("*\t");
                    else
                        System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
// v shaped pattern
class tts
{
    public static void main(String[] args)
    {
        int i=0,j=1,y=0,k=0,c=1,h=0,n=7,sum=0;
           System.out.println(i);
           h=n/2+1;
           for(i=0;i<h;i++)
           {
               for(j=0;j<n;j++)
               {
                   int sum1=2*(i+1)-i-1;
                   int sum2=n-(2*(i+1)-i);
                   if(j<sum1 || j>sum2) {
                   System.out.print("*\t");
                   }    
                   else
                   {
                    System.out.print(" \t");
                   }
               }
                    System.out.println();
           }
    }
}
*/
import java.util.Scanner; 
class tts 
{
    public static void main(String[] args)
    {
        
        int i=0,count=0,sum=0,j=0,c=0,d=0,m=0,n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of ele");
        n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter  ele of an array");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter date");
        d=sc.nextInt();
        System.out.println("enter a month");
        m=sc.nextInt();
       for(i=0;i<n-m+1;i++)
       {
            sum=0;
           for(j=0;j<m;j++)
           {
               sum+=a[i+j];
           }
           if(sum==d)
          {
              System.out.println();
               count+=1;
           }
       }
 
         System.out.println("hrllo");
         System.out.println(count);
    }
}
