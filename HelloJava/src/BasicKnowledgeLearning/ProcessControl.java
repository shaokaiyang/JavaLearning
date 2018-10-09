package BasicKnowledgeLearning;

/*
1.复合语句
2.if 和 switch
3.while 和 do while
4. for 和 foreach
 */
public class ProcessControl {
    //复合语句
    {
        int processVar1 = 120;
        int processVar2 = 240;
        int processVar3 = processVar1 + processVar2;
        System.out.println("复合语句输出：" + processVar3);
    }

    //if  switch 语句
    public void printIfAndSwitch(){
        int processVar4 = 83;
        //if和else的用法
        System.out.println("条件选择语句输出：");
        if(processVar4 < 60){
            System.out.println("成绩不及格");
        } else if(processVar4 > 90){
            System.out.println("成绩优秀");
        }else{
            System.out.println("成绩合格");
        }
        //对于多分支可以用switch，运行到break停止，default可选
        int processVar5 = 2;
        switch (processVar5){
            case 1:
                System.out.println("今天星期一");
                break;
            case 2:
                System.out.println("今天星期二");
            default:
                System.out.println("今天不星期");
        }
    }

    // while 和 do while
    public void printWhile(){
        int processVar6 = 10;
        int processVar7 = 20;
        System.out.println("while循环语句输出：");
        while(processVar6 < 20){
            processVar7 = processVar7 + processVar6;
            processVar6++;
        }
        System.out.println(processVar7);
        /*
        do{
            processVar2 += processVar1;
            processVar1++;
        }while(processVar1 == 20);
         */
    }

    //for foreach
    public void printFor(){
        int processSum = 0;
        System.out.println("for 循环输出：");
        for(int i = 0; i < 10; i++){
            processSum += i;
            i++;
        }
        System.out.println(processSum);
        /*
        int arr[] = {2,3,5};
        for(int y : arr){
        System.out.println(y);
        }
         */
    }
}
