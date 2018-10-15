package BasicKnowledgeLearning;

class MyException extends Exception{
    String message;
    public MyException(String ErrorMessage){
        message = ErrorMessage;
    }
    public String getMessage(){
        return message;
    }
}

public class ImportantProcess {

    public void printException(){
        try{
            String str = "lili";
            System.out.println(str + "的年龄是：");
            int age = Integer.parseInt("20K");
            System.out.println(age);
        }catch (Exception e){
            //getMessage():输出错误性质；toString():给出异常的类型与性质；printStackTrace():指出异常的类型、性质
            //栈层次及出现在程序中的位置；
            e.printStackTrace();
        }
        System.out.println("Program error");
        //finally语句块
        //无论程序中是否存在异常都会执行finally语句块，除非finally中存在异常、程序在之前推出、线程死亡、关闭CPU
    }

    static int quotient(int x , int y)throws MyException{
        if(y < 0){
            throw new MyException("除数不能为负数");
        }
        return x/y;
    }
    public void testExceptionCache(){
        try {
            int result = quotient(3, -1);
        }catch (MyException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
