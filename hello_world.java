// Your First Program

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 


        Robot robot = new Robot();

        robot.makeAction();
        robot.makeNoice();
    }
}

class Robot{
        
        void makeAction(){
                System.out.println("I just moved!!!");
        }

        void makeNoice(){
                System.out.println("Bark!");
		System.out.println("Chyba ty");

        }
}