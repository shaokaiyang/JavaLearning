package BasicKnowledgeLearning;

public class BasicKnowledgeMain{

    public static void main(String[] args) {
        System.out.println("Hello Java! Let's starting ! Though Java is complex, I like it .");
        {
            JavaBasic javaBasic = new JavaBasic();
            javaBasic.printBasicType();
            javaBasic.printOperator();
            javaBasic.printVariables();
        }
        {
            ProcessControl processControl = new ProcessControl();
            processControl.printIfAndSwitch();
            processControl.printWhile();
            processControl.printFor();
        }
        
    }
}
