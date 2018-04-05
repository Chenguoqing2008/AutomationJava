package java.java8Exercise;

public class ThisReference {

    public void doProcess(int i, Closure.Process process) {

        process.process(i);
    }

    public void execute() {

        doProcess(2, i -> {
            System.out.println("parameter is : " + i);
            System.out.println(this);
        });

    }

    public static void main(String[] args) {

        ThisReference thisReference = new ThisReference();
        thisReference.doProcess(10, new Closure.Process() {
            @Override
            public void process(int i) {
                System.out.println("Process print int " + i);
                System.out.println(this);
            }

            public String toString() {
                return "This reference refer to instance.";
            }
        });

        //this won't work
//        thisReference.doPr cocess(2,i->{
//            System.out.println("parameter is : " + i);
//            System.out.println(this);
//        });

        thisReference.execute();
    }

    public String toString() {

        return "this reference is called inside a method.";
    }

}
