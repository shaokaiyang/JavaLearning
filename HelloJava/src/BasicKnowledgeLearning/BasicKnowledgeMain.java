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
        {
            StringBasic stringBasic = new StringBasic();
            stringBasic.printString();
        }
        {
            int[] arr = new int[]{2,67,45,89,32,15,3};
            ArrayAndSort arrayAndSort = new ArrayAndSort(arr);
            arrayAndSort.sort();
            arrayAndSort.reverseSort();
            arrayAndSort.selectSort();
        }
        {
            InheritancePolymorphism inheritancePolymorphism = new InheritancePolymorphism();
            inheritancePolymorphism.printFinalStatic();
        }
        {
            ImportantProcess importantProcess = new ImportantProcess();
            importantProcess.printException();
            importantProcess.testExceptionCache();
        }
    }
}
